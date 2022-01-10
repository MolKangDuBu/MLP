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
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
		</thead>
		
		<tbody>
		
		</tbody>
		
			
	</table>
</body>
</html>

<script>

	$(()=>{
		$.ajax({url:"board_list.jsp", dataType:"json"})
				.done(function(data){
					console.log(data);
					data.forEach((e)=>{
						var row = '<tr>';
							row +='<td>'+e.id+'</td>';
							row +='<td>'+e.title+'</td>';
							row +='<td>'+e.writer+'</td>';
							row +='<td>'+e.hit+'</td>';
							row +='</tr>';
							
						$("#mytable>tbody:last").append(row);
					})
				})
				.fail(function(error){
					console.log(error);
				});
					
			
	})
</script>