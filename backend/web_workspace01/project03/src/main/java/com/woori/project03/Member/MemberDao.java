package com.woori.project03.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.woori.project03.Member.MemberDto;
import com.woori.project03.Member.MemberDto;
import com.woori.project03.common.DBUtil;

public class MemberDao {

	public MemberDao() {
		try {
			Class.forName(DBUtil.driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<MemberDto> getList(){
		List<MemberDto>list = new ArrayList<MemberDto>();
		
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.pwd);
			String sql = "select * from Member";
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setUserid(rs.getString("userid"));
				dto.setPassword(rs.getString("password"));
				dto.setUsername(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				dto.setWdate(rs.getString("wdate"));
				list.add(dto);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
				try {
					if (rs!=null) rs.close();
					if (stmt!=null) stmt.close();
					if (conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return list;
	}
	
	
	
	void Check(MemberDto dto) {
		List<MemberDto> list = getList();
		String str = "false";
		for(MemberDto l: list) {
			if(dto.getUserid().equals(l.getUserid())&&dto.getPassword().equals(l.getPassword())){
				str = "true";
				getView(dto.getUserid());
				break;
			}
		}
		System.out.println(str);
		
	}
	
	
	MemberDto getView(String userid){
		MemberDto resultDto = new MemberDto();
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs =null;
		
		try {
			conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.pwd);
			String sql = "select * from Member where userid =\""+userid+"\"";
			System.out.println(sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				resultDto.setId(rs.getString("id"));
				resultDto.setUserid(rs.getString("userid"));
				resultDto.setPassword(rs.getString("password"));
				resultDto.setUsername(rs.getString("username"));
				resultDto.setEmail(rs.getString("email"));
				resultDto.setWdate(rs.getString("wdate"));
				
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return resultDto;
	}
}
