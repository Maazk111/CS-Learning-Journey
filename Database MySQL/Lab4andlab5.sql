CREATE DATABASE uni;

USE uni;


CREATE TABLE factbl(

id INT NOT null,

name varchar(30) UNIQUE

);
INSERT INTO factbl(name)
VALUES
('ali');

CREATE TABLE factbl2(
    id INT AUTO_INCREMENT PRIMARY KEY,
    sem INT,
    CONSTRAINT chk_sem CHECK (sem >= 1 AND sem <= 10)
);




insert into factbl2(sem)
values
(10);


CREATE TABLE course(
    id INT AUTO_INCREMENT PRIMARY KEY,
    cname varchar(30)
);

INSERT INTO course
(cname)
VALUES
('oop'),
('dsa'),
('DB'),
('DB lab');

SELECT * FROM course;

CREATE TABLE student(
    id INT AUTO_INCREMENT PRIMARY KEY,
    sname varchar(30),
    
    c_id int,
    foreign key (c_id) references course(id)
    
    
);

INSERT INTO student
(id , c_id)
VALUES
('maaz',3),
('hammad',2),
('Shayan', 3 ),
('farrukh', 1);





SELECT * FROM student;





