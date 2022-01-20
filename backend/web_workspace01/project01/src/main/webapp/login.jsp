<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name = "frm">
	
	userid : <input type = "text" name= "userid"><br/>
	password : <input type = "password" name =  "password"><br/>
	
	<input type = "submit" value = "보내기" onclick="goSend()"/><br/>
	<button onclick="goSend()">보내기</button><br/>
	
	
	<input type = "button" value = "보내기" onclick="goSend()"/><br/>
	<button type ='button'  onclick="goSend()">보내기3 </button>

</form>

</body>
</html>

<script>
	function goSend(){
		var  frm = document.frm;
		if(frm.userid.value.trim()==""){
			alert("아이디를 입력해주세요");
			frm.userid.focus();
			return false; //중간에 끝냄
		}
		if(frm.password.value.trim()==""){
			alert("비밀번호를 입력해주세요");
			frm.password.focus();
			return false;
		}
		
		frm.action ="login_proc.jsp";
		frm.submit();
	}
</script>