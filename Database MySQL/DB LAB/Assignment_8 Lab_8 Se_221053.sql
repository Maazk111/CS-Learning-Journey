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


SELECT * FROM Employees;

-- 1. Write a procedure to display the name, designation, and salary of the highest paid
-- employee. Use a subquery to get the highest paid employee.


DELIMITER $$
CREATE PROCEDURE topEmp()
	BEGIN
			SELECT CONCAT(first_name,' ',last_name) AS 'Full_Name' , 
				   designation AS 'Designation',
                   salary AS 'Salary'
            FROM Employees
            WHERE salary = (SELECT MAX(salary) FROM Employees);
								
	END $$
DELIMITER $$

	
CALL topEmp();


-- 2. Write a procedure to display the details of all the employees whose salary is more
--    than the salary specified as input to the procedure.
								
DELIMITER $$
CREATE PROCEDURE salary(IN salaryIN FLOAT(10,2))
	BEGIN 
				
                SELECT * FROM Employees WHERE salary > salaryIN;


	END $$
DELIMITER $$

CALL salary(84000);


-- 3. Write a procedure that gives the average of the minimum salaries of all the
-- departments. The average salary should be returned in a variable that is accessible
-- outside the procedure.


DELIMITER $$
CREATE PROCEDURE avgSalaryOfDept(OUT avgSalary FLOAT(10,2))
	BEGIN 
			DECLARE tempAvg FLOAT(10,2);
			
			SELECT AVG(min_salary) INTO tempAvg
			FROM (
				SELECT MIN(salary) AS min_salary
				FROM Employees
				GROUP BY department
			) AS min_salaries;
			
			SET avgSalary = tempAvg;
	END $$
DELIMITER ;


CALL avgSalaryOfDept(@avgSalary);
SELECT @avgSalary AS 'Average Salary';

-- 4. Create a procedure that takes employee ID as input and returns the bonus
-- percentage for the employee as output using the following criteria:
-- Salary more than 70% of maximum salary — 5% bonus
-- Salary more than 50% but less than/equal to 70% of maximum salary — 15% bonus
-- Salary more than 20% but less than/equal to 50% of maximum salary — 25% bonus
-- Salary less than or equal to 20% of maximum salary — 35% bonus
-- [Hint: Use if statements]


DELIMITER $$
CREATE PROCEDURE bonus(IN id INT , OUT bonus VARCHAR(50))
	BEGIN
			DECLARE current_salary FLOAT(10,2);
            DECLARE max_salary FLOAT(10,2);
            
            SELECT salary INTO current_salary FROM Employees WHERE employee_id = id;
            SELECT MAX(salary) INTO max_salary FROM Employees;
            
            IF current_salary > (max_salary * 0.70) THEN
				SET bonus = '5% bonus';
            ELSEIF current_salary > (max_salary * 0.50) AND current_salary <= (max_salary * 0.70) THEN
				SET bonus = '15% bonus';
            ELSEIF current_salary > (max_salary * 0.20) AND current_salary <= (max_salary * 0.50) THEN
				SET bonus = '25% bonus';
            ELSEIF current_salary <= max_salary THEN
				SET bonus = '35% bonus';
            END IF;    
	END $$
DELIMITER ;

CALL bonus(5,@bonus);

SELECT @bonus AS 'Bonus Percentage';






