use mydb;
desc emp;

-- DDL(Data Deinitin Language) - 전체 구조 결정 테이블을 만들고 수정 삭제
-- create, drop, alter
-- DML(Data Manipultion Language) - 데이터조작어, 테이블 내의 데이터만
-- insert, update, delete, select
-- DCL(Data Controll Language) 
-- grant, rollback, commit

-- primary key 부여: 중복제외, null값 제외
alter table emp add constraint PK_EMP primary key(empno);

-- emp 테이블의 deptno는 dept 테이블의 depto와 참조 관계
desc dept;
select* from dept;

-- join 연산이나 서브쿼리 연산을 통해 두개의 테이블로부터 데이터를 만들어낸다.
-- emp 테이블의 부서번호를 보고 dept 테이블로부터 부서명을 가져온다.
-- join 연산이나 서브쿼리 연산이 foreign 키가 없다고 안들어가지는 않음
-- 데이터 입력시 두 테이블에 강한 제약을 가해야함
/*
	emp테이블 입장에서는
		1)dept 테이블에 존재하지 않는 부서번호가 입력되면 안된다.
		부서번호 50번을 넣으면 에러가 발생하도록 한다.
    
    dept 테이블 입장에서는 
		새로운 부서번호를 넣는거는 관계없는데
        기존에 emp 테이블에 있는 부서 번호를 없애면 문제됨, 참조되는 테이블이 있기 때문
        
	foreign key를 줄 수 있는 조건
    참조가 이뤄지는 테이블 필드가 primary ket 거나 또는 unique 제약 조건이여야함
    
    alter table 테이블명 
    add [constraint 제약조건이름] []는 생략가능, 생략하면 시스템이 알아서 부여
    foreign key(필드)
    references 테이블명(필드)
*/ 

alter table emp add foreign key(deptno) references dept(deptno);
-- dept 테이블에 primary key를 추가하자
-- primary key를 부여할때 오류가 발생하는 경우는 - 이미 존재하는 경우, 테이블 내의 데이터가 primary 조건을 만족해야함
alter table dept add primary key(deptno);

delete from dept where deptno = 10; 
drop table dept; -- 테이블 삭제

-- dept를 참조하고 있는 테이블부터 삭제하거나, 나를 참조하는 모든 foreign key를 삭제하고 나서 테이블 삭제 가능
-- 게시판 테이블

create table Member(
 id int primary key,
 user_id varchar(40),
 password varchar(40),
 username varchar(40),
 phone varchar(20),
 email varchar(40),
 zipcode char(5),
 address1 varchar(100),
 address2 varchar(100),
 wdate datetime
);

create table Board(
id int primary key,
user_id varchar(40),
title varchar(1000),
contents longtext,
hit int,
wdate datetime
);

desc Board;

-- Board는 Member 테이블을 참조 중이기에 user_id값이 Meber user_id에 들어가야한다.
insert into board(user_id, title, contents, wdate)
value('tset1', '제목1', '내용1', now());

insert into member(user_id, password, username, phone, email, wdate)
value('test1', '1234', 'ddd', '010-0000-0000', 'home@naver.com', now());

insert into board(user_id, title, contents, wdate)
value('test1', '제목1', '내용1', now());
-- 중복된 값 안들어감

insert into member(user_id, password, username, phone, email, wdate)
value('test3', '1234', 'ㅁㅁㅁ', '010-0002-0000', 'dksl@naver.com',now());

insert into member(user_id, password, username, phone, email, wdate)
value('test4', '12345', '이민규', '010-4783-2038', 'itsok0@naver.com',now());


insert into board(user_id, title, contents, wdate)
value('test4', 'hi', 'bye', now());

select * from board;

insert into member(user_id, password, username, phone, email, wdate)
value('test5', '12345', 'Tom''s company', '010-1111-1111', 'tomsC@naver.com',now());

insert into member(user_id, password, username, phone, email, wdate)
value('test6', '12345', '''Tom''', '010-222-222', 'toms@naver.com',now());


select * from member;

-- join 연산 : 2개 이상의 테이블을 특정 조건에 맞추어서 결합하기
-- inner join/ outer join/ self join
-- emp 테이블의 ename dept 테이블의 dname 조건 emp.deptno-dept.deptno

select ename, dname
from emp
inner join dept on emp.deptno = dept.deptno;

-- board 테이블의 id, title, username, contents, wdate

select board.id, title, username, contents,  board.wdate
from board
inner join member on board.user_id = member.user_id;

use classicmodels;
-- customers 테이블에 salesrepeployeenumber employees 테이블의 employeesnumber와 묶여있음
-- customers cuotomername, employees의 first_name, last_name

select customerName, e.firstName, e.lastName
from customers c
inner join employees e on c.salesRepEmployeeNumber = e.employeeNumber;

-- 문제1 고용인중에 parmela 란 사람이 고객이 누구인지 물건을 팔았는지

select customerName, e.firstName, e.lastName
from customers c
inner join employees e on c.salesRepEmployeeNumber = e.employeeNumber
where e.firstName = 'pamela';

