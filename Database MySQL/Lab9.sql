show databases;
use se4b;
show tables;
select * from csstudent;
select sname,marks,dept from se4b.csstudent where dept='DS';
delete from csstudent where sname='ahmed' and dept='DS';
select * from csstudent where dept='DS';
select * from csstudent where marks > any (select marks from csstudent where dept='DS');
insert into csstudent(sname,marks,dept)values ('ahmed',80.56,'DS');
select sname,marks,dept from se4b.csstudent where marks > all(select marks from se4b.csstudent where dept='DS');
create table employee(id int primary key auto_increment,name varchar(20),salary float(10,2));
insert into employee(name,salary)values ('Ali',90000.00),('Ahmed',100000.00),('Ahsan',80000.00),('Arham',70000.00);
DELIMITER $$
	CREATE PROCEDURE SalaryStatus(IN e_id int, OUT salary_status varchar(255))
	BEGIN
		DECLARE current_salary float(10,2);
		DECLARE average_salary float(10,2);
		SELECT avg(salary) INTO average_salary FROM employee;
		SELECT salary INTO current_salary FROM employee
		WHERE id = e_id;
		IF current_salary < average_salary THEN
		SET salary_status = "Less than average salary";
		ELSEIF current_salary = average_salary THEN
		SET salary_status = "Equal to average salary";
		ELSEIF current_salary > average_salary THEN
		SET salary_status = "Greater than average salary";
		END IF;
	END$$ 
DELIMITER ;
drop procedure salarystatus;
select * from employee;
select avg(salary) as 'average' from employee;

call salarystatus(4,@salary_status);
select @salary_status as 'Salary Status';
delimiter $$
create procedure sp_case(in eid int,out salary_status varchar(30))
begin
	declare current_salary float(10,2);
    declare max_salary float(10,2);
    select max(Salary) into max_Salary from employee;
    select salary into current_Salary from employee where id=eid;
    case current_salary
    when current_Salary<max_salary then 
    set salary_Status='Less than max salary';
    when current_Salary>max_salary then 
    set salary_Status=' Greater than max salary';
   else
    set salary_Status='Current salary is equal to max salary';
    end case;
end $$;
delimiter ;
drop procedure sp_case;
select * from employee;
call sp_case(3,@salary_status);
select @salary_status as 'Salary Status';
delimiter $$
create procedure sp_loop()
	begin
		declare counter int default 0;
        loopexample:Loop
        set counter=counter+1;
        select counter;
        if counter>10 then
        leave loopexample;
        end if;
        end loop loopexample;
	end $$;
delimiter ;
        
call sp_loop();

Delimiter $$
CREATE PROCEDURE While_Loop()
  BEGIN
DECLARE A INT;
DECLARE XYZ Varchar(50);
 SET A = 1;
SET XYZ = '';
WHILE A <=10 DO
 SET XYZ = CONCAT(XYZ,A,',');
 SET A = A + 1;
 END WHILE;
SELECT XYZ;
END $$
delimiter ;

call while_loop();


use se4b;
drop procedure my_proc_repeat;
DELIMITER $$
CREATE PROCEDURE my_proc_REPEAT (IN n INT)
BEGIN
SET @sum = 0;
SET @x = 1;  
REPEAT   
IF mod(@x, 2) = 0 
THEN   
SET @sum = @sum + @x;   
END IF;   
SET @x = @x + 1;
select @x as 'answer' ;   
UNTIL @x > n 
END REPEAT;
END $$
call my_proc_REPEAT(10);



select * from employee;
create table employee_log(id int,name varchar(20),salary float(10,2),entrytime datetime default now());
delimiter $$
create trigger trg_employee after insert on employee for each row
begin
	insert into employee_log(id,name,salary) values (new.id,new.name,new.salary);
end $$
delimiter ;
insert into employee (name,salary) values('Abdullah',150000);
select * from se4b.employee;
select * from se4b.employee_log;
CREATE TABLE products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100),
    quantity INT,
    status VARCHAR(50)
);
CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    quantity_ordered INT,
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);
insert into products (product_name,quantity,status) values ('Laptop',5,null);
insert into orders (product_id,quantity_ordered) values (1,5);

DELIMITER $$
CREATE TRIGGER after_insert_order
AFTER INSERT ON orders
FOR EACH ROW
BEGIN
    UPDATE products
    SET quantity = quantity - NEW.quantity_ordered
    WHERE product_id = NEW.product_id;
    UPDATE products
    SET status = 'out of stock'
    WHERE product_id = NEW.product_id AND quantity = 0;
END $$
DELIMITER ;
delimiter $$

select * from products;
select * from orders;
delimiter $$
create procedure sp_case2(in eid int,out sal_status varchar(30))
begin
	declare c_Salary float(10,2);
    declare m_Salary float(10,2);
		select salary into c_Salary from employee where id=eid;
        select max(salary) into m_Salary from employee;
        select c_Salary;
	case c_Salary
    when (c_salary<m_salary) then set sal_status='Less than max salary';
	when (c_salary>m_salary) then set sal_status='greater than max salary';
    else
		set sal_status='Equal to max salary';
end case;
end $$
delimiter ;
drop procedure sp_case2;
call sp_case2(3,@sal_Status);
select @sal_status as 'Status';