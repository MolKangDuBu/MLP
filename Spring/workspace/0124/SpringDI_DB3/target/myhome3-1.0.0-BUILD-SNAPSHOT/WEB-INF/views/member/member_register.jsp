<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  
</head>
<body>

<%@include file="../include/nav.jsp" %>

<div class="container mt-3" style = "margin-top:80px">
  <h1>회원가입</h1>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="아이디" name="user_id" id="user_id">
    <div class="input-group-append">
      <button class="btn btn-success" type="button" id ="btnDuplicate">중복체크</button>  
     </div>
  </div>

  <div class="input-group mb-3">
    <input type="password" class="form-control" name="password" id="password" placeholder="페스워드">
  </div>

  <div class="input-group mb-3">
    <input type="password" class="form-control" name="password2" id="password2" placeholder="패스워드확인">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="이름" name="username" id="username">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="닉네임" name="nickname" id="nickname">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="email" name="email" id="email">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="전화번호" name="phone" id="phone">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="우편번호" name="zipcode" id="zipcode">
  </div>
  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="도로주소" name="address1" id="address1">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="상세주소" name="address2" id="address2">
  </div>    
  


  <!-- 다음 우편 api :주소체계 번지 -> 길  -->
  
  	<div class="container" style="text-align:right">
	 
	  <div class="btn-group">
	    
       <button type="button" class="btn btn-primary" onclick="goWrite()">등록</button>&nbsp;&nbsp;
      
	    <button type="button" class="btn btn-primary" onclick="goCancel()">취소</button>&nbsp;&nbsp;
	  </div>
	</div>
</form>	
</div>

</body>
</html>

<script>
function goWrite()
{
	var frm = document.form;
	frm.action="/board/save";
	frm.submit();
}

function goModify()
{
	var frm = document.form;
	frm.action="/board/modify_save";
	frm.submit();
}

function goCancel()
{
  var frm = document.form;
	frm.action="/board/list";
	frm.submit();
}
</script>