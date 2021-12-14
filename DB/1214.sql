-- 서브쿼리
-- 주 쿼리안해서 진행되는 쿼리, select from where 각 절마다 쿼리 사용 가능
-- select 절에서 사용되는 서브쿼리는 joinㅗ가 비스샇ㄴ 기능을 가짐 join > 서브쿼리
use mydb;
select ename, deptno, (select dname from dept d where d.deptno = e.deptno) as dname
from emp e;

-- from 서브쿼리
-- 서브쿼리가 먼저 실행되서 집합이 오는데 이때 집합의 필드나 데이터 개수가 많아도 됨.

select DEPTNO, max(sal)
from emp
group by DEPTNO;

select B.ename, sal, maxsal
from(
	select DEPTNO, max(sal) maxsal
    from emp
    group by DEPTNo
    )A
    right outer join emp B on A.deptno=B.deptno;
    
    
-- 테이블 복사 명령어 없음, 서브쿼리를 사용해서 테이블 구조만 복사하거나 
-- 전체 또는 일부를 복사할 수 있다. 단 제약조건은 복사되지않는다.
-- 서브쿼리를 사용해서 테이블 복제   
-- create table 테이블명 as select 서브쿼리
create table emp2 as select * from emp;
select * from emp2;

create table emp3 as select ename, sal, hiredate from emp where deptno in (10, 20);
select * from emp3;

-- 데이터 빼고 구조만 복사됨
create table emp4 as select * from emp where 1 =0;
select * from emp4;

desc emp2;


-- update 는 데이터를 수정할때 사용하는 명령어
-- update 테이블명 set 필드명1 = '값', 필드명2 = '값2', 필드명3 = '값3' .. where 조건절
-- where 조건절 구문은 select와 동일하다. 

select * from emp2;
update emp2 set gender = 'F';
select * from emp2;

update emp2 set job = 'SAL ESMAN', sal = 9000 where empno = 7566;
select * from emp2;

-- 사원번호가 7654, 7499, 7788, 7839 번의 부서를 50으로 고치고, 성별을 M으로 고치세요
update emp2 set deptno = '50', gender = 'M' where empno in ('7654','7499','7788','7839');


-- MGR이 7839에 해당하는 사원의 COMM을 2000 지불하기
update emp2 set COMM = 2000 where MGR = '7839'; 

-- JOB이 SALESMAN의 COMM 1000 지불하기

update emp2 set COMM = 1000 where job = 'SALESMAN';


-- DELETE from 테이블명 where 조건절 
delete from emp2 where empno in (7369,7399);
delete from emp2;

-- Cross join : 
select a.* , b.* -- Emp 테이블의 데이터개수  M * N  Dept 테이블의 데이터 개수
from emp a
cross join dept b;

-- union 연산 : 테이블들을 하나로 묶고자 할때 사용됨
-- 				필드개수와 필드 타입만 맞으면 연산가능
select empno, ename
from emp
union all
 select deptno, dname
 from dept;
 
--  select id, title , contents from board1 where title like '%코로나%'
--  union all
--  select id, title , contents from board2 where title like '%코로나%'
--  union all
--  select id, title , contents from board3 where title like '%코로나%';
 
 -- 테이블 최대값
 select max(sal), min(sal), avg(sal), count(*) from emp;
 
 select max(sal) from emp
 union all
 select min(sal) from emp
 union all
 select avg(sal) from emp
 union all
 select count(*) from emp;
 
 -- union all - 중복이 있더라도 가져옴. union은 중복제거하고 가져옴
 use classicmodels;
 
 select count(customerNumber), country
 from customers
 group by country
 order by country;
 
 -- 인원수별로 내림차순
  select count(customerNumber), country
 from customers
 group by country
 order by count(customerNumber) desc;
 
 -- select 구문에서 where 절에는 그룹함수를 쓸 수 없다
 -- 고객 숫자가 10명 넘는 나라만 보려고함.
-- where 절은 사용못하고 having절에만 가능
select count(customernumber), country
from customers
group by country
having  count(customerNumber)>=10;


select * from
(
	select count(customerNumber)cnt, country
    from customers
    group by  country
)A
where A.cnt >= 10;


-- 문제 product 테이블에서 porduct line 별로 제품 개수가 5새 이상인 라인과 제품 개수만 출력 내림차순
select productline, count(productline)
from products
group by productline
having count(productline) >=5
order by count(productline) desc;

-- exist : 서브쿼리에 데이터가 존재할 경우 true 값, 존재안할 경우 fasle
-- 	서브쿼리 실행결과 존재유무만 판단

select *
from customers
where exists(
	select productcode
    from products
    where productLine = 'Ships');



-- in : = or =or = or
-- any : > or >or >or...
-- all > and > and >and...

select productcode, quantityOrdered
from orderdetails
where quantityOrdered >= 60;

select productname
from products
where productcode  = (select productcode, quantityOrdered
from orderdetails
where quantityOrdered >= 60);


-- 서브쿼리로 데이터를 만들 수 있다.
-- insert 키워드로 서브쿼리를 이용해서 데이터를 insert 할 수 있다.
create table customers2 as select * from customers where 1=0;

desc customers2;
-- 고객번호를 200번 이하만 custromers2로 옮기기

insert into customers2  select * from customers where customerNumber <=20;
select * from customers2;

-- customers3 테이블을 만들고, country가 null인것만 복사
create table customers3 as select * from customers where 1=0;
insert into customers3 select * from customers where country is null;
select * from customers3;


-- DB도 switch ~ case 문처럼 상황에 따라서 조건을 줄 때가 있음.
-- OrderDetails 테이블의 QuantityOrdered 필드의 값에 따라서 등급을 나누자
/*
case when 조건식 then 처리할수식
	when 조건식2 then 처리함수식2
	else 나머지
end as ailas    
*/

select orderNumber, quantityordered,
	case when quantityOrdered> 30 then 'The quantity is greater than 30'
		when quantityOrdered = 30 then 'The quantity is 30'
        else 'The quantity is under'
        end as orderText
from orderdetails;


use mydb;
-- emp 테이블의 부서 번호가 10 -> 영업부 2-> 홍보부 30->마케팅 40 ->개발1부 else -> 부서배정중

select EMPNo, deptno,
	case when deptno = 10 then '영업부'
		 when deptno = 20 then '홍보부'
         when deptno = 30 then '마케팅'
         when deptno = 40 then '개발1부'
         else '부서 배정중'
		 end empText
from emp;         

update member set password ='kang90' where password ='kang';