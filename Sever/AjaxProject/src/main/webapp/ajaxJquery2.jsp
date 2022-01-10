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
		userid: <input type ="text" name = "userid" id ="userid"><br>
		password : <input type= "text" name = "password" id = "password"><br>
		<button type="button" id = "btnCall">ajax call</button>
	
		<div id = "demo"></div>
</body>
</html>

<script>
	$(()=>{
		$("#btnCall").click(()=>{
				//ajax는 함수이다, 함수의 파라미터가 JSON형태로 전달된다.
				var userid=$("#userid").val();
				var password=$("#password").val();
				
				$.ajax({
				url:"receive_json.jsp",
				data:{"userid":userid, "password":password},
				dataType:"json"//이 옵션을 안주면 데이터를 문자열로 받아옴
					//결과 데이터를 json으로 받아옴 보내는 쪽에서 json으로 가공해야함
				})
				.done(function(data){
					console.log(data);
					console.log(data.userid);
					console.log(data.password);
					$("#demo").html(data.userid+" "+data.password);
				
				}).fail(function(error){
					console.log(error);
				});
				
		});
	})
	
</script>