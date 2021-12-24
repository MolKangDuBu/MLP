package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	//8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	static final String DB_URL = "jdbc:mysql://localhost:3306/myproject?allowPublicKeyRetrieval=true";
	//localhost -> DB아이피, 포트번호, DB명 
	
	static final String USERNAME = "root"; //계정 
	static final String PASSWORD = "root"; 
	
	public BookDAO() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("드라이브 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<BookDTO> selectProduct() {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		List<BookDTO> list = new ArrayList<BookDTO>();
		try {
			conn =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			String sql = "select * from book";
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				System.out.printf("%s\t" ,rs.getString("bookNo"));
				System.out.printf("%s\t" ,rs.getString("bookTitle"));
				System.out.printf("%s\t" ,rs.getString("bookAuthor"));
				System.out.printf("%s\t" ,rs.getString("bookYear"));
				System.out.printf("%s\t" ,rs.getString("bookPrice"));
				System.out.printf("%s\n" ,rs.getString("bookPublisher"));
				
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	
		}
		return list;
		
	}
	
	
	public void insertProduct(BookDTO dto) {
		Connection conn =null;
		Statement stmt = null;
		
		try {
			conn =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			String sql = "insert into book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher)";
			sql = sql +"values(";
			sql = sql+" '"+dto.getBookNo()+"' ";
			sql = sql+", '"+dto.getBookTitle()+"' ";
			sql = sql+", '"+dto.getBookAuthor()+"' ";
			sql = sql+", "+dto.getYear()+" ";
			sql = sql+", "+dto.getPrice()+" ";
			sql = sql+", '"+dto.getPublisher()+"') ";
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	
		}
		
	}
	
}
