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
		//자바코드 사용 가능함
		
		//jsp - html에 java코드
		//php - html+c
		//asp - html+ visual basic
		//request - 톰캣이 제공하는 기보 객체
		//브라우저에서 오는 정보를 request객체가 받아옴. HashMap과 사용이 비슷
		//request.getParameter("input태그의 name속성"); 값을 반환함.
		String userid = request.getParameter("userid");
	%>
	<%=userid %>
</body>
</html>