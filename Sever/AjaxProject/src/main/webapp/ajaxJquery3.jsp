<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<form action="myform" id = "myform"></form>
	이름 : <input type ="text" name = "name" id ="name"><br>
	근무시간 : <input type = "text" name ="worktime" id="worktime"><br>
	시간당 급여액: <input type = "text" name ="pay" id ="pay">
	<button type="button" id = "btnCall">계산</button><br>
	
	<span id = "demo"></span>
</body>
</html>

<script>
	$(()=>{
		$("#btnCall").click(()=>{
				//ajax는 함수이다, 함수의 파라미터가 JSON형태로 전달된다.
				var name=$("#name").val();
				var worktime=$("#worktime").val();
				var pay = $("#pay").val();
				$.ajax({url:"receive2.jsp", 
					data:{name:name, worktime:worktime, pay:pay}})
				.done(function(data){
					console.log(data);
					$("#demo").html(data);
				}).fail(function(error){
					console.log(error);
				});
				
		});
	})
	
</script>