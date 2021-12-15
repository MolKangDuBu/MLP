use myproject;


create table product(
product_id char(4) primary key,
product_name varchar(200),
product_model varchar(200),
maker varchar(200),
price int
);

insert into product values('P001', '휴대폰', '갤럭시S21', '삼성전자', '800000'),
						  ('P002', '노트북', 'LG', '삼성전자', '1400000'),
                          ('P003', '마이크', 'S1304', '로지텍', '1800000');
				
select * from product;
                        
                          
