CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdateEmployeeBonus`(
    IN p_department VARCHAR(305),
    IN p_bonus_percent DECIMAL(3, 5)
)
BEGIN
    DECLARE is_done INT DEFAULT FALSE;
    DECLARE emp_id INT;
    DECLARE curr_salary DECIMAL(6, 2);

    -- Cursor to select employees in the given department
    DECLARE emp_cursor CURSOR FOR 
        SELECT EmployeeID, Salary 
        FROM Employees 
        WHERE Department = p_department;

    -- Handler for when cursor reaches the end
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET is_done = TRUE;

    OPEN emp_cursor;

    bonus_loop: LOOP
        FETCH emp_cursor INTO emp_id, curr_salary;
        IF is_done THEN
            LEAVE bonus_loop;
        END IF;

        -- Calculate new salary with bonus
        SET curr_salary = curr_salary * (1 + p_bonus_percent / 100);

        -- Update the salary in the table
        UPDATE Employees
        SET Salary = curr_salary
        WHERE EmployeeID = emp_id;
    END LOOP;

    CLOSE emp_cursor;
    COMMIT;
END;
