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

ALTER TABLE Employees
DROP COLUMN first_name ;

ALTER TABLE Employees
DROP COLUMN last_name;

DESCRIBE Employees;

UPDATE Employees
SET employee_name = CONCAT(first_name, ' ', last_name);

SET SQL_SAFE_UPDATES =0;

ALTER TABLE Employees
ADD COLUMN employee_name VARCHAR(25) AFTER employee_id; 

SELECT CONCAT(employee_name, ', ', designation, ', ', department) AS EmployeeDetails
FROM Employees; -- Returns Null If i did not Update Employee Names Values Before the Drop first_name and last_name

SELECT designation ,  COUNT(designation) AS 'Count of Auditors' 
FROM Employees
GROUP BY designation
HAVING designation = "Auditor";

SELECT city , department , COUNT(*) as 'Number of Employees' -- Count All Rows    
FROM Employees
GROUP BY city , department;

SELECT department ,  COUNT(*)
FROM Employees
GROUP BY department;

SELECT department , AVG(salary) AS 'Average Salary'
FROM Employees
GROUP BY department;

SELECT department, COUNT(*) AS NumberOfEmployees
FROM Employees
WHERE EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM hire_date) > 8
GROUP BY department;


SELECT designation , SUM(Salary) 'TotalSalary'
FROM Employees
GROUP BY designation
ORDER BY SUM(Salary) DESC; 


SELECT COUNT(*) AS 'Number of Employees'
FROM Employees; 


SELECT city , department , FORMAT(AVG(Salary),2) AS 'AverageSalary'
FROM Employees
GROUP BY city , department
HAVING AVG(Salary) >= 70000;


