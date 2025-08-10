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
(id , name , GPA , dept , dateOfBirth , IsPromoted ) 
Values
(221053 , "Maaz Khan", 3.94, "Software Engineering" , "2003-07-9" , TRUE ),
(221076 , "Rumaisa", 3.40, "Software Engineering" , "2004-11-14" , TRUE ),
(221005 , "Farrukh", 3.46, "Data Analyst" , "2003-9-1" , TRUE ),
(221075 , "Maria", 3.06, "Computer Science" , "2003-11-10" , FALSE );


INSERT INTO Faculty
Values
(100 , "Mam Yusra", "Software Engineering" , 40000 , "Lab_Teacher" , FALSE ),
(101 , "Mam Sumaira", "Computer Science" , 20000 , "Lecturer" , TRUE ),
(102 , "Mam Sadia", "Psychology" , 30000 , "Senior_lecturer" , FALSE ),
(103 , "Sir Saad", "Data Analyst" , 40000 , "Lab_Teacher" , TRUE );


SELECT id , name , GPA , dept , dateOfBirth , IsPromoted 
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
WHERE id = 102;



UPDATE Faculty
SET salary = 45000 
WHERE id = 100;