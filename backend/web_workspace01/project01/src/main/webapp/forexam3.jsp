<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단</h1>
	<!-- http://localhost:9000/project01/forexam3.jsp?dan=4 
		 request 객체 : 클라이언트로부터 요청을 받아 처리하는 객체이다. getParameter("key")-->
		
	<%
		String sDan = request.getParameter("dan");
		int dan = Integer.parseInt(sDan);
		for(int i=1; i<10;i++){
			out.println("<p>"+i+" x "+dan+"="+i*3+"</p>");
		}
	%>
</body>
</html>