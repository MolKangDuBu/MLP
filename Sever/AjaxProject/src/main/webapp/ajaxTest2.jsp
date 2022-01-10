<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="myform" id = "myform"></form>
		userid: <input type ="text" name = "userid" id ="userid"><br>
		password : <input type= "text" name = "password" id = "password"><br>
	
		<button type="button" id = "btnCall" onclick="loadDoc()">ajax call</button>
	
		<div id = "demo"></div>
</body>
</html>

<script>
	function loadDoc(){
		var xttp = new XMLHttpRequest();
		
		userid = document.getElementById("userid").value;
		password = document.getElementById("password").value;
		
		url ="receive1.jsp?userid="+userid+"&password="+password;
		console.log(url);
		
		xttp.onreadystatechange = function(){
			console.log(this.readyState, this.status);
			if(this.readyState ==4 && this.status ==200){
				//이 부분에서 작업을 함.
				console.log(this.responseText);
				document.getElementById("demo").innerHTML=this.responseText;
			}
		}
		
		xttp.open('GET', url, true);//true - 비동기
		xttp.send();
	}
</script>