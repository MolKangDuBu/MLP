<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name ="Loginform" method ="post" action = "<%=request.getContextPath()%>/login.do">
		아이디 : <input type = "text" name = "userid"><br/>
		비밀번호 : <input type = "text" name = "password"><br/>
		
		<button type="button" onclick = "goLogin()">LOGIN</button>
	</form>
	
</body>
</html>


<script>

	function goLogin(){
		var frm = document.Loginform;
		
		frm.submit();
		
	}
</script>