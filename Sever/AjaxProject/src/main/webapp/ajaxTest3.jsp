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
	이름 : <input type ="text" name = "name" id ="name"><br>
	근무시간 : <input type = "text" name ="worktime" id="worktime"><br>
	시간당 급여액: <input type = "text" name ="pay" id ="pay">
	<button type="button" id = "btnCall" onclick = "loadDoc()">계산</button><br>
	
	<span id = "demo"></span>
</body>
</html>

<script>
	function loadDoc(){
		console.log("aasd");
		var xttp = new XMLHttpRequest();
		
		name = document.getElementById("name").value;
		worktime = document.getElementById("worktime").value;
		pay =document.getElementById("pay").value;
		
		url ="receive2.jsp?name="+name+"&worktime="+worktime+"&pay="+pay;
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