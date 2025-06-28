CREATE DEFINER=`root`@`localhost` PROCEDURE `ActivateVIPStatus`()
BEGIN
    DECLARE v_done INT DEFAULT FALSE;
    DECLARE v_cust_id INT;
    DECLARE v_balance DECIMAL(10, 2);
    
    DECLARE vip_cursor CURSOR FOR 
        SELECT CustomerID, Balance FROM Customers;
        
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET v_done = TRUE;

    OPEN vip_cursor;

    vip_loop: LOOP
        FETCH vip_cursor INTO v_cust_id, v_balance;
        IF v_done THEN
            LEAVE vip_loop;
        END IF;

        IF v_balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = v_cust_id;
        END IF;
    END LOOP;

    CLOSE vip_cursor;
    COMMIT;
END;
