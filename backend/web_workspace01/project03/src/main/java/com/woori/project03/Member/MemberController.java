package com.woori.project03.Member;

import java.util.List;

import com.woori.project03.board.BoardDao;
import com.woori.project03.board.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberController {
	MemberDao dao = new MemberDao();
	
	public List<MemberDto> getList(){
		return dao.getList();
	}
	
	public void Check(HttpServletRequest req, HttpServletResponse resp) {
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");
		
		MemberDto dto = new MemberDto();
		dto.setUserid(userid);
		dto.setPassword(password);
		dao.Check(dto);
	}
	
	public MemberDto getView(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("userid");
		return dao.getView(id);
	}
}
