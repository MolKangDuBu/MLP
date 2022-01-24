<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
	<form name = "myform">
		ID : <input type = "text" name = "userid"><br/>
		Password : <input type = "text" name = "password"><br/>
		<button type="button" onClick="Login()">더하기</button>
	
	</form>
</body>
</html>

<script>

function Login(){
	
	var frm = document.myform;
	frm.action ="<%=request.getContextPath()%>/member/login_login_proc"
	frm.submit();
	
}


</script>