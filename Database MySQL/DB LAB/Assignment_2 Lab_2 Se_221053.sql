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

DESCRIBE Employees;

SELECT first_name , designation , department
FROM Employees;


SELECT first_name , salary , hire_date
FROM Employees
ORDER BY hire_date DESC;


SELECT DISTINCT department
FROM Employees;

SELECT first_name 
FROM Employees
WHERE salary < 40000 AND hire_date LIKE  '%2018%';


SELECT DISTINCT city
FROM Employees
WHERE city LIKE '%i%' OR city LIKE '%r%'; 


SELECT first_name , department , hire_date, salary
FROM Employees
WHERE hire_date BETWEEN "2016-2-01" AND '2018-10-18'
ORDER BY hire_date DESC, salary ASC;

SELECT first_name 
FROM Employees
WHERE city = "Lahore" AND designation = "Manager";

SELECT 
    first_name, 
    last_name, 
    salary, 
    salary * 0.20 AS Bonus, 
    salary * 1.20 AS `NewSalary`
FROM 
    Employees
WHERE 
    designation IN ("Manager", 'Auditor');

