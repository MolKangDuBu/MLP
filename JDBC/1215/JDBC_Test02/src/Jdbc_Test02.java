import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Jdbc_Test02 { 
	
	 
	public static void main(String[] args) {
		try {
			Class.forName(DBUtil.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn =DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME,DBUtil.PASSWORD);
			stmt = conn.createStatement();
			String sql = "select * from customers";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				customerNumber
//				customerName
//				contactLastName
//				contactFirstName
//				phone
//				addressLine1
//				addressLine2
//				city
//				state
//				postalCode
//				country
//				salesRepEmployeeNumber
//				creditLimit
				System.out.printf("%s\t", rs.getString("customerNumber"));
				System.out.printf("%s\t", rs.getString("customerName"));
				System.out.printf("%s\t", rs.getString("contactLastName"));
				System.out.printf("%s\t", rs.getString("contactFirstName"));
				System.out.printf("%s\t", rs.getString("phone"));
				System.out.printf("%s\t", rs.getString("addressLine1"));
				System.out.printf("%s\t", rs.getString("addressLine2"));
				System.out.printf("%s\t", rs.getString("city"));
				System.out.printf("%s\t", rs.getString("state"));
				System.out.printf("%s\t", rs.getString("postalCode"));
				System.out.printf("%s\t", rs.getString("country"));
				System.out.printf("%s\t", rs.getString("salesRepEmployeeNumber"));
				System.out.printf("%s\n", rs.getString("creditLimit"));
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
	}
}
