<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello jsp
	<%
		String name ="홍길동";
		int age= 23;
		System.out.println(name);
		System.out.println(age);
		
		out.println(name+"<br/>");//태그로 html문서에 출력됨
		out.println(age+"<br/>");//태그로 html문서에 출력됨
		
	%>
	
	이름 : <%=name%><br/>
	나이 : <%=age%><br/>
	
</body>
</html>