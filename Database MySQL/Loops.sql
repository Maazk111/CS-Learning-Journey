CREATE DATABASE Company;

USE  Company;

CREATE TABLE Employees(

employee_id INT,
first_name VARCHAR(20),
last_name VARCHAR(20),
designation VARCHAR(20),
salary FLOAT,
birth_date DATE,
hire_date DATE,
department VARCHAR(15),
city VARCHAR(15)
 
);


INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES
(1, 'Maaz', 'Khan', 'Software Engineer', 70000, '2003-07-09', '2016-2-01', 'Engineering', 'Karachi'),
(2, 'Rumaisa', 'Fatima', 'Manager', 85000, '2004-11-14', '2016-2-01', 'Management', 'Lahore'),
(3, 'Farrukh', 'Iqbal', 'Data Analyst', 65000, '2002-9-01', '2015-08-23', 'Analytics', 'Sialkot'),
(4, 'Shayan', 'Adnan', 'UI/UX Designer', 72000, '2003-02-17', '2017-09-17', 'Design', 'Karachi'),
(5, 'Raif', 'Ul-Haque', 'DevOps Engineer', 28000, '2000-05-30', '2018-10-07', 'Engineering', 'Mirpur'),
(6, 'Zohaib', 'Shamim', 'Manager', 63000, '2001-12-14', '2017-03-21', 'Management', 'Islamabad'),
(7, 'Hammad', 'Alam', 'Manager', 76000, '1979-09-29', '2016-05-15', 'Management', 'Lahore'),
(8, 'Alishba', 'Aslam', 'Auditor', 39000, '1987-04-10', '2018-8-18', 'Finance', 'Karachi');


DESCRIBE employees;


SELECT * FROM Employees;

               

-- Any operation

SELECT * 
FROM Employees
WHERE salary > ANY (SELECT MAX(salary) 
				FROM Employees );   
                
                
 -- All operator
 
SELECT * 
FROM Employees
WHERE salary > ALL (SELECT MAX(salary) 
				FROM Employees) AND department = 'Engineering';   




-- MAM ERROR

delimiter $$
create procedure sp_case(in eid int,out salary_status varchar(50))
begin
	declare current_salary float(10,2);
    declare max_salary float(10,2);
    select max(Salary) into max_Salary from Employees;
    select salary into current_Salary from Employees where employee_id=eid;
    case   
    when current_Salary < max_salary then 
    set salary_Status='Less than max salary';
    when current_Salary > max_salary then 
    set salary_Status=' Greater than max salary';
   else
    set salary_Status='Current salary is equal to max salary';
    end case;
end $$;
delimiter ;



select * from Employees;
call sp_case(2,@salary_status);
select @salary_status as 'Salary Status';




-- LOOPS

-- Loop with LEAVE AND ITERATE STATEMENT

DELIMITER $$
CREATE PROCEDURE loop_ex()
	BEGIN
    
     DECLARE counter INT DEFAULT 0;
     
	 loop_example : LOOP
     SET counter = counter + 1;
    -- SELECT counter;
     
     if counter > 10 THEN 
		LEAVE loop_example; -- Like break statement
     ELSEIF counter = 2 THEN
		ITERATE loop_example; -- Like continue statement
     END IF;
     
	 SELECT counter; -- printing the counter
         
     END LOOP loop_example;
    
    END $$
DELIMITER ;  

CALL loop_ex();



-- WHILE LOOP
/*
In a WHILE loop, the condition is checked at the beginning of each iteration. If the condition is true,
the loop body is executed. If the condition is false, the loop is terminated and the control moves to the
statement following the loop.
*/

DELIMITER $$
CREATE PROCEDURE While_loop()
	BEGIN
    
    DECLARE A INT;
    DECLARE XYZ VARCHAR(50);
    
    SET A = 1;
    SET XYZ = ' ';
    
    WHILE A <= 10 DO 
    SET XYZ = CONCAT(XYZ,A,',');
    SET A = A + 1;
    END WHILE;
    
    SELECT XYZ;
    
	END $$
DELIMITER ;    
    

CALL While_loop();


-- REPEAT UNTIL (DO WHILE)

 
 /*
 In a REPEAT loop, the loop body is executed first, and then the condition is checked. If the
 condition is false,the loop body is executed again. If the condition is true, the loop is terminated
 and the control moves to the statement following the loop.
 */
 
DELIMITER $$
CREATE PROCEDURE While_loop()
	BEGIN
    
    DECLARE A INT;
    DECLARE XYZ VARCHAR(50);
    
    SET A = 1;
    SET XYZ = ' ';
   
    REPEAT 
    SET XYZ = CONCAT(XYZ,A,',');
    SET A = A + 1;
    UNTIL A > 11 
    END REPEAT;
    
    
    SELECT XYZ;
	END $$
DELIMITER ;    
    

CALL While_loop();

-- Another example


DELIMITER $$
CREATE PROCEDURE Repeat_Loop(IN n INT)
BEGIN
    DECLARE sum INT DEFAULT 0;
    DECLARE x INT DEFAULT 1;
    
    REPEAT
        IF MOD(x, 2) = 0 THEN
            SET sum = sum + x;
        END IF;
        
        SET x = x + 1;
    UNTIL x > n
    END REPEAT;
    
    SELECT sum AS 'Sum of Even Numbers';
END $$
DELIMITER ;

CALL Repeat_Loop(10);








