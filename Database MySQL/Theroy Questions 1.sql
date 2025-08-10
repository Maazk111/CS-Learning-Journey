CREATE DATABASE InventoryDB;


USE InventoryDB;



CREATE TABLE ProductInventory (
  PID INT,
  ProductName VARCHAR(100),
  Price INT,
  MFGDate DATE,
  ExpiryDate DATE,
  Quantity INT,
  Packing VARCHAR(20)
);


INSERT INTO ProductInventory (PID, ProductName, Price, MFGDate, ExpiryDate, Quantity, Packing) 
VALUES 
(200, 'Tapal Danedar 100gms', 120, '2016-01-10', '2017-06-10', 80, 'Box Pack'),
(201, 'Lipton Tea 150gms', 110, '2016-02-15', '2016-07-15', 75, 'Box Pack'),
(202, 'Falak Rice 5Kg', 600, '2016-03-20', '2016-08-20', 30, 'Box Pack'),
(203, 'Nido Milk Powder 800gms', 550, '2016-04-25', '2016-09-25', 25, 'Pet Bottle'),
(204, 'Maggie Noodles 25gms', 80, '2016-05-30', '2016-10-30', 55, 'Packet'),
(205, 'Fine Sugar 5Kg', 250, '2016-06-30', '2016-11-30', 58, 'Packet'),
(206, 'Rooh Afza 300gms', 220, '2016-06-26', '2016-11-28', 25, 'Glass Bottle'),
(207, 'Michelles Ketchup 300gms', 150, '2016-05-30', '2016-10-30', 10, 'Packet'),
(208, 'Nestle Milk Pack 250gms', 30, '2016-01-28', '2017-01-28', 15, 'Packet'),
(209, 'National Achar 300gms', 150, '2016-07-08', '2017-08-08', 6, 'Glass Bottle'),
(210, 'Nestle Milk Pack 500gms', 60, '2016-02-06', '2016-06-28', 18, 'Packet'),
(211, 'Sheezan Ketchup 500gms', 110, '2016-09-07', '2017-09-07', 8, 'Pet Bottle'),
(212, 'Nestle Milk pack 100gms', 120, '2016-03-07', '2016-03-29', 17, 'Packet');

-- Q1- Show all products of Box Pack.

SELECT ProductName 
FROM ProductInventory
WHERE Packing = 'Box Pack' ;

-- Q2- Show all products of Pet Bottle or Glass Bottle.

SELECT ProductName
FROM ProductInventory
WHERE Packing = 'Pet Bottle' OR  Packing = 'Glass Bottle' ;

-- Q3- Show all products of Quantity from 10 to 50.

SELECT ProductName 
FROM ProductInventory
WHERE Quantity BETWEEN 10 AND 50; 

-- Q4- Show all products of Expires in June.

SELECT ProductName , ExpiryDate
FROM ProductInventory
WHERE ExpiryDate LIKE '%06%';

-- Q5- Show all products of Expires in 2017.

SELECT ProductName , ExpiryDate
FROM ProductInventory
WHERE ExpiryDate LIKE '2017%';

-- Q6- Show all products of 300gms.

SELECT ProductName 
FROM ProductInventory
WHERE ProductName LIKE '%300gms';

-- Q7- Show all products of Quantity more than 70 and Expires in 2016.


SELECT ProductName , ExpiryDate , Quantity
FROM ProductInventory
WHERE Quantity > 70 AND ExpiryDate LIKE '2016%';

-- Q8- Show all products of manufacture in JUN and Expire in NOV.

SELECT ProductName , MFGDate , ExpiryDate
FROM ProductInventory
WHERE  MFGDate LIKE '%06%'AND ExpiryDate LIKE '%11%';

-- Q9- Show all products of Achar.

SELECT ProductName 
FROM ProductInventory
WHERE ProductName LIKE '%Achar%';

-- Q10- Show all product of Ketchup.

SELECT ProductName 
FROM ProductInventory
WHERE ProductName LIKE '%Ketchup%';

-- Q11- Show all products in Kg.

SELECT ProductName 
FROM ProductInventory
WHERE ProductName LIKE '%Kg%';

-- Q12- Show all products in Milk.
SELECT ProductName 
FROM ProductInventory
WHERE ProductName LIKE '%Milk%';

-- Q13: Increase the price of all products by 10%.

UPDATE ProductInventory
SET Price = Price * 1.10;

SET SQL_SAFE_UPDATES =0;

-- Q14: Decrease the price of all products by 5%.

UPDATE ProductInventory
SET Price = Price * 0.95;

-- Q15: 10 boxes of Tapal Danedar 300gms has been sold.

UPDATE ProductInventory
SET Quantity = Quantity - 10
WHERE PID = 200;

-- Q16: 50Rs discount on Rooh Afza 300gms.

UPDATE ProductInventory
SET Price = Price - 50
WHERE PID = 206;

-- Q17: Decrease the price of all Milk products by 5%.

UPDATE ProductInventory
SET Price = Price * 0.95
WHERE ProductName LIKE '%Milk%';

-- Q18: Lipton Tea has been finished in store.


UPDATE ProductInventory
SET Quantity = 0
WHERE PID = 201;

-- Q19: Ketchup is now available in Sachet Pack.

UPDATE ProductInventory 
SET Packing = "Sachet pack"
WHERE ProductName LIKE '%Ketchup%';


-- Q20: Knorr Noodles 25gms, 60Rs of 80 Quantity is available in store.

INSERT INTO ProductInventory (ProductName, Price, Quantity) 
VALUES
('Knorr Noodles 25gms' , 60 , 80);


-- Q21: Colgate Tooth Paste 50gms, 75Rs of 20 Quantity is available in store.

INSERT INTO ProductInventory (ProductName, Price, Quantity) 
VALUES
('Colgate Tooth Paste' , 75 , 20);

SELECT * 
FROM ProductInventory;


