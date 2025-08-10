CREATE DATABASE PracticeDB;
USE PracticeDB;




CREATE TABLE Customers (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100),
    PhoneNumber VARCHAR(20),
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE Orders (
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerID INT,
    OrderDate varchar(20),
    TotalAmount DECIMAL(10, 2),
    Status VARCHAR(20),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);


INSERT INTO Customers (FirstName, LastName, Email, PhoneNumber) VALUES
('John', 'Doe', 'john.doe@example.com', '123-456-7890'),
('Jane', 'Smith', 'jane.smith@example.com', '987-654-3210');


INSERT INTO Orders (CustomerID, OrderDate, TotalAmount, Status) VALUES
(1, '2024-05-01', 150.00, 'Shipped'),
(2, '2024-05-03', 200.00, 'Pending'),
(1, '2024-05-05', 75.00, 'Delivered');


SELECT CAST('2024-05-01' as DATETIME ) as 'CAST FUNCTION';


SELECT CAST(PhoneNumber as CHAR ) 
FROM Customers;

DESCRIBE CsFaculty;

DESCRIBE Customers;
CREATE TABLE CsFaculty like CUSTOMERS;  -- Strcuture Clone

CREATE TABLE DATACLONE SELECT *
FROM CsFaculty;

SELECT * FROM DATACLONE;


CREATE VIEW view1 as 
SELECT  CustomerID , FirstName , LastName , Email 
FROM Customers;

SELECT * FROM view1;

INSERT INTO view1(CustomerID , FirstName , LastName , Email )
values 
(554 , 'Maaz ', 'khan' , 'mmaazk11@gmail.com' );

UPDATE view1
SET CustomerID = 100
WHERE CustomerID = 554;


ALTER VIEW view1 as SELECT CustomerID , FirstName from Customers;

UPDATE view1
SET FirstName = 'Rumaisa'
WHERE FirstName = 'Khan';

SELECT * from view1;

SET SQL_SAFE_UPDATES =0;







