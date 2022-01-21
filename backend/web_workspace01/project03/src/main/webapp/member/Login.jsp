<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form name ="myform" action="<%=request.getContextPath() %>/Member?cmd=check" method ="post">
	<h1>로그인</h1>
	아이디 : <p>  <input type="text"  id="userid" name="userid" 
                        placeholder="아이디" ></p>
     비밀번호 : <p><input type="text"  id="password" name="password" 
                        placeholder="비밀번호" ></p>
                        
 <input type="submit" value="Submit Button">                        
</form>                        
</body>
</html>