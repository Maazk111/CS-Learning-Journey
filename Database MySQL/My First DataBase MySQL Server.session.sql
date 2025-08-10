-- My First Query
CREATE DATABASE college;

USE college;

CREATE TABLE student (

  rollno INT PRIMARY KEY,
  name VARCHAR(50)

);

INSERT INTO student
(rollno , name) 
VALUES 
(101 , "Maaz"),
(102 , "Farrukh"),
(103 ,"Shayan" );

INSERT INTO student VALUES(104 , "Raif");


SELECT * FROM student;



-- Practice Question

CREATE DATABASE company;

USE company;

CREATE TABLE employee(

id INT PRIMARY KEY,
name VARCHAR(50),
salary INT UNSIGNED

);
 
INSERT INTO employee( id , name , salary)
VALUES 
( 1 , "adam" , 25000  ),
( 2 , "bob" , 30000  ),
( 3 , "casey" , 40000  );

SELECT * FROM employee;

-- Constraints

CREATE TABLE temp1(
id INT PRIMARY KEY,
name VARCHAR(50),
age INT,
city VARCHAR(20)

-- PRIMARY KEY(id , name) other Symtax of using Primary Key // Combination will be Unique
);



SELECT * FROM temp1;


CREATE TABLE emp(

id INT,
salary INT DEFAULT 25000
);

INSERT INTO emp (id) VALUES (101);

SELECT * FROM emp;