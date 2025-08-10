-- Create a new database
CREATE DATABASE DB4B;

-- Use the newly created database
USE DB4B;

-- Create a Student table
CREATE TABLE Student (
    rollNumber INT,
    name VARCHAR(10)
);

-- Create a Faculty table
CREATE TABLE Faculty (
    id INT,
    name VARCHAR(10)
);

-- Insert data into the Student table
INSERT INTO Student (rollNumber, name) VALUES
(1, 'Alice'),
(2, 'Bob'),
(3, 'Charlie'),
(2, 'bob'),
(1, 'Alica');

SELECT distinct
rollNumber FROM Student;

SELECT *
FROM
Student 
ORDER BY rollNumber DESC;



-- Insert data into the Faculty table
INSERT INTO Faculty (id, name) VALUES
(1, 'Dr. Smith'),
(2, 'Prof. Jones'),
(3, 'Dr. Brown');
