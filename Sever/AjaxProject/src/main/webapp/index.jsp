<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>홈페이지</h1>
<div>
	<h1> Ajax 테스트</h1>
	<!-- 
	form 태그의 주요속성
	name - 폼태그 객체를 접근하고자 할때 사용됨. document.name속성값으로 객체 접근ㅇ ㅣ가능함
	id - 폼태그 객체를 접근하고자 할때 사용, 주로 Jquery는 id를 사용한다
	action - 요청을 받을 페이지 url을 지정한다. submit을 누르면 action에 있는 파일이 호출되고 
			만약 비어있으면 나를 호출함. <button>전송하기</button> 이게 submit 함수를 자체 호출함.
	method -  전송방식을 지정한다. get, post가 있는데
				
				get은 1000바이트 이내의 보안을 요하지않는 가벼운 정보를 전소할때 주로 사용.
				post는 데이터 크기 제한을 받지 않지만 보통 30MB가 넘어가는 데이터를 보내지 않음.
				
				서버와 클라이언트간 http프로토콜의 정보 전달방식은 
				먼저 header라는 패킷을 보내고 나중에 body라는 패킷을 보냄.
				header에는 브라우저 정보나 운영체제 정보 등 비교적 간단한 정보를 보내고 
				body에는 1000바이트 이상의 데이터들, 파일이나 이미지, 텍스트 등을 전송한다.
				
				post방식은 header와 body를 둘다 보내고
				get방식은 header만 보냄. 
	 -->
	<form name = "form" action="./receive.jsp">
		아이디 : <input type = "text" name ="userid">
		<button onclick="goIDCheck()">아이디중복체크</button>
	</form>
	
	
</div>
</body>
</html>

<script>
	function goIDCheck() {
		var frm = document.form;//form의 name속성값
		frm.method = "post";
		frm.action = "./receive.jsp";
		frm.submit();//서버로 전송
		
	}
</script>