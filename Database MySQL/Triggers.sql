CREATE DATABASE sqltriggers;
USE sqltriggers;


-- Trigger = When an event happens, do something
-- ex. (INSERT, UPDATE, DELETE)
-- benefits = checks data, handles errors, auditing tables

/*
A trigger can be considered as a special type of stored procedure. The main difference
between triggers and stored procedures is that a trigger is automatically called when a data
modification event occurs in a table whereas a stored procedure must be called explicitly.
Furthermore, multiple triggers for the same event and action time can be defined.

*/


CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    referral_id INT,
    email VARCHAR(100)
);


INSERT INTO customers (customer_id, first_name, last_name, referral_id, email) VALUES
(1, 'Fred', 'Fish', NULL, 'FFish@gmail.com'),
(2, 'Larry', 'Lobster', 1, 'LLobster@gmail.com'),
(3, 'Bubble', 'Bass', 2, 'BBass@gmail.com'),
(4, 'Poppy', 'Puff', 2, 'PPuff@gmail.com'),
(5, 'Pearl', 'Krabs', 3, 'PKrabs@gmail.com');



SELECT * FROM customers;

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hourly_pay DECIMAL(5, 2),
    job VARCHAR(50),
    hire_date DATE,
    supervisor_id INT
);


INSERT INTO employees (employee_id, first_name, last_name, hourly_pay, job, hire_date, supervisor_id) VALUES
(1, 'Eugene', 'Krabs', 25.50, 'manager', '2023-01-02', 5),
(2, 'Squidward', 'Tentacles', 15.00, 'cashier', '2023-01-03', 5),
(3, 'Spongebob', 'Squarepants', 12.50, 'cook', '2023-01-04', 5),
(4, 'Patrick', 'Star', 12.50, 'cook', '2023-01-05', 5),
(5, 'Sandy', 'Cheeks', 17.25, 'asst. manager', '2023-01-06', 1),
(6, 'Sheldon', 'Plankton', 10.00, 'janitor', '2023-01-07', 5);



/* I HAVE A TABLE OF EMPLOYEES WE HAVE A hourlypay COLUMN MAY BE I WOULD LIKE A SALARY 
	COLUMN  WHENEVER WE ADD AN EMPLOYEE OR UPDATE OUR HOURLY PAY THE EMPLOYEE'S SALARY WILL BE CHANGED AUTOMATICALLY 
    WITH THE TRIGGER BEFORE CREATING THE TRIGGER LETS'S UPDATE THE EMPLOYEE'S TABLE ADD SALARY COLUMN
*/


ALTER TABLE employees
ADD COLUMN salary DECIMAL(10,2) AFTER hourly_pay;

SELECT * FROM employees;


UPDATE employees
SET salary = hourly_pay * 2080;
/*
When we Update employee's hourly pay i woud like to Also Update the salary automatically
with the trigger I don't want to  calculate every employee's manually you know using a calculator like just did.  

*/
SET SQL_SAFE_UPDATES =0;



-- Creating Trigger

CREATE TRIGGER before_hourly_pay_update
BEFORE UPDATE ON employees
FOR EACH ROW 
SET NEW.salary = (NEW.hourly_pay * 2080);

SHOW TRIGGERS;


SELECT * FROM employees;

-- MR KRABS IS GOING TO GIVE HIMSELF AN HOURLY PAY RAISE BECAUSE HE IS GREDY 



UPDATE employees
SET hourly_pay = 50
WHERE employee_id = 1;  -- Automatically changed the salary bcz of trigger 


-- NOW MR KRABS IS FEELING GENEROUS UPDATE EMPLOYEES WE WILL SET THE HOURLY PAY EQUAL TO WHATEVER THE HOURLY PAY CURRENTLY IS PLUS ONE

UPDATE employees
SET hourly_pay = hourly_pay + 1;


 
-- INSERT NEW EMPLOYEE

DELETE FROM employees
WHERE employee_id = 6;

SELECT * FROM employees;


CREATE TRIGGER befre_hourly_pay_insert
BEFORE INSERT ON employees
FOR EACH ROW
SET NEW.salary  = (NEW.hourly_pay * 2080);


INSERT INTO employees
VALUES 
(6 , 'Sheldon' , 'Plankton' , 10 , NULL , 'JANITOR', '2023-01-07', 5);

 
 
 CREATE TABLE expenses (
 
 expense_id INT PRIMARY KEY,
 expense_name VARCHAR(50),
 expense_total DECIMAL(10,2)
 
 );
 
 INSERT INTO expenses
 VALUES  (1 , 'salaries' , 0),
		 (2, 'supplies', 0),
		 (3 , 'taxes' , 0);
 
SELECT * FROM expenses; 

UPDATE expenses
SET expense_total = (SELECT SUM(salary) FROM employees)
WHERE expense_name = 'salaries';
 
-- IF WE DELETE AN EMPLOYEE SO THE EXPENCE TOTAL WILL AFFECT ALSO DUE TO TRIGGER 

CREATE TRIGGER after_salary_delete
AFTER DELETE ON employees
FOR EACH ROW
UPDATE expenses
SET expense_total = expense_total - OLD.salary
WHERE expense_name = 'salaries';



 
 
DELETE FROM employees
WHERE employee_id = 6;


SELECT * FROM expenses;


 CREATE TRIGGER after_salary_insert 
 AFTER  INSERT ON employees
 FOR EACH ROW 
 UPDATE expenses
 SET expense_total = expense_total + NEW.salary
 WHERE expense_name = 'salaries';
 
 


 

 
INSERT INTO employees
VALUES 
(6 , 'Sheldon' , 'Plankton' , 10 , NULL , 'janitor', '2023-01-07', 5);


 
  
SELECT * FROM expenses; 


CREATE TRIGGER after_salary_update 
AFTER UPDATE ON employees
FOR EACH ROW
UPDATE expenses
SET expense_total = expense_total + (NEW.salary - OLD.salary)
WHERE expense_name = 'salaries';


 DROP TRIGGER after_salary_update;
 
 
UPDATE employees
SET hourly_pay = 100
WHERE employee_id = 1;

SELECT * FROM expenses; 
 
 
 
 
 
 
 
 
 