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
		String X = request.getParameter("x");
		String Y = request.getParameter("y");
		String operator = request.getParameter("operator");
		int x = Integer.parseInt(X);
		int y = Integer.parseInt(Y);
		String result="";
// 		result = Integer.parseInt(x)+Integer.parseInt(y);	
	switch(Integer.parseInt(operator)){
	case 1:
		result = String.format("%d + %d = %d",x ,y, x+y );	
		break;
	case 2:
		result = String.format("%d - %d = %d",x ,y, x-y );	
		break;
	case 3:
		result = String.format("%d * %d = %d",x ,y, x*y );
		break;
	case 4:
		result = String.format("%d / %d = %d",x ,y, x/y );
		break;
	}
	%>
	
	결과 : <%=result %>
</body>
</html>