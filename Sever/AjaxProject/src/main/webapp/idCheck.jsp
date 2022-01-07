<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%	
		String ID = request.getParameter("userid");
		String result="";
		if(ID.equals("test1"))result+="사용가능한 아이디 입니다.";
		else result+="이미 사용중인 아이디 입니다.";
	%>
	
	{"result":"<%=result %>"}