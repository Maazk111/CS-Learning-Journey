-- subQuery 
-- a query with in another query 
-- query(subquery)

CREATE DATABASE brocode;
USE  brocode;

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

-- Our Manager Mr krabs he needs us to compare every employee's hourly pay with the Avg hourly pay of our employee's table



SELECT first_name , last_name , hourly_pay , 
		(SELECT AVG(hourly_pay) FROM employees) AS 'Average Pay'
FROM employees;        
        
-- Find employee that has an hourly pay greater than the avg pay 


SELECT first_name , last_name , hourly_pay
FROM employees
WHERE hourly_pay > ( 
SELECT AVG(hourly_pay) FROM employees);


CREATE TABLE transactions (
    transaction_id INT PRIMARY KEY,
    amount DECIMAL(5, 2),
    customer_id INT
);


INSERT INTO transactions (transaction_id, amount, customer_id) VALUES
(1000, 4.99, 3),
(1001, 2.89, 2),
(1002, 3.38, 3),
(1003, 4.99, 1),
(1004, 1.00, NULL);

SELECT * FROM transactions;




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


-- Find First name and last name of every customer  that has ever placed an order

SELECT first_name , last_name 
FROM customers
WHERE customer_id IN (
					SELECT DISTINCT(customer_id) 
					FROM transactions
					WHERE customer_id IS NOT NULL);
                    
			











