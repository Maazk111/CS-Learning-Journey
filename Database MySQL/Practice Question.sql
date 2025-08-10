-- Practice Question

-- Writr the Query to find avg marks in each city in accending order 


SELECT city , AVG(marks)
FROM student 
GROUP BY city
ORDER BY city ;


SELECT city , AVG(marks)
FROM student 
GROUP BY city
ORDER BY AVG(marks);


-- For the given table, find the total payment according to each payment method.


CREATE DATABASE bank;

USE bank;

CREATE TABLE payment(

customer_id INT PRIMARY KEY,
customer_name VARCHAR(50),
mode VARCHAR(20),
city VARCHAR(30)

);

INSERT INTO payment
(customer_id , customer_name , mode , city) 
Values
(101, "Olivia Barett", "Netbanking", "Portland"),
(102, "Ethan Sinclair", "Credit Card", "Miami"),
(103, "Maya Hernandez", "Credit Card", "Seattle"),
(104, "Liam Donovan", "Netbanking", "Denver"),
(105, "Sophia Nguyen", "Credit Card", "New Orleans"),
(106, "Caleb Foster", "Debit Card", "Minneapolis"),
(107, "Ava Patel", "Debit Card", "Phoenix"),
(108, "Lucas Carter", "Netbanking", "Boston"),
(109, "Isabella Martinez", "Netbanking", "Nashville"),
(110, "Jackson Brooks", "Credit Card", "Boston");

SELECT * FROM payment;

SELECT mode , COUNT(customer_name)
FROM payment
GROUP BY mode;