-- inner join 두개의 테이블을 결합해서 만드는데 양쪽 다 필드값이 존재해야함
use mydb;

insert into emp(empno, ename, sal) values(10000,'aaa',5000);
insert into emp(empno, ename, sal) values(9000,'bnb',5100);
insert into emp(empno, ename, sal) values(8900,'nbn',5010);

insert into dept values(80, '개발1부', '서울시');
insert into dept values(1000, '개발2부', '부산시');


select * from emp;
select * from dept;

select ename, dname
from emp
inner join dept on emp.deptno =dept.deptno;


-- outer join 연산 left right
-- from절에 가까운것이 lefe, left outer join - left 쪽 테이블의 내용 다 출력
-- from절에 먼 것이 right, right outer join - right 쪽 테이블의 내용 다 출력

select ename, dname
from emp
left outer join dept on emp.deptno =dept.deptno;

select ename, dname
from emp
right outer join dept on emp.deptno =dept.deptno;

use classicmodels;
-- 문제1. employess 테이블의 
-- firstname, officecode, offices 테이블의 city, addressline1, phone
select e.firstname, e.officecode, o.city, o.addressline1, o.phone
from employees e
left outer join offices o on e.officecode = o.officecode;

-- 문제2. 주문리스트 보이기 order 테이블과 order_detail 테이블은 orderNum으로 묶임
-- product 에 productcode로 묶여있음
-- 주문테이블에서 선적일자, 구입자 이름, 구입 주소, 제품명, 판매수량, 판매단가 출력

select o.shippedDate, c.customerName, c.addressLine1, p.productName, d.quantityOrdered, d.priceEach
from orders o
left outer join orderdetails d on d.orderNumber = o.orderNumber
left outer join Products p on p.productcode = d.productcode
left outer join Customers c on c.customerNumber = o.customerNumber;

-- 문제3 제품라인이 classic cars, vintage cars 중에서 구매하는 고객의 이름, 구입량,
select p.productCode, p.productLine, c.customerName, d.quantityOrdered
from orders o
left outer join Customers c on c.customerNumber = o.customerNumber
left outer join orderdetails d on d.orderNumber = o.orderNumber
left outer join products p on p.productcode = d.productcode 
where p.productLine in ('classic cars', 'vintage cars');


-- self join : 동일한 테이블로 join 하기
-- emp 테이블의 mgr 필드는 사원번호이다. emp 테이블의 mgr 필드는 고용인들 상사의 사원번호이다
-- 즉 동일한 테이블을 join 해야 상사의 이름을 조회 가능하다.

use mydb;
select empno, ename, mgr from emp;

select A.ename, A.mgr, B.ename as managername
from emp A
left outer join emp B on A.mgr = B.empno;

-- 서브 쿼리 : 주쿼리와 서브쿼리로 나눔 
-- 서브쿼리가 먼저 실행됨
-- 실행결과의 레코드 개수에 따라 단일행 쿼리 또는 다중행 쿼리가 만들어진다.
-- 단일행 쿼리는 실행결과값이 없거나 하나인경우, select 절(무조건 단일행쿼리만 가능)이나 where 절에 주로 사용
-- 다중행쿼리는 2개이상 보통 from절에 많이 쓰이고, 인라인뷰라고 한다.

-- join 대체 서브쿼리 (일반적으로 join 성능이 더 좋음)

select ename, deptno, (select dname from dept B where A.deptno = B.deptno) as dname
from emp A;

use classicmodels;
-- 문제1. employess 테이블의 firstname, officecode, offices 테이블의 city, addressline1, phone

select e.firstName, e.officecode, city, addressline1, phone 
from employees e
join offices o on e.officeCode = o.officeCode;


select firstname, A.officecode,
(select city from offices as B where A.officecode = B.officecode) city,
(select addressline1 from offices as B where A.officecode = B.officecode) addressline1,
(select phone from offices as B where A.officeCode = B.officeCode) phone
from employees A;

-- 서브쿼리가 from 절에, join으로 해결 못하는경우
-- group by 함수와 연결될 경우

-- 통계, 데이터 개수나 아니면 합, 제일 큰값, 제일 작은값들
use mydb;
select count(ename) from emp;
select count(comm) from emp;
select count(*) from emp; -- count, sum, max, min, avg, 분산, 표준편차

select sum(sal), max(sal), min(sal), avg(sal) from emp;

-- group by 그룹별로 묶어서 연산가능
-- 부서별로 제일 많은 금액
select max(sal) from emp group by deptno;

-- 부서이름, 최대값 group by에 사용한 필드명은 select에 못씀
select d.dname, max(sal) 
from emp e
inner join dept d on d.deptno = e.deptno
group by e.deptno;

select e.deptno, e.ename, d.maxsal 
from emp e
left outer join(
	select deptno, max(sal) as maxsal
	from emp 
	) d on e.deptno = d.deptno;

select e.deptno, e.ename, d.maxsal 
from emp e
left outer join(
	select deptno, max(sal) as maxsal
	from emp 
    group by deptno
	) d on e.deptno = d.deptno;