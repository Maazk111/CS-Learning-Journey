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

DELETE FROM Locations
WHERE locationID = 6;


