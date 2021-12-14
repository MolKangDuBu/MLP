-- 한글 깨짐 방지
-- mysql 설정

create database test;

create database test2 default character set utf8 collate utf8_general_ci;

-- cmd 
-- mysql -u root -p
use test;
create table Person(
	PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    address varchar(255),
    city varchar(255)
);
insert into Person(personid, lastname, firstname, address, city)
values(1, '김','정민', '서울시 은평구', '서울'),
(2, '김','경하', '서울시 강남구', '서울'),
(1, '전','종국', '경기도 용인시', '용인'),
(1, '이','진호', '서울시 관악구', '서울'),
(1, '장','길산', '경기도 광명시', '광명');

select * from person;

-- 관공서 전용필드 작성일, 수정일, IP 실세로는 delete로 삭제 못함
-- delyn char(1) default 'N' 삭제시 'Y'


show tables;

create table person2 as select * from person;
show tables;

drop table person2;

-- 수정 alter
-- 필드 추가나 삭제는 잘되는데 수정할때 데이터가 있으면, 변경 후 데이터가 타입변경이 안될경우 제약이 많다.
-- alter table 테이블명 add column명 데이터 타입

alter table person add phone varchar(40);
alter table person add emil varchar(40);

desc person;



-- 삭제 alter table 테이블명 drop 컬럼명

alter table person drop emil;

alter table person modify phone varchar(100);
-- 데이터가 없을 경우는 수정가능함.
alter table person modify phone int;
alter table person modify lastname int;

/*
제약조건

NOT NULL - 필드에 NULL 값이 들어가면 오류발생
UNIQUE - NULL값이 허용되지만 중복값은 안됨.
PRIMARY KEY = NULL, 중복값 안도미
FOREIGN KEY - 참조하는 테이블가 서로 연결되어있어서 서로 제약함
CHECK - 특정범위 값만 입력되어야 한다. ex) 성별, 성적 등등
DEFAULT - 아무값도 안넣을 경우에 기본값이 들어가야한다.
*/

create table student
(
	id int not null,
    name varchar(40) not null,
    kor int,
    eng int,
    mat int
);

insert into student(id, name) values(1, '가'), (2, '나');
select * from student;

create table person2(
 id int not null,
 lastname varchar(20) not null,
 firstname varchar(30),
 age int,
 unique(id)
);

insert into person2 values(1, '김', '민경', 33);
insert into person2 values(1, '김', '민경', 33);

select * from person2;


create table person3(
 id int not null,
 lastname varchar(20) not null,
 firstname varchar(30),
 age int,
 constraint UC_Person unique(id, lastname)
);

insert into person3 values(1, '김', '민경', 33);
insert into person3 values(1, '이', '민경', 33);
insert into person3 values(1, '김', '민경', 33);

select * from person3;

alter table person3 drop index uc_person;

use information_schema;
select * from TABLE_CONSTRAINTS where table_name like 'preson%';

show tables;

-- 데이터베이스 만들기 : myproject 
create database myproject default character set utf8 collate utf8_general_ci;
use myproject;

-- 1. 다음의 테이블을 작성하세요
create table MEMBER(
	seq int(6) NOT NULL primary key auto_increment,
    userid varchar(40) NOT NULL UNIQUE KEY,
    password varchar(40),
    username varchar(40),
    email varchar(40),
    wdate date
);

-- 2. 위에서 만든 테이블의 다음 데이타를 추가하는 쿼리를 작성하세요
-- 쿼리는 하나만 제출하고 나머지는 insert 쿼리로 데이타를 추가하세요
insert into MEMBER values(1, 'hong', '1234', '홍길동', 'hong@hanmail.net', now()),
(2, 'kim1', 'kim1', '김민정', 'kim@naver.com', now()),
(3, 'sde', 'sde1234', '김정하', 'sde@nate.com', now()),
(4, 'test1 ', 'test', '고은배', 'real@nate.com', now()),
(5, 'kang', 'kang48', '박정향', 'park@hanmail.net', now());

-- 3. 위의 테이블에서 아이디가 kang 인 사람의 이름과, 이메일을 추출하는 쿼리를 작성하시오(select)
select username, email
from member
where userid = 'kang';

-- 4. 아이디가 kang 인 사람의 패스워드를 kang90 으로 변경하시오. 쿼리를 작성하시오
update member set password ='kang90' where password ='kang';

-- 3. 다음의 테이블을 작성하세요 
create table BOARD(
	seq int NOT NULL primary key,
    userid varchar(40),
    title varchar(400),
    contents varchar(4000),
    wdate datetime,
    foreign key (userid) references MEMBER(userid)
);

-- 4. 다음 데이타  추가
insert into BOARD value(1,'kang','학원가기 싫음 ㅜㅜ','비오면 더 싫음', now()),
(2, 'hong', 'C는 왤케 어려움?','그르게 ㅜㅜ', now()),(3, 'sde', 'MFC 는 더 짱나', '대체 누가 만든거임?', now());

-- 5. 두개의 테이블을 조인하여 다음처럼 출력되게 만드시오 
select b.seq, m.userid, m.username, m.email, b.title
from BOARD b
inner join MEMBER m on b.userid = m.userid;

-- 6. 위의 출력을 조인이 아닌 서브쿼리를 이용해서 작성하시오.
select b.seq, 
(select userid from member m where b.seq = m.seq) userid,
(select username from member m where b.seq = m.seq) username, 
(select email from member m where b.seq = m.seq) email, 
b.title
from BOARD b;

-- 7. MEMBER 테이블의 데이타 전체 건수를 구하는 쿼리를 작성하시오.
select count(seq)
from member;