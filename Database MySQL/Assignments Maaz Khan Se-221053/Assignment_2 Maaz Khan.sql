CREATE DATABASE Workforce;


USE Workforce;


CREATE TABLE Staff (
    employee_id INT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    position VARCHAR(20),
    income FLOAT,
    dob DATE,
    start_date DATE,
    sector VARCHAR(15),
    location VARCHAR(15)
);


INSERT INTO Staff (employee_id, first_name, last_name, position, income, dob, start_date, sector, location)
VALUES
(101, 'John', 'Doe', 'Analyst', 50000, '1985-04-12', '2018-03-01', 'Finance', 'New York'),
(102, 'Jane', 'Smith', 'Consultant', 60000, '1990-07-25', '2019-06-15', 'Consulting', 'Chicago'),
(103, 'Mike', 'Johnson', 'Developer', 70000, '1992-09-30', '2020-01-20', 'IT', 'San Francisco'),
(104, 'Emily', 'Davis', 'Designer', 55000, '1988-11-05', '2017-08-10', 'Design', 'Los Angeles'),
(105, 'David', 'Wilson', 'Manager', 75000, '1985-05-20', '2016-10-05', 'Marketing', 'Boston'),
(106, 'Sarah', 'Miller', 'Engineer', 65000, '1991-03-15', '2020-04-01', 'Engineering', 'Seattle'),
(107, 'James', 'Brown', 'Sales Rep', 58000, '1987-02-08', '2018-07-15', 'Sales', 'Miami'),
(108, 'Linda', 'Taylor', 'HR Specialist', 62000, '1989-12-22', '2019-09-05', 'HR', 'Atlanta');


DESCRIBE Staff;


SELECT first_name, last_name, position, sector
FROM Staff;


SELECT first_name, last_name, income, start_date
FROM Staff
ORDER BY start_date DESC;


SELECT DISTINCT sector
FROM Staff;

SELECT first_name, last_name
FROM Staff
WHERE income < 60000 AND YEAR(start_date) = 2018;


SELECT DISTINCT location
FROM Staff
WHERE location LIKE '%a%' OR location LIKE '%i%';

SELECT sector, first_name, last_name, start_date, income
FROM Staff
WHERE start_date BETWEEN '2016-02-01' AND '2018-10-31'
ORDER BY start_date DESC, income ASC;

SELECT first_name, last_name
FROM Staff
WHERE position = 'Manager' AND location = 'Boston';

SELECT first_name, last_name, position, income, income * 0.15 AS Bonus, income * 1.15 AS `Updated Income`
FROM Staff
WHERE position IN ('Manager', 'HR Specialist');
