import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
create user 'user01'@'localhost' identified by '1234';
grant all privileges on mydb2.* to 'user01'@'localhost';

use mydb;
 drop table board;
 create table board(
  id int primary key not null auto_increment,               
  title varchar(10),
  writer varchar(10),
  contents varchar(10),
  wdate date 
);

insert into board(title, writer, contents, wdate) values('����1', '�ۼ���1', '����1',now());
insert into board(title, writer, contents, wdate) values('����2', '�ۼ���2', '����2',now());
insert into board(title, writer, contents, wdate) values('����3', '�ۼ���3', '����3',now());
insert into board(title, writer, contents, wdate) values('����4', '�ۼ���4', '����4',now());
insert into board(title, writer, contents, wdate) values('����5', '�ۼ���5', '����5',now());

*/


public class Jdbc_Test {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	//8.0 �̻���� allowPublicKeyRetrieval=true �ʿ��� 
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	//localhost -> DB������, ��Ʈ��ȣ, DB�� 
	
	static final String USERNAME = "user01"; //���� 
	static final String PASSWORD = "1234"; 

	public static void main(String[] args) {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("����̺� �ε� ����");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("DB���� ����");
			stmt = conn.createStatement();
			String sql  ="select * from board";
			rs= stmt.executeQuery(sql);
			while(rs.next()) {//Į���� 1���� ����
				System.out.printf("%s %s %s\n", rs.getString(1),rs.getString(2),rs.getString(3));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
