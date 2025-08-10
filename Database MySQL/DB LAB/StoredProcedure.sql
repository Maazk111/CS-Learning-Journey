CREATE DATABASE storedprocedure;
USE storedprocedure;


-- Stored procedure = is prepared SQL code that you can save
-- great if there's a query that you write often
-- reduces network traffic
-- increases performance
-- secure, admin can grant permission to use
-- increases memory usage of every connection


/*
Stored procedures are a powerful tool for managing and optimizing database operations,
providing a structured and efficient way to handle repetitive and complex tasks.

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



SELECT * FROM employees;


CREATE TABLE transactions (
    transaction_id INT PRIMARY KEY,
    amount DECIMAL(5, 2),
    customer_id INT,
    order_date DATE
);

INSERT INTO transactions (transaction_id, amount, customer_id, order_date) VALUES
(1000, 4.99, 3, '2023-01-01'),
(1001, 2.89, 2, '2023-01-01'),
(1002, 3.38, 3, '2023-01-02'),
(1003, 4.99, 1, '2023-01-02'),
(1004, 1.00, NULL, '2023-01-03'),
(1005, 2.49, 4, '2023-01-03'),
(1006, 5.48, 3, '2023-01-03');

SELECT DISTINCT first_name, last_name
FROM transactions
INNER JOIN customers
ON transactions.customer_id = customers.customer_id;

-- if i use this Query Often so i encapsulate it in a Single Procedure Call 

CALL get_distinctCustomers(); 

 -- Creating the procedure 
DELIMITER $$
CREATE PROCEDURE get_distinctCustomers() 
BEGIN
		SELECT DISTINCT first_name, last_name
		FROM transactions
		INNER JOIN customers
		ON transactions.customer_id = customers.customer_id;
END $$
DELIMITER ;


DROP PROCEDURE get_customers;  -- To DROP THE PROCEDURE

DELIMITER $$
CREATE PROCEDURE get_Customers() 
BEGIN
		SELECT * FROM customers;
END $$
DELIMITER ;



CALL get_Customers();

 -- Procedure With Arguments
DELIMITER $$
CREATE PROCEDURE find_customer(IN id INT)
BEGIN
		SELECT * 
		FROM customers
		WHERE customer_id  = id;
END $$
DELIMITER ;



CALL find_customer(6);

-- MULTI ARGUMENTS PROCEDURE 
DELIMITER $$
CREATE PROCEDURE find_customername(IN f_name VARCHAR(50) , IN l_name VARCHAR(50))
BEGIN
		SELECT *
		FROM customers
		WHERE first_name =f_name AND last_name = l_name;
END $$
DELIMITER ;


CALL find_customername('Fred', 'Fish');










 







