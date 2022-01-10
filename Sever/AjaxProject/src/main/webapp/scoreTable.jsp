
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
	<table id="mytable">
		<thead>
				<th>name</th>
				<th>kor</th>
				<th>eng</th>
				<th>mat</th>
				<th>Total</th>
		</thead>
		
		<tbody>
		
		</tbody>
		
			
	</table>
</body>
</html>

<script>

	$(()=>{
		$.ajax({url:"score.jsp", dataType:"json"})
				.done(function(data){
					console.log(data);
					data.forEach((e)=>{
						total = parseInt(e.kor)+parseInt(e.eng)+parseInt(e.mat); 
						var row = '<tr>';
							row +='<td>'+e.name+'</td>';
							row +='<td>'+e.kor+'</td>';
							row +='<td>'+e.eng+'</td>';
							row +='<td>'+e.mat+'</td>';
							row +='<td>'+total+'</td>';
							row +='</tr>';
							
						$("#mytable>tbody:last").append(row);
					})
				})
				.fail(function(error){
					console.log(error);
				});
					
			
	})
</script>