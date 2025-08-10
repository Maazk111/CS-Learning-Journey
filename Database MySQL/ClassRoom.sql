CREATE DATABASE collage_1;
USE collage_1;

CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(50),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(20)
);

INSERT INTO student
(rollno, name , marks , grade , city)
VALUES
(101, "anil", 78 , "C" , "Pune"),
(102, "bhumika", 93 , "A" , "Mumbai"),
(103, "chetan", 85 , "B" , "Mumbai"),
(104, "dhruv", 96 , "A" , "Delhi"),
(105, "emanuel", 92 , "F" , "Delhi"),
(106, "farah", 82 , "B" , "Delhi");


-- SELECT name , marks FROM student; -- To view Specific Columns(Field) in Table


SELECT * FROM student; -- To view All Columns(Field) From the Table

SELECT DISTINCT city FROM student; -- To View Unique Values that are not repeated

SELECT * 
FROM student    -- TO view where(Clause) Condition marks is greater than 80 
WHERE marks > 80;


SELECT *
FROM student   -- We can add Multiple Conditions
WHERE grade = "A" AND city = "Mumbai";

-- Using Operators In Clause

SELECT *
FROM student  
WHERE marks + 10 > 100;


SELECT *
FROM student  
WHERE marks BETWEEN 80 AND 90;
 
SELECT *
FROM student  
WHERE city IN ("Delhi", "Mumbai", "Faridabad");

SELECT *
FROM student  
WHERE city	NOT IN ("Delhi", "Mumbai");

-- Limit Clause

SELECT *
FROM student  
LIMIT 3;


SELECT *
FROM student 
WHERE marks > 75  -- We can add Conditions Also
LIMIT 3;

-- Order BY Clause

SELECT *
FROM student 
ORDER BY city ASC;

SELECT *
FROM student 
ORDER BY marks DESC -- To view Top 3 Students
LIMIT 3;

SELECT *
FROM student 
ORDER BY grade ASC;

-- Aggregate Functions  - Performs Cal and returns a Single value

SELECT MAX(marks)
FROM student; 

SELECT MIN(marks)
FROM student; 

SELECT AVG(marks)
FROM student; 

SELECT COUNT(name)
FROM student; 

SELECT COUNT(rollno)
FROM student; 

-- Group By Clause

SELECT city , COUNT(rollno)
FROM student 
GROUP BY city;

SELECT city,name,  COUNT(rollno) -- Error 1055 cuz name is not add in Group By 
FROM student 
GROUP BY city;


SELECT city , AVG(marks)
FROM student 
GROUP BY city;

SELECT grade , COUNT(rollno)
FROM student
GROUP BY grade
ORDER BY grade ASC;


-- Having Clause  -- we can't use Where Clause in Groups

SELECT city , COUNT(rollno)
FROM student
GROUP BY city
HAVING MAX(marks) > 90;

-- SELECT city , COUNT(rollno)
-- WHERE MAX(marks) > 90 -- Error
-- FROM student
-- GROUP BY city;

-- General Order Of Commands 

SELECT city
FROM student
WHERE grade = "A"
GROUP BY city
HAVING MAX(marks) >= 93
ORDER BY city ASC;


-- Table Related Queries

SET SQL_SAFE_UPDATES = 0;  -- To off Save mode -- It Prevents us to mistakly add wrong data in our data base which is not necessary.

		-- UPDATE
        
UPDATE student 
SET grade = "O"  -- To Update Grade 
WHERE grade = "A";

UPDATE student 
SET marks = "82"  -- To Update Marks 
WHERE rollno = "105";

UPDATE student 
SET grade = "B"  -- To Update Grade 
WHERE marks BETWEEN 80 AND 90;

UPDATE student    -- To Increase Marks of all Students
SET marks = marks + 1;

		-- DELETE
        
UPDATE student
SET marks = 12
WHERE rollno = "105";        
        
DELETE FROM student 
WHERE marks < 33;        
        

SELECT *FROM student;

-- Foreign Key AND CASCADE IN Foreign Keys


CREATE TABLE dept(
id INT PRIMARY KEY,
name VARCHAR(50)
);

INSERT INTO dept
VALUES
(101, "English"),
(102, "IT");

UPDATE dept
SET id = 111
WHERE id = 101;

SELECT * FROM dept;

CREATE TABLE teacher(
id INT PRIMARY KEY,
name VARCHAR(50),
dept_id INT,
FOREIGN KEY(dept_id) REFERENCES dept(id)
ON UPDATE CASCADE
ON DELETE CASCADE
);



INSERT INTO teacher
VALUES
(101, "Adam", 101),
(102,"Eve", 102);

SELECT * FROM teacher;



-- Alter Command ( to Change the Schema ) 



ALTER TABLE student 
ADD COLUMN age INT NOT NULL DEFAULT 19;
  
ALTER TABLE student
MODIFY COLUMN age VARCHAR(2);

ALTER TABLE student
CHANGE age stu_age INT;

INSERT INTO student 
(rollno , name , marks , age)
VALUES
(107, "gargi", 68 , 100); -- Error Due to VARCHAR(2) now we use CHANGE COLUMN

ALTER TABLE student
DROP COLUMN stu_age;    

ALTER TABLE student 
RENAME TO stu;

ALTER TABLE stu 
RENAME TO student;

-- Truncate ( to delete Table's data)

TRUNCATE TABLE student;


SELECT * FROM student;

-- Practice Question

-- QS: In the student table

-- a. Change the name of column "name" to full_name.
-- b. Delete all the students who scored marks less than 80
-- Delete the column for grades.      

ALTER TABLE student
CHANGE COLUMN name full_name VARCHAR(50);


DELETE FROM student
WHERE marks < 80;

ALTER TABLE student 
DROP COLUMN grade;

SELECT * FROM student;

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

-- Sub Queries 

-- Find names of all students who scored more than AVG marks

SELECT AVG(marks)
FROM student;


SELECT name , marks 
FROM student
WHERE marks > 87.6667; -- If some other student added then avg will be increase then for dynamic process we use sub queries



SELECT name , marks 
FROM student
WHERE marks > (SELECT AVG(marks) FROM student); -- TO solve big problem  -- Dynamic Process


-- Find the names of all students with even roll numbers


SELECT rollno
FROM student
WHERE rollno % 2 = 0;


SELECT name , rollno
FROM student 
WHERE rollno IN (102,104, 106);


SELECT name , rollno
FROM student 
WHERE rollno IN (     	-- Dynamic Process 
	SELECT rollno
	FROM student                
	WHERE rollno % 2 = 0);  


-- Example with FORM

-- FIND THE MAX marks from the students of delhi 

SELECT * 
FROM student 
WHERE city = "delhi";


SELECT MAX(marks)
FROM (SELECT * FROM student WHERE city = "delhi") AS TEMP;


-- Example with SELECT -- NOT IMP not make any sense

SELECT (SELECT MAX(marks) FROM student) , name 
FROM student;

SELECT (SELECT marks FROM student) , name -- Error sub query returns more than 1 row
FROM student;


-- My SQL Views -- Virtual Tables not real

-- Teacher wants only students from there rollno , name and marks 

CREATE VIEW view1 AS
SELECT rollno , name , marks FROM student;

SELECT * FROM view1
WHERE marks > 90;

DROP VIEW view1;









