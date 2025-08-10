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


-- Triggers





CREATE TABLE employee_log (
    employee_id INT,
    first_name VARCHAR(20),
    salary FLOAT(10,2),
    hire_date DATETIME DEFAULT NOW()
);


-- Create the trigger for logging inserts into employee_log
DELIMITER $$
CREATE TRIGGER trg_employee AFTER INSERT ON Employees
FOR EACH ROW
BEGIN
    INSERT INTO employee_log (employee_id, first_name, salary, hire_date) 
    VALUES (NEW.employee_id, NEW.first_name, NEW.salary, NEW.hire_date);
END $$
DELIMITER ;



-- Insert a new record into Employees to test the trigger
INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES (9, 'Abdullah', 'Ahmed', 'System Administrator', 65000, '1990-01-15', '2019-04-01', 'IT', 'Karachi');

-- Select all records from the Employees table
SELECT * FROM Employees;

-- Select all records from the employee_log table
SELECT * FROM employee_log;


-- Example of product and order 



CREATE TABLE products(

product_id INT AUTO_INCREMENT PRIMARY KEY,
product_name VARCHAR(100),
quantity INT,
status VARCHAR(50)

);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    quantity_ordered INT,
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);




INSERT INTO products (product_name,quantity,status)
VALUES 
('Laptop',5,NULL);


INSERT INTO orders (product_id,quantity_ordered)
VALUES 
(1,1);


DELIMITER $$
CREATE TRIGGER after_insert_order
AFTER INSERT ON orders
FOR EACH ROW
BEGIN
    UPDATE products
    SET quantity = quantity - NEW.quantity_ordered
    WHERE product_id = NEW.product_id;
    
    
    UPDATE products
	SET status = CASE 
                WHEN quantity = 0 THEN 'out of stock'
                ELSE 'IN stock'
             END
	WHERE product_id = NEW.product_id;

END $$
DELIMITER ;


DROP TRIGGER after_insert_order;

SELECT * FROM products;
SELECT * FROM orders;


-- Assignment 11

/*
1. Create a BEFORE DELETE trigger that maintains a log of the username of the user
performing the deletion, the ID and name of the employee being deleted, and the
timestamp of when the action is performed every time an employee is removed from
the database.
*/


CREATE TABLE employee_deletion_log (
   
    employee_id INT,
    first_name VARCHAR(255),
    salary FLOAT,
    department VARCHAR(15),
	city VARCHAR(15),
    deletion_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


DELIMITER $$
CREATE TRIGGER before_delete_emp
BEFORE DELETE ON Employees
FOR EACH ROW 
BEGIN

INSERT INTO employee_deletion_log(employee_id , first_name , salary , department , city , deletion_time) VALUES
(OLD.employee_id , OLD.first_name , OLD.salary , OLD.department , OLD.city , NOW()  );

END $$
DELIMITER ;

DELETE FROM Employees
WHERE employee_id = 2;

SELECT * FROM employee_deletion_log;


/*
2. Write a query that displays the employee names and their designations if they have
been assigned a designation or “No designation yet” if they have not yet been assigned
a designation. Label appropriately
*/

SELECT CONCAT(first_name ,' ', last_name) AS 'FullName' ,
(CASE
WHEN designation is not null THEN designation
ELSE 'No designation yet'
 END ) AS designation
 FROM Employees;
 

-- Insert a new record into Employees to test the trigger
INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES (9, 'Abdullah', 'Ahmed', NULL, 65000, '1990-01-15', '2019-04-01', 'IT', 'Karachi');
