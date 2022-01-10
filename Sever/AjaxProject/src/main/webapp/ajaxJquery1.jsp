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
	<div id="demo"></div>
	<button type="button"  id = "btnCall">ajax call</button>
</body>
</html>

<script>
	$(()=>{
		$("#btnCall").click(()=>{
				//ajax는 함수이다, 함수의 파라미터가 JSON형태로 전달된다.
				
				$.ajax({url:"ajax_info.txt"}).done(function(data){
					console.log(data);
					$("#demo").html(data);
				}).fail(function(error){
					console.log(error);
				});
				
		});
	})
	
</script>