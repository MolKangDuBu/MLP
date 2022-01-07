<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="demo"></div>
	<button type="button"  id = "btnCall" onclick = "loadDoc()">ajax call</button>
</body>
</html>

<script>
	function loadDoc(){
		var xttp = new XMLHttpRequest();//객체 생성
		//onreadystatechange 속성에 callback 함수를 전달함.
		//이 함수는 서버하고 통신 중간중간에 계속 호출됨.
		//readyState라는 속성에는 통신중인 상태에 대한 정보가 담김.
		//0 1 2 3 4로 상태값이 바뀌는데 4일때가 최종 정보를 받은 상태이다.
		//status 라는 속성에는 응답을 받은 상태에 대한 정보가 있다. http프로토콜은 서버의 상태에 대한 정보를
		//전송하는데 200이 성공적으로 응답을 한 상태이고 그밖에 숫자들은 모두 오류 상태를 뜻한다.
		//그리고 전달된 callback 함수에서 위 두개의 속성에 접근하려면 반드시 this를 사용해야 한다.
		//자바와 달리 자바스크립트는 클래스 내에서 this를 절대 생략할 수 없다.
		xttp.onreadystatechange = function(){
			console.log(this.readyState, this.status);
			if(this.readyState ==4 && this.status ==200){
				//이 부분에서 작업을 함.
				console.log(this.responseText);
				document.getElementById("demo").innerHTML=this.responseText;
			}
		}
		
		xttp.open('GET', 'ajax_info.txt', true);//true - 비동기
		xttp.send();
	}
</script>