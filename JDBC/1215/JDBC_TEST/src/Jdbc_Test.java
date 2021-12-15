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

insert into board(title, writer, contents, wdate) values('제목1', '작성자1', '내용1',now());
insert into board(title, writer, contents, wdate) values('제목2', '작성자2', '내용2',now());
insert into board(title, writer, contents, wdate) values('제목3', '작성자3', '내용3',now());
insert into board(title, writer, contents, wdate) values('제목4', '작성자4', '내용4',now());
insert into board(title, writer, contents, wdate) values('제목5', '작성자5', '내용5',now());

*/


public class Jdbc_Test {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	//8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	//localhost -> DB아이피, 포트번호, DB명 
	
	static final String USERNAME = "user01"; //계정 
	static final String PASSWORD = "1234"; 

	public static void main(String[] args) {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("드라이브 로딩 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("DB연결 성공");
			stmt = conn.createStatement();
			String sql  ="select * from board";
			rs= stmt.executeQuery(sql);
			while(rs.next()) {//칼럼이 1부터 존재
				System.out.printf("%s %s %s\n", rs.getString(1),rs.getString(2),rs.getString(3));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
