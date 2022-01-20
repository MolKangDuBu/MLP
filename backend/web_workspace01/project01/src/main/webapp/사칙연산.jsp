<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form name="frm">
		<input type='hidden' name="operator"/>
		x : <input type="text" name ="x"/><br/>
		y : <input type ="text" name = "y"/><br/>
		<button type="button"  name = "key"onclick = "goAdd('1')">+</button>
		<button type="button"  name = "key" onclick = "goAdd('2')">-</button>
		<button type="button"  name = "key" onclick = "goAdd('3')">*</button>
		<button type="button"  name = "key" onclick = "goAdd('4')">/</button>
	</form>

</body>
</html>

<script>
	
	function goAdd(oper){
		var  frm = document.frm;
		frm.operator.value = oper;
		frm.action = "calc.jsp";
		frm.submit();
	}
	
</script>