CREATE DATABASE UniLever;

USE UniLever;


CREATE TABLE tblEmployee (
    EID INT PRIMARY KEY,
    EName VARCHAR(50),
    EJob VARCHAR(50),
    ESalary DECIMAL(10, 2),
    Department VARCHAR(50),
    JobLocation VARCHAR(50)
);

INSERT INTO tblEmployee (EID, EName, EJob, ESalary, Department, JobLocation) VALUES 
    (100, 'Mr. Kamran', 'Web site Programmer', 25000, 'Finance', 'Korangi'),
    (101, 'Mr. Aqeel', 'Mobile App Developer', 20000, 'Youtube Marketing', 'Gulshan Iqbal'),
    (102, 'Mr. Zeeshan', 'Android App Developer', 22000, 'Accounts', 'Gulshan Maymaar'),
    (103, 'Mr. Subhan', 'IOS App Developer', 21000, 'Admission Cell', 'Malir'),
    (104, 'Mr. Jamal', 'Mobile App Testing', 25000, 'Academics', 'Defence'),
    (105, 'Mr. Dawood', 'Data Base Developer', 30000, 'Finance', 'Korangi'),
    (106, 'Mr. Kashif', 'Web Site Security Incharge', 15000, 'Marketing', 'Gulshan Iqbal'),
    (107, 'Mr. Jawaid', 'Mobile App Security Incharge', 10000, 'Accounts', 'Gulshan Maymaar'),
    (108, 'Mr. Umar', 'IOS App Security Incharge', 16000, 'Admission Cell', 'Malir'),
    (109, 'Mr. Faiz', 'Windows Server Manager', 40000, 'Academics', 'Defence'),
    (110, 'Mr. Riaz', 'IOS Server Manager', 25000, 'Finance', 'Korangi'),
    (111, 'Mr. Imran', 'Software Analyst', 23000, 'Youtube Marketing', 'Nazimabad'),
    (112, 'Mr. Mobin', 'Project Manager', 24000, 'Accounts', 'Gulshan Maymaar'),
    (113, 'Mr. Haider', 'Linux Server Manager', 26000, 'Social Media', 'North Karachi'),
    (114, 'Mr. Shokat', 'Linux App Developer', 18000, 'Social Media', 'Nazimabad');

-- Q1 : How many employees are in the company?
SELECT COUNT(*) AS NumberOfEmployees 
FROM tblEmployee;

-- Q2 : Total monthly salary paid to all employees
SELECT SUM(ESalary) AS TotalSalaries 
FROM tblEmployee;

-- Q3 : Employee with the maximum salary
SELECT MAX(ESalary)
FROM tblEmployee;

-- If want details 
SELECT * FROM tblEmployee
ORDER BY ESalary DESC
LIMIT 1;

-- Q4 : Total salary for the Finance department
SELECT SUM(ESalary) AS TotalFinanceSalary
FROM tblEmployee 
WHERE Department = 'Finance';

-- Q5 : Total salary paid to employees working in Malir
SELECT SUM(ESalary) AS TotalSalaryPaid 
FROM tblEmployee 
WHERE JobLocation = 'Malir';

-- Q6 : Employee with the minimum salary
SELECT MIN(ESalary)
FROM tblEmployee;

-- If want details 
SELECT * FROM tblEmployee
ORDER BY ESalary ASC
LIMIT 1;

-- Q7 : Employees per department
SELECT Department, COUNT(*) AS NumberOfEmployees 
FROM tblEmployee 
GROUP BY Department;

-- Q8 : Employees per job location
SELECT JobLocation, COUNT(*) AS NumberOfEmployees 
FROM tblEmployee 
GROUP BY JobLocation;

-- Q9 : Number of unique departments
SELECT COUNT(DISTINCT Department) AS NumberOfDepartments 
FROM tblEmployee;

-- Q10 : Number of managers in the company
SELECT COUNT(*) AS NumberOfManagers 
FROM tblEmployee 
WHERE EJob LIKE '%Manager%';

-- Q11 : Transfer employees from Gulshan Maymaar to Clifton
UPDATE tblEmployee 
SET JobLocation = 'Clifton' 
WHERE JobLocation = 'Gulshan Maymaar';

-- Q12 : Salary increase due to Eid occasion
UPDATE tblEmployee
SET ESalary = CASE 
                WHEN Department = 'Youtube Marketing' THEN ESalary * 1.15
                ELSE ESalary * 1.10
              END;
SET SQL_SAFE_UPDATES =0;

-- Q13 : Number of unique job locations
SELECT COUNT(DISTINCT JobLocation) AS NumberOfJobLocations 
FROM tblEmployee;

-- Q14 : Number of developers in the company
SELECT COUNT(*) AS NumberOfDevelopers 
FROM tblEmployee 
WHERE EJob LIKE '%Developer%';

-- Q15 : Average salary in the company
SELECT AVG(ESALARY) AS AverageSalary 
FROM tblEmployee;
