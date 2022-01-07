<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name= request.getParameter("name");
	String worktime = request.getParameter("worktime");
	String pay = request.getParameter("pay");
	int result = Integer.valueOf(worktime)*Integer.valueOf(pay);
	
	%>

	<%=name+"님의 주급은"+result+"원 입니다." %>

</body>
</html>