CREATE DEFINER=`root`@`localhost` PROCEDURE `ApplyDiscountLoan`()
BEGIN
    DECLARE v_finished INT DEFAULT FALSE;
    DECLARE v_cust_id INT;
    DECLARE v_dob DATE;
    DECLARE v_age INT;

    DECLARE cust_cursor CURSOR FOR 
        SELECT CustomerID, DOB FROM Customers;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET v_finished = TRUE;

    OPEN cust_cursor;

    process_loop: LOOP
        FETCH cust_cursor INTO v_cust_id, v_dob;
        IF v_finished THEN
            LEAVE process_loop;
        END IF;

        -- Calculate age using TIMESTAMPDIFF
        SET v_age = TIMESTAMPDIFF(YEAR, v_dob, CURDATE());

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = v_cust_id;
        END IF;
    END LOOP;

    CLOSE cust_cursor;
    COMMIT;
END;
