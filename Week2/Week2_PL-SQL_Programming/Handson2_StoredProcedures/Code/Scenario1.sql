CREATE DEFINER=`root`@`localhost` PROCEDURE `ProcessMonthlyInterest`()
BEGIN
    DECLARE completed INT DEFAULT FALSE;
    DECLARE acc_id INT;
    DECLARE balance_amt DECIMAL(6, 2);

    DECLARE savings_cursor CURSOR FOR 
        SELECT AccountID, Balance 
        FROM Accounts 
        WHERE AccountType = 'Savings';

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = TRUE;

    OPEN savings_cursor;

    process_loop: LOOP
        FETCH savings_cursor INTO acc_id, balance_amt;
        IF finished THEN
            LEAVE process_loop;
        END IF;

        -- Apply 1% monthly interest
        SET balance_amt = balance_amt * 1.01;

        -- Update balance in table
        UPDATE Accounts
        SET Balance = balance_amt
        WHERE AccountID = acc_id;
    END LOOP;

    CLOSE savings_cursor;
    COMMIT;
END;
