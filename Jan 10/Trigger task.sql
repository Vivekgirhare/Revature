CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary DOUBLE
);
CREATE TABLE salary_change_log (
    emp_id INT,
    old_department VARCHAR(30),
    new_department VARCHAR(30),
    old_salary DOUBLE,
    new_salary DOUBLE,
    change_time DATETIME
);
INSERT INTO employees VALUES (101, 'Rohit', 'IT', 45000);

DELIMITER //
CREATE TRIGGER employees_update_trg
AFTER UPDATE ON employees
FOR EACH ROW
BEGIN
    INSERT INTO salary_change_log (
        emp_id,
        old_department,
        new_department,
        old_salary,
        new_salary,
        change_time
    )
    VALUES (
        OLD.emp_id,
        OLD.department,
        NEW.department,
        OLD.salary,
        NEW.salary,
        NOW()
    );
END;
//
DELIMITER ;

UPDATE employees
SET department = 'HR', salary = 55000
WHERE emp_id = 101;
SELECT * FROM salary_change_log;
