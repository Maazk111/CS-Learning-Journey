CREATE DATABASE University;

USE University;

CREATE TABLE Students(
    id INT PRIMARY KEY,
    name CHAR(20),
    GPA FLOAT,
    dept VARCHAR(20),
    dateOfBirth DATE,
    IsPromoted BOOLEAN
);

CREATE TABLE Faculty(
    id INT PRIMARY KEY,
    name CHAR(20),
    dept VARCHAR(20),
    Salary INT UNSIGNED,
    Appointment VARCHAR(15),
    Visiting_Faculty BOOLEAN
);

DESCRIBE Students;

INSERT INTO Students
(id, name, GPA, dept, dateOfBirth, IsPromoted) 
VALUES
(321045, "Aisha Zafar", 3.78, "Electrical Engineering", "2002-05-12", TRUE),
(321067, "Ahmed Ali", 3.55, "Mechanical Engineering", "2003-08-22", TRUE),
(321023, "Sara Khan", 3.62, "Civil Engineering", "2002-09-15", TRUE),
(321089, "Zainab Iqbal", 2.95, "Architecture", "2003-10-30", FALSE);

INSERT INTO Faculty
VALUES
(200, "Dr. Aslam", "Electrical Engineering", 60000, "Professor", FALSE),
(201, "Dr. Bilal", "Mechanical Engineering", 55000, "Associate Professor", FALSE),
(202, "Dr. Farah", "Civil Engineering", 50000, "Assistant Professor", FALSE),
(203, "Ms. Hina", "Architecture", 45000, "Lecturer", TRUE);

SELECT id, name, GPA, dept, dateOfBirth, IsPromoted 
FROM Students;

SELECT *
FROM Faculty;

ALTER TABLE Students
ADD COLUMN phone_NO INT;

ALTER TABLE Students
ADD COLUMN residence VARCHAR(30);

ALTER TABLE Students
MODIFY GPA DOUBLE;

ALTER TABLE Students
MODIFY dateOfBirth VARCHAR(20);

TRUNCATE TABLE Students;

DELETE FROM
Faculty
WHERE id = 202;

UPDATE Faculty
SET Salary = 60000 
WHERE id = 200;
