
	-- Joins In SQL


CREATE DATABASE joins;

USE joins;

CREATE TABLE student (

  id INT PRIMARY KEY,
  name VARCHAR(50)

);

INSERT INTO student
(id , name) 
VALUES 
(101 , "adam"),
(102 , "bob"),
(103 ,"casey" );



CREATE TABLE course(
id INT PRIMARY KEY,
course VARCHAR(50)
);

INSERT INTO course (id , course)
VALUES
(102, "english"),
(105, "math"),
(103, "science"),
(107, "computer science");

SELECT * FROM student;


SELECT * 
FROM student as a 
INNER JOIN course  as b    -- as keyword (alias) Alternate name to give alternate table name in case of long name of table
ON a.id = b.id;


SELECT * 
FROM student as a 
LEFT JOIN course  as b 
ON a.id = b.id;


SELECT * 
FROM student as a 
RIGHT JOIN course  as b 
ON a.id = b.id;

-- Full JOIN 


SELECT * 
FROM student as a 
LEFT JOIN course  as b 
ON a.id = b.id
UNION 
SELECT * 
FROM student as a 
RIGHT JOIN course  as b 
ON a.id = b.id;


-- Left Exclusive Join

SELECT * 
FROM student as a 
LEFT JOIN course  as b 
ON a.id = b.id
WHERE b.id IS NULL;

-- Right Exlusive Join

SELECT * 
FROM student as a 
RIGHT JOIN course  as b 
ON a.id = b.id
WHERE a.id IS NULL;


-- Full Exclusive Join

SELECT * 
FROM student as a 
LEFT JOIN course  as b 
ON a.id = b.id
WHERE b.id IS NULL
UNION
SELECT * 
FROM student as a 
RIGHT JOIN course  as b 
ON a.id = b.id
WHERE a.id IS NULL;

-- Self Join

CREATE TABLE employee(

id INT PRIMARY KEY,
name VARCHAR(50),
manager_id INT
);

INSERT INTO employee (id, name, manager_id)
VALUES
(101,"adam", 103), 
(102,"bob", 104),
(103,"casey", NULL),
(104,"donald", 103);



SELECT A.name as manager_name, b.name
FROM employee as a
JOIN employee as b 
ON a.id = b.manager_id;


-- UNION in SQL

SELECT name FROM employee 
UNION 
SELECT name FROM employee;


SELECT name FROM employee 
UNION All  -- Return all names 
SELECT name FROM employee;
