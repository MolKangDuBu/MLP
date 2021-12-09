use classicmodels;
select *
from customers;
-- 테이블구조 확인--
desc customers;

select customerNumber, customername
from customers;

-- ailas : 테이블이나 필드에 별명을 붙여서 사용 가능 --alter
select customername, phone, addressline1 
from customers a;

-- dbms 문자열을 더하는 연산자를 제공하는 경우도 있고 아닌 경우도 있음
-- 문자열을 합산하는 함수의 이름은 concatenate
-- 함수는  dbms마다 다름
-- as는 생략 가능
select concat(contactLastName, " ",contactFirstname) as contractname
from customers;

select customerName, concat(firstname, " ", lastname) as empname
from customers a
inner join employees b on a.salesRepEmployeeNumber = b.employeeNumber;

-- limit 명령어는 mysql에만 있음
select * from employees limit 1000;
use employees;
select count(*) from employees;

select * from titles limit 1000;
desc titles;

desc employees;

select * from employees limit 5;

-- insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
-- values(10001, '1998-09-09', 'Tom', 'Feet', 'M', '2021-01-07');

-- mysql만? 데이터 대소문자를 무시함. 검색할때도 상관없음
select emp_no, birth_date, first_name, last_name
from employees
where first_name ='tom';

select emp_no, birth_date, first_name, last_name, gender
from employees
where substr(birth_date, 1,4) =1998;


select emp_no, substr(birth_date,1 ,4), first_name, last_name,gender
from employees
limit 10;

use classicmodels;

--  01  customers table에서 country가 USA 인 사람들 --

select customerNumber, customerName, phone
from customers
where country = 'USA';

-- 02 customers table 에서 postal code가 4로 시작하는 --
select customerNumber, customerName, phone, postalCode
from customers
where substr(postalCode, 1, 1) = 4;

