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

SELECT * FROM employees;


-- 1. Display the name, designation, and salary of the highest paid employee without using the ORDER BY clause.


SELECT CONCAT(first_name ,' ' , last_name) AS 'Full Name' , 
		designation , salary 
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);


-- 2. Display the name and experience of the employee with the maximum experience.


SELECT CONCAT(first_name ,' ' , last_name) AS Full_Name ,
MAX(EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM hire_date)) AS Experience
FROM employees
GROUP BY Full_Name
HAVING Experience = ( SELECT MAX(EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM hire_date)) AS 'Experience'
					  FROM employees );

-- 3. Display the names and salaries of all the employees whose salary is greater than the average salary of the company.


SELECT CONCAT(first_name ,' ' , last_name) AS Full_Name,
		salary 
FROM employees
WHERE salary > ( 
   SELECT AVG(salary) FROM employees);
   

-- 4. Display the highest paid employee of each department.

SELECT CONCAT(first_name ,' ' , last_name) AS Full_Name ,
	   department , salary
FROM employees
WHERE salary IN (SELECT MAX(salary) FROM employees GROUP by department);



-- Online Session


SELECT * 
FROM Employees
WHERE salary = (SELECT MAX(salary)
				FROM Employees);
                
                

-- Any operation

SELECT * 
FROM Employees
WHERE salary < ANY (SELECT MAX(salary) 
				FROM Employees );   
                
                
 -- All operator
 
 SELECT * 
FROM Employees
WHERE salary < ALL (SELECT MAX(salary) 
				FROM Employees) AND department = 'Engineering';   
                




