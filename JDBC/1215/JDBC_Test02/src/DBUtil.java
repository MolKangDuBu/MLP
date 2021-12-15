
public class DBUtil {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	//8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels?allowPublicKeyRetrieval=true";
	//localhost -> DB아이피, 포트번호, DB명 
	
	static final String USERNAME = "user03"; //계정 
	static final String PASSWORD = "1234"; 
}
