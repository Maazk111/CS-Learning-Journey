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




-- 1. Create a temporary table EmployeeInfo having three columns: Employee’s full name, Job title and Department. Show the structure of the table.

CREATE TEMPORARY TABLE EmployeeInfo AS
SELECT
CONCAT(first_name ,' ', last_name ) as 'Full Name' , 
designation AS 'Job Title',
department AS 'Department'
FROM Employees;

DESCRIBE EmployeeInfo;

-- 2. Clone the Employees table. Compare the structure of the cloned table to the original table. Display all the data of the cloned table.


CREATE TABLE CloneEmployeesTable LIKE Employees;


DESCRIBE CloneEmployeesTable;
DESCRIBE Employees;


-- 3. Drop the hiring date column from the cloned table and compare its structure with the original table.

ALTER TABLE CloneEmployeesTable
DROP COLUMN hire_date;

DESCRIBE CloneEmployeesTable;
DESCRIBE Employees;

-- 4. Create a view EmployeeView having two columns: First name and Date of Hiring. Show the structure of the view.

CREATE VIEW EmployeeView  AS
SELECT 
first_name , 
hire_date
FROM Employees;


-- 5. Insert a new record in the Employees table. Display all the records in Employees, EmployeeInfo, and EmployeeView. 

INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES
(9 , 'Maria' , 'Abid','Data Analyst' , 20000 , '2003-11-10' ,'2016-2-01', 'Engineering', 'Karachi' );

SELECT * FROM EmployeeView; -- It will affect the View Bcz it's dynamically stored or Connnected with the Orginal Table
SELECT * FROM Employees; -- ORGINAL TABLE 
SELECT * FROM EmployeeInfo; -- it did't affect the temporary table 


-- 6. Alter EmployeeView to restrict it to show only the employees hired in 2020.

ALTER VIEW EmployeeView AS
SELECT hire_date FROM Employees
WHERE hire_date LIKE '%2020%' ; 


-- 7. Using EmployeeView, add a new employee with hiring date “19-12-2012”. Display all the records in Employees, EmployeeInfo, and EmployeeView.
-- 8. Using EmployeeView, add a new employee with hiring date “16-08-2020”. Display all the records in Employees, EmployeeInfo, and EmployeeView.

INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES
(10 , 'Misbah' , 'Azhar','UI/UX Designer' , 60000 , '2002-11-10' ,'2012-12-19', 'Engineering', 'Karachi' ),
(11 , 'Mahnoor' , 'Arshad','Software Engineer' , 70000 , '2003-11-10' ,'2020-08-16', 'Engineering', 'Karachi' );


SELECT * FROM EmployeeView; -- It will affect the View Bcz it's dynamically stored or Connnected with the Orginal Table
SELECT * FROM Employees; -- ORGINAL TABLE 
SELECT * FROM EmployeeInfo; -- it did't affect the temporary table 








