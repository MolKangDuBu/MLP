<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "com.woori.project03.Member.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
  <%@include file ="../include/nav.jsp" %>
	<%MemberDto dto = (MemberDto)request.getAttribute("memberDto"); %>
    <div  style="margin-top:80px">
    	<%if(dto.getId()!=null){ %>
    	<h1>로그인 성공</h1>
    	<p><%=dto.getId()%></p>
    	<p><%=dto.getUserid()%></p>
    	<p><%=dto.getPassword()%></p>
    	<p><%=dto.getUsername()%></p>
    	<p><%=dto.getEmail()%></p>
    	<p><%=dto.getWdate()%></p>
    	<%}else{%>
    	<h1>로그인 실패</h1>
    	<%}%>
          
    </div>
</body>
</html>