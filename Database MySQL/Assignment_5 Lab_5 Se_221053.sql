CREATE DATABASE Company;
USE Company;


CREATE TABLE Employees(

employeeId INT PRIMARY KEY AUTO_INCREMENT,
firstName VARCHAR(20),
lastName VARCHAR(20),
birthCity VARCHAR(20),
hiringDate DATE,

deptID INT ,
FOREIGN KEY(deptID) REFERENCES Departments(deptID)

ON DELETE CASCADE 
ON UPDATE CASCADE,


jobID VARCHAR(25) ,
FOREIGN KEY (jobID) REFERENCES jobs(jobID)

ON DELETE CASCADE 
ON UPDATE CASCADE


);

DESCRIBE Employees;

SELECT * FROM Employees;


INSERT INTO Employees (firstName,lastName,birthCity,hiringDate,deptID,jobID)
VALUES
('Maaz', 'Khan', 'Hyderabad' ,'2024-07-09', 2 , 'SOFTENG103' ),
('Rumaisa', 'Khan', 'Karachi' ,'2025-05-04', 2 , 'SOFTENG103' ),
('Farrukh', 'Iqbal', 'Sialkot' ,'2024-11-23', 3 , 'MAN101' ),
('Shayan', 'Adnan', 'Islamabad' ,'2026-4-26', 4 , 'ACK102' ),
('Riaf', 'ul-Haq', 'Islamabad' ,'2027-12-12', 6 , 'MacENG100' ),
('Zohaib', 'Shamim', 'Islamabad' ,'2028-11-11', 6 , 'MacENG100' );




CREATE TABLE Departments(

DeptID INT PRIMARY KEY AUTO_INCREMENT,
deptName VARCHAR(30),
locationID INT,
FOREIGN KEY (locationID) REFERENCES Locations(locationID)
ON DELETE CASCADE 
ON UPDATE CASCADE

);

DESCRIBE Departments;

INSERT INTO Departments(deptName ,locationID )
VALUES 
('Engineering', 1),
('Software Engineering', 1),
('Management', 2),
('Accountant', 3),
('Engineering', 4),
('Mechanical  Engineering', 6);


SELECT * FROM Departments;


CREATE TABLE jobs(

jobID VARCHAR(15) PRIMARY KEY,
jobTitle VARCHAR(25),
salary FLOAT(7,2)

);

DESCRIBE jobs;

INSERT INTO jobs (jobID , jobTitle , salary)
VALUES
('ENG100' , 'Engineering' , 20000),
('MAN101' , 'Manager' , 25000),
('ACK102' , 'Accountant' , 40000),
('SOFTENG103' , 'Software Engineering' , 45000),
('CivEG104' , 'Civil Engineering' , 27000),
('MacENG100' , 'Mechanical  Engineering' , 30000);

SELECT * FROM jobs;


CREATE TABLE Locations(

locationID INT PRIMARY KEY AUTO_INCREMENT,
city VARCHAR(15),
country VARCHAR(25)

);


DESCRIBE Locations;

INSERT INTO Locations (city , country)
VALUES
('Hyderabad', 'Pakistan'),
('Karachi', 'Pakistan'),
('Sialkot', 'Pakistan'),
('Islamabad', 'Pakistan'),
('Islamabad', 'Pakistan'),
('Islamabad', 'Pakistan');

SELECT * FROM Locations;


-- 1. Count the number of employees in each department. Also, display the maximum  salary of each department



SELECT 

deptName, -- Gets the department Names
COUNT(employeeId) AS NumberOfEmployees, 
Max(salary) AS MaxSalary

FROM Employees AS e -- has Primary Key of Dept and jobs 

JOIN Departments AS d
ON d.DeptID = e.DeptID    

JOIN jobs as j
ON e.jobID = j.jobID

GROUP BY deptName;




-- 2. Display the id, full name, designation, and salary of the lowest paid employee.

SELECT 

employeeID , 
CONCAT(firstName,' ',lastName) AS 'FullName',
jobTitle ,
salary

FROM Employees AS e
JOIN jobs AS j
ON e.jobID = j.jobID

ORDER BY salary ASC 

LIMIT 1;


-- 3. Display the names of all the designations along with the employees assigned to that
-- designation (irrespective of whether the designation has been assigned to someone
-- or not).

SELECT 

jobTitle,

firstName 

FROM jobs AS j -- All designation means Left Join of jobs 
LEFT JOIN Employees AS e  
ON e.jobID = j.jobID;


-- 4. List all the countries with more than two departments. Also, give the total number of departments in that country.


SELECT 
country AS 'Country',
COUNT(deptName) AS 'Number of Department'

FROM Locations AS l
JOIN Departments AS d
ON l.locationID = d.locationID

GROUP BY country 
HAVING Count(deptName) > 2;


-- 5. List all the cities to which the employees belong to or where the departments exist.

SELECT 
city ,
deptName

FROM Locations AS l
LEFT JOIN Departments AS d
ON l.locationID = d.locationID;


-- 6. List all the departments along with their employees’ names (irrespective of whether any of the values is NULL).


SELECT 

DISTINCT deptName , 

CONCAT(firstName,' ',lastName) AS 'FullName'

FROM Departments AS d
LEFT JOIN Employees AS e
ON d.deptID = e.deptID;

