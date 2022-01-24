<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form name = "myform">
		이름 : <input type = "text" name = "name"><br/>
		국어 : <input type = "text" name = "kor"><br/>
		영어 : <input type = "text" name = "eng"><br/>
		수학 : <input type = "text" name = "mat"><br/>
		<button type="button" onClick = "score()">확인</button>
		
	</form>
	

</body>
</html>

<script>
	function score(){
		var frm = document.myform;
		frm.action = "<%=request.getContextPath()%>/homework/score_proc"
		frm.submit();
		
		
	}
	
	
</script>