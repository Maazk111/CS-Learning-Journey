CREATE DATABASE UniLever;

USE UniLever;

-- Create a new table called tblstudents with specified columns
CREATE TABLE tblstudents (
    SID INT PRIMARY KEY,               -- SID as a primary key
    FullName VARCHAR(255),             -- Full name of the student
    Phoneno VARCHAR(20),               -- Phone number
    Email VARCHAR(100),                -- Email address
    EducationBoard VARCHAR(100),       -- Education Board
    DegreeProgram VARCHAR(100),        -- Degree Program
    Sports VARCHAR(255)                -- Sports in which the student is involved
);
