use classicmodels;

desc customers;
desc employees;
desc offices;
desc orderdetails;
desc orders;

select * from information_schema.tables;
select * 
from information_schema.columns
where table_schema = 'classicmodels';
-- 원하는 컬럼명을 직접 기술하는것이 속도가 빠름
select customernumber, customername from customers;

-- 테이블명에 ailas를 주고 이를 이용해 컬러명을 주는 것이 좋음
select a.customernumber, a.customername from customers a;

-- 데이터가 숫자타입일 경우에는 where customernumber = 1,
-- 그 밖의 경우에는 데이터를 '' 사용
select a.customernumber, a.customername
from customers a
where a.city = 'Namtes';

select a.customernumber, a.customername
from customers a
where a.customerNumber > 200;

select a.customernumber, a.customername
from customers a
where a.city <> 'Nantes';



select count(*) from products
where buyPrice >=50 and buyprice <=60;
-- between 다른 db에는 없음 값을 포함한다는 의미
select count(*)from products
where buyprice between 50 and 60;
-- 사원번호가 151, 187, 201, 204, 209, 112, 114
select *
from customers
where customerNumber = 151 or customerNumber = 187 or customerNumber = 201 or 
customerNumber = 204 or customerNumber = 209 or customerNumber = 112 or 
customerNumber = 114;

select *
from customers
where customerNumber in(151, 187, 201, 204, 209, 112, 114);

select *
from customers
where customerNumber in(151, 187, 201, 204, 209, 112, 114)
or customerNumber in(190, 175, 180);

select * 
from customers
where state in ('nv', 'ca');

select * from customers
where contactLastname ='King';
-- like % 
select * from customers
where contactLastname like('%gift%');

select * from customers
where contactLastname like('%g___');

select * from products
where productName like'%aston%';

select * from customers
where country = 'Germany' and city = 'berlin';
-- distinct 중복 제거
select distinct country, customerName from customers;

select *
from customers
where country  ='austria' or country  = 'russia';

select *
from customers
where country not in('austria','russia');

-- 수학 연산 모두 가능
use mydb;
select * from emp;

select empno, ename, sal/12 from emp;

-- create table
create table score(
	od int primary key auto_increment,
    name varchar(40),
    kor int,
    eng int,
    mat int
);

insert into score(name, kor, eng, mat) values ('홍길동', 90, 90, 90);
insert into score(name, kor, eng, mat) values ('임꺽정', 80, 80, 70);
insert into score(name, kor, eng, mat) values ('장길산', 60, 90, 80);
insert into score(name, kor, eng, mat) values ('홍경래', 100, 100, 90);
insert into score(name, kor, eng, mat) values ('장승엽', 90, 90, 100);
select * from score;


select name, kor, eng, mat, (kor+eng+mat) total
from score;
-- dbms에 따라 오류
select *, (kor+eng+mat) total
from score;


select a.*, total/3 avgerage
from(
select name, kor, eng, mat, (kor+eng+mat) total
from score
)a;

use classicmodels;

select customername from customers;
-- asc 오름차순 / desc 내림차순
select customernumber, customername, city from customers
order by customername desc;
-- 도시명 오름차순, 이름 내림차순
select customernumber, customername, city from customers
order by city asc, customername desc;

-- customernumber <300

select customernumber, customername, city from customers
where customernumber <=300
order by city asc, customername desc;

-- 문제1 PRODUCTS 테이블에서 product line이  classic cars, vintage cars
-- 이 중에 productcode, productname, productdescription 가져오는
-- buyprice를 내림차순으로 정렬하여 출력

select productcode, productname, productdescription, buyPrice
from products
where productLine in ('classic cars', 'vintage cars')
order by buyPrice desc ;

-- 문제2 . PRODUCTS 테이블에서 productname 에 'ford' 가 들어간 제품중에서 
-- 에서 productcode, productname, productscale, productdescription 을 필드를 
-- productline 은 오름차순, 동일 차순일때 productname 은 내림차순으로 정렬하여 출력하기 

select productLine, productname, productscale, productdescription
from products
where productName like('%ford%')
order by productLine asc, productName desc;

-- 문제3 

select *
from customers
where state not in ('null');

select *
from customers
where state is not null;


use mydb;
-- sal 급여, comm(커미션)이 있는 삶도 있고 없는 사람도 있음
-- sal +comm
-- 컬럼값이 null이면 어떤 연산을 수행해도 결과는 null
select ename, sal, comm, (sal+comm) from emp;

-- ifnull 함수, 자바에서의 함수와 동일
-- ifnull(필드, 값) 만일 필드의 값이 null이 아니면 필드값을 반화, null 이면 두번째 전달자인 값을 반환
-- 함수는 공통이 없어 DBMS마다 다름
select comm, ifnull(comm, 0) from emp;


-- insert into score(name, kor) values('asd', 90);
-- insert into score values(15, 'asd', 90, 90, 90);


desc score;

insert into score (name, kor, eng, mat) values('유재석', 80, 90, null);

-- 데이터에 어떤 문자들은 저장이 안됨
-- ' -> '' , % 

insert into score(name, kor, eng, mat)values('Tom' 's commpany', 90,90,100);
select * from score;


/*
1. not null로 설정할 시 데이터를 생략할 수 있다.
2. 형식 : 컬럼이 많을때는 유용
1) INSERT INTO table_name(colum1, colum2, colum3...)
VALUES (value1, value2, value3,...);

컬럼이 몇개 없는 간단한 테이블
2)INSERT INTO table_name
VALUES(value1, value2, value3...); 컬럼개수만큼 데이터를 모두 집어넣어야함
*/

desc dept;
insert into dept values(50, '개발1부', '서울');
insert into dept(deptno, dname, loc) values(60, '개발2부', '부산'), (70, '개발3부', '인천');

insert into dept values(61, '개발2부', '부산'), (71, '개발3부', '인천');


select * from dept;

desc emp;

insert into emp(empno, ename, sal)values(8000, '홍길동', 5600);
insert into emp(empno, ename, job, sal)values(8000, '홍길동', '개발', 5600);

select * from emp;

-- 테이블에 이미 중복된 값이 들어가 있으면 수정 불가
-- alter table 테이블명 add constraint 프라이머리키 이름 primary key(칼럼);

alter table emp add constraint PK_EMP primary key(empno);
-- Error
-- 중복되는 데이터 삭제
delete from emp where empno =8000 and ename = '장길산';
alter table emp add constraint PK_EMP primary key(empno);
-- emp 테이블의 empno 필드가 primry key가 되었으므로 중복된 키값 안받음.
insert into emp(empno, ename, job, sal)values(8000, '홍길동', '개발', 5600);

use mydb;

select * from score;

select name, ifnull(kor, 0)+ ifnull(eng, 0)+ ifnull(mat, 0) as total, kor, eng, mat
from score



