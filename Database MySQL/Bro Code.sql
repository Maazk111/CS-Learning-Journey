CREATE  DATABASE brocode;
USE brocode;

CREATE TABLE test(

my_date DATE,
my_time TIME,
my_datetime DATETIME

);

INSERT INTO test
VALUES(CURRENT_DATE() + 1, NULL, NULL);


SELECT * FROM test;

DROP TABLE test;

-- UNIQUE

CREATE TABLE products(

product_id INT,

product_name VARCHAR(25) , -- FORGET TO ADD CONSTRAINT

price DECIMAL(4,2)

);

-- IF YOU FORGET TO ADD CONSTRAINT
ALTER TABLE products
ADD CONSTRAINT UNIQUE(product_name);

INSERT INTO products
VALUES (100 , 'hamburger', 3.99),
	   (101, 'fries', 1.89),
	   (102, 'soda', 1.00),
	   (103, 'ice cream' , 1.49);
	 --  (104 , 'fries', 1.75); -- DUPLICATE ENTRY error

        
        
SELECT * FROM products;

-- NOT NULL CONSTRAINT


ALTER TABLE products
MODIFY price DECIMAL(4,2) NOT NULL;


INSERT INTO products
VALUES (104 , 'cookie', NULL);  -- ERROR CODE 1048 price can't be null

INSERT INTO products
VALUES (104 , 'cookie', 0);



SELECT * FROM products;

-- CHECK CONSTRAINT

CREATE TABLE employee (
    employee_id INT ,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hourly_pay DECIMAL(5, 2),
    hire_date DATE,
    CONSTRAINT chk_hourly CHECK (hourly_pay >= 10.00)
);

ALTER TABLE employee
ADD CONSTRAINT chk_hourly_pay CHECK(hourly_pay >= 10.00);


INSERT INTO employee
VALUES (6 , 'Sheldon' , 'Plankton' , 10.00 , CURRENT_DATE() + 1);

INSERT INTO employee
VALUES (7 , 'Faiz', 'Shamair', 101.00, CURRENT_DATE + 1);


-- to DELETE THE CHECK


ALTER TABLE employee
DROP CHECK chk_hourly_pay;



SELECT * FROM employee;




-- DEFAULT CONSTRINT

-- ADD DEFAULT CONSTRINT 

ALTER TABLE products
ALTER price SET DEFAULT 0;

INSERT INTO products  (product_id , product_name)
VALUES  (104 , 'straw'),
		(105, 'napkin'),
		(106, 'fork'),
		(107, 'spooon');

DELETE FROM products
WHERE product_id >= 104; -- delete all rows after the id 104

SELECT * FROM products;

-- PRIMARY KEY 


CREATE TABLE transactions(
  transaction_id INT PRIMARY KEY,
  amount DECIMAL(5,0)
  
);

ALTER TABLE transactions
ADD CONSTRAINT PRIMARY KEY(amount); -- ERROR CODE 1068 multiple primary key defined

INSERT INTO  transactions
VALUES(105 ,4.99),  -- ERROR CODE 1062 DUPLICATE ENTRY FOR PK
     (102 ,3.99),
     (NULL ,5.99),   -- ERROR CODE 1048 PK CAN'T BE NULL
     (NULL ,5.99);
     
INSERT INTO  transactions
VALUES(102 ,4.99), 
     (103 ,3.99);
    
    
    
SELECT amount 
FROM transactions
WHERE transaction_id = 102;

SELECT * FROM transactions;


-- AUTO_INCREMENT FOR PRIMARY KEY 

CREATE TABLE transactions(
  transaction_id INT PRIMARY KEY AUTO_INCREMENT,
  amount DECIMAL(5,2)
  
);

INSERT INTO  transactions(amount)
VALUES
(5.99),
(7.39);
    
TRUNCATE TABLE  transactions;
    
DELETE FROM transactions; -- SAME AS TRUNCATE

ALTER TABLE transactions
AUTO_INCREMENT = 1000;

SELECT * FROM transactions;


-- FOREIGN KEY CONSTRAINT 


CREATE TABLE customers(

customer_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50)

);

INSERT INTO customers (first_name, last_name) 
VALUES 
    ('Fred', 'Fish'),
    ('Larry', 'Lobster'),
    ('Bubble', 'bass');

SELECT * FROM customers; 




CREATE TABLE transactions(
  transaction_id INT PRIMARY KEY AUTO_INCREMENT,
  amount DECIMAL(5,2),
  customer_id INT,
  FOREIGN KEY(customer_id) REFERENCES customers(customer_id)
  ON UPDATE CASCADE
  ON DELETE CASCADE
);

INSERT INTO transactions(amount , customer_id)
VALUES  (4.99, 3),
		(2.29, 2),
		(3.38, 3),
        (4.99 , 1);

DELETE FROM customers
WHERE customer_id = 3; -- error 1451 can't delete or update a parent row but can with Cascade 


SELECT * FROM transactions; 


-- JOINS






