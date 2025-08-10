-- INDEX (BTree data structure)
-- Indexes are used to find values within a specific column more quickly
-- MySQL normally searches sequentially through a column
-- The longer the column, the more expensive the operation is
-- UPDATE takes more time, SELECT takes less time


CREATE DATABASE sqlindexes;

USE sqlindexes;


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

SHOW INDEXES FROM customers;

CREATE INDEX last_name_idx 
ON customers(last_name);

SELECT * 
FROM customers 
WHERE last_name = 'puff'; -- FASTER

SELECT * 
FROM customers 
WHERE first_name = 'Poppy'; -- SLOWER


-- MULTI COLUMN INDEX

CREATE INDEX last_name_first_name_idx
ON customers(last_name , first_name);



-- DROP AN INDEX

ALTER TABLE customers
DROP INDEX last_name_idx;



SHOW INDEXES FROM customers;

SELECT * 
FROM customers 
WHERE last_name = 'puff' AND first_name = 'Poppy';



-- ROLLUP

-- ROLLUP, extension of the GROUP BY clause
-- produces another row and shows the GRAND TOTAL (super-aggregate value)


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


SELECT * FROM transactions;

SELECT SUM(amount) , order_date
FROM transactions
GROUP BY order_date WITH ROLLUP;

SELECT COUNT(transaction_id) , order_date
FROM transactions
GROUP BY order_date WITH ROLLUP;

SELECT COUNT(transaction_id) AS '# of Orders' , customer_id
FROM transactions
GROUP BY customer_id WITH ROLLUP;

SELECT * FROM employees;

SELECT SUM(hourly_pay) AS 'hourly pay' , employee_id
FROM employees
GROUP BY employee_id WITH ROLLUP;









