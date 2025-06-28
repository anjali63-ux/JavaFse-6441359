CREATE DEFINER=`root`@`localhost` PROCEDURE `TransferFunds`(
    IN sender_id INT,
    IN receiver_id INT,
    IN transfer_amount DECIMAL(6, 2)
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        INSERT INTO ErrorLog (ErrorMessage, ErrorTime)
        VALUES (
            CONCAT('Transfer failed from account ', sender_id, 
                   ' to account ', receiver_id, 
                   ' for amount ', transfer_amount), 
            NOW()
        );
    END;

    START TRANSACTION;

    -- Check if sender has sufficient funds
    IF (SELECT Balance FROM Accounts WHERE AccountID = sender_id) < transfer_amount THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds in sender account';
    END IF;

    -- Deduct from sender
    UPDATE Accounts
    SET Balance = Balance - transfer_amount
    WHERE AccountID = sender_id;

    -- Credit to receiver
    UPDATE Accounts
    SET Balance = Balance + transfer_amount
    WHERE AccountID = receiver_id;

    COMMIT;
END;
