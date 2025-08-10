CREATE DATABASE Views;
USE Views;


CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance'),
(4, 'Marketing');

SELECT *
FROM Departments;

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT,
    Salary DECIMAL(10, 2),
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary) VALUES
(1, 'John Doe', 1, 50000.00),
(2, 'Jane Doe', 2, 60000.00),
(3, 'Alice', 1, 55000.00),
(4, 'Bob', 3, 70000.00),
(5, 'Charlie', 4, 45000.00),
(6, 'David', 2, 75000.00),
(7, 'Eva', 3, 65000.00),
(8, 'Frank', 4, 48000.00);

SELECT *
FROM Employees;

-- Creating the View
-- View : A VIRTUAL TABLE to which we can restricks user access to specific rows or columns 

-- Explaination
/* 
Suppose we have a company's big database in that database we have all customers 
information and a Sales team.
Sales team Should know Custmers (name , Phone , email , etc ) but sales team should know that
Which credit card used by customer ? NO RIGHT 

That's why We restrict view access to someone in our oranization 
Means Only Accounts teams Can view Credit Card Information 
But sales team not 
In these Cases we create views

To show only essencial data to someone that needed 
*/

CREATE VIEW EmployeeDetails AS
SELECT e.EmployeeID , e.Name , d.DepartmentName , e.Salary 
FROM Employees AS e
JOIN Departments d
ON e.DepartmentID = d.DepartmentID;

SELECT *
FROM EmployeeDetails;

-- Now We can PerFrom the basic operations of SQL in this view to like Filtering etc

/* 
But if we changes to the original tables will be reflected in the view.
This is because a view in SQL is essentially a saved query that dynamically
pulls data from the underlying tables whenever it is accessed.
*/


INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary)
VALUES
(9 , 'grace' , 1 , 59000.0);

-- If i delete This it will affect the View also 
DELETE FROM Employees
WHERE EmployeeID = 4;


SELECT *
FROM EmployeeDetails;



-- Data types  ( TYPE CASTING )

/*
The CAST function only changes the data type of the column 
in the result set of the query. It does not alter the actual data type of the column in the table itself.
The change is temporary and only applies to the output of this specific query.
*/

DESCRIBE Departments;


SELECT CAST(DepartmentName AS CHAR) as 'Names Of departments'
FROM Departments;

SELECT CAST(Salary AS SIGNED) AS `INT Salary`
FROM Employees;

-- Cloning the Tables  -- These are Real Tables but a Copy of another Table 

/*
Cloned Tables: Permanent, persistent across sessions, used for 
creating backups, testing, or additional operations. 
They need to be explicitly dropped when no longer needed.
*/

CREATE TABLE CloneTable LIKE Employees; -- Create Structure of Clone


/*
Cloning a table means creating a new table with the same structure and, optionally, the same data as an existing table.
*/

-- Copying data from Employees to EmployeesClone
INSERT INTO CloneTable SELECT * FROM Employees;

-- Verify the cloned table
SELECT * FROM CloneTable; 


-- Temporary Tables

/*
Temporary tables are special types of tables in SQL that are used to store intermediate results
and are automatically deleted when the session or the connection that created them ends.
They are useful for storing data temporarily during complex queries or batch processes.
*/


-- Create a temporary table

CREATE TEMPORARY TABLE TempHighSalaryEmployees AS
SELECT * 
FROM Employees
WHERE Salary > 60000;

SELECT *
FROM TempHighSalaryEmployees;


INSERT INTO TempHighSalaryEmployees (EmployeeID , Name, DepartmentID, Salary)
VALUES 
(9,'Grace',1, 59000.0);

DELETE FROM TempHighSalaryEmployees
WHERE EmployeeID = 4;

SET SQL_SAFE_UPDATES=0;


-- Scope
/*
The temporary table TempHighSalaryEmployees is only accessible within
the session that created it. If you close the connection or the session,
the temporary table is automatically dropped.
*/

-- Usage

/*
Temporary tables are ideal for storing intermediate results,
performing transformations, or simplifying complex queries.
*/ 


















