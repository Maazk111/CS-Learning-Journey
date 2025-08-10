CREATE DATABASE Company;

USE  Company;

CREATE TABLE Employees(

employee_id INT,
first_name VARCHAR(20),
last_name VARCHAR(20),
designation VARCHAR(20),
salary FLOAT,
birth_date DATE,
hire_date DATE,
department VARCHAR(15),
city VARCHAR(15)
 
);


INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES
(1, 'Maaz', 'Khan', 'Software Engineer', 70000, '2003-07-09', '2016-2-01', 'Engineering', 'Karachi'),
(2, 'Rumaisa', 'Fatima', 'Manager', 85000, '2004-11-14', '2016-2-01', 'Management', 'Lahore'),
(3, 'Farrukh', 'Iqbal', 'Data Analyst', 65000, '2002-9-01', '2015-08-23', 'Analytics', 'Sialkot'),
(4, 'Shayan', 'Adnan', 'UI/UX Designer', 72000, '2003-02-17', '2017-09-17', 'Design', 'Karachi'),
(5, 'Raif', 'Ul-Haque', 'DevOps Engineer', 28000, '2000-05-30', '2018-10-07', 'Engineering', 'Mirpur'),
(6, 'Zohaib', 'Shamim', 'Manager', 63000, '2001-12-14', '2017-03-21', 'Management', 'Islamabad'),
(7, 'Hammad', 'Alam', 'Manager', 76000, '1979-09-29', '2016-05-15', 'Management', 'Lahore'),
(8, 'Alishba', 'Aslam', 'Auditor', 39000, '1987-04-10', '2018-8-18', 'Finance', 'Karachi');


DESCRIBE employees;


-- Creation of a Procedure

DELIMITER $$
CREATE PROCEDURE get_data()
BEGIN
	SELECT * FROM Employees;
END $$
DELIMITER ;

CALL get_data();

-- Parameterize procedure 
-- IN parameters: Pass values to the procedure.

DELIMITER $$
CREATE PROCEDURE get_dept(IN dept VARCHAR(50))
BEGIN
	SELECT * FROM Employees WHERE department = dept;
END $$
DELIMITER ;

CALL get_dept('Engineering');


-- OUT parameters: Get values from the procedure.


s
DELIMITER $$
CREATE PROCEDURE get_dept_count(IN dept VARCHAR(50), OUT total INT )
BEGIN
	SELECT COUNT(*) INTO total FROM Employees where department = dept;
END $$
DELIMITER ;

CALL get_dept_count('Engineering' , @total);
SELECT @total AS 'Count of Employees in Department';


-- IN and OUT 

CREATE PROCEDURE SetCount(INOUT count INT, IN inc INT)
SET count = count + inc;


DELIMITER $$
CREATE PROCEDURE CountEmployeesDept(IN deptname VARCHAR(100) , OUT totalemployees INT)
BEGIN
	SELECT COUNT(*) INTO totalemployees
    FROM Employees
    WHERE department = deptname;
 END $$
 DELIMITER ;
    

-- To count the number of employees in a specific department:
CALL CountEmployeesDept('Management', @total);
SELECT @total AS 'Total Employees';

-- To increment a counter:
SET @counter = 1;
CALL SetCount(@counter, 1);  -- Increment by 1
CALL SetCount(@counter, 5);  -- Increment by 5
SELECT @counter AS 'Counter Value';

-- With  IF ELSE Statements

SELECT AVG(salary) FROM Employees;


/*
the DECLARE statement is used to define local variables within the
stored procedure. These variables are used for intermediate calculations
and operations within the procedure. 
*/

DELIMITER $$
CREATE PROCEDURE SalaryStatus(IN emp_id INT ,OUT name VARCHAR(20) , OUT salary_status VARCHAR(255))
	BEGIN
			DECLARE current_salary FLOAT(10,2);
            DECLARE avgerage_salary FLOAT(10,2);
            
            SELECT CONCAT(first_name,' ',last_name) INTO name FROM Employees
            WHERE employee_id = emp_id;
            
            SELECT AVG(salary) INTO avgerage_salary FROM Employees;
            SELECT salary INTO current_salary FROM Employees
            WHERE employee_id = emp_id;
            
            IF current_salary < avgerage_salary THEN
				SET salary_status = 'Less than Average Salary';
            ELSEIF current_salary = avgerage_salary THEN
				SET salary_status = 'Equal than Average Salary';   
			ELSEIF current_salary > avgerage_salary THEN
				SET salary_status = 'Greater than Average Salary'; 
			END IF;
	END $$
DELIMITER ;    

 



CALL SalaryStatus(2,@name,@salary_status);
SELECT @name AS 'Full_Name', @salary_status AS 'Salary Status';






-- Mam Error Query in ONLINE CLASS Solved SUIII

DELIMITER $$
CREATE PROCEDURE MamQuery(IN num INT ,OUT total INT)
	BEGIN
			DECLARE temp_total INT DEFAULT 10;
            SET temp_total = temp_total + num;
            SET total = temp_total;

	END $$
DELIMITER ;

CALL MamQuery(2,@total);
SELECT @total AS 'Total';










