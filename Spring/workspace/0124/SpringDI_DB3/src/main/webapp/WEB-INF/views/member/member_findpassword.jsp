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
<form name="myform" id="myform">
   <input type="hidden" name="idcheck" id="idcheck" value="N"/>
   
<div class="container" style="margin-top:80px; width:60%">
  <h1>비밀번호 찾기</h1>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="아이디" name="userid" id="userid">
  </div>

  <div class="input-group mb-3">
    <input type="text" class="form-control" name="email" id="email" placeholder="이메일">
  </div>

  
     <div class="container" style="text-align:right">
    
     <div class="btn-group">
       
       <button type="button" class="btn btn-primary" onclick="goPassword()">비밀번호 찾기</button>&nbsp;&nbsp;
       <button type="button" class="btn btn-primary" onclick="goCancel()">취소</button>&nbsp;&nbsp;
     </div>
     
   </div>
	<div class = "btn-group">
		<div id = "result"></div>
	</div>
</div>

</form>   

</body>
</html>

<script>
$(()=>{
      $("#btnDuplicate").click(()=>{
         $.ajax({
            url:"${commonURL}/member/isDuplicate", //요청 url정보
            data:{userid:$("#userid").val()},   //서버로 전달할 데이터정보: JSON형태
            dataType:"json",  //결과를 jSON으로 받겠다. 결과가 text로 온다
            type:"POST"
         })
         .done((data)=>{
            //데이터가 정상적으로 수신되면 done메서드 호출되면서 매개변수는 전달받은 값
            //값은 dataType 속성을 안주면 text로 온다.
            console.log(data.result);
           if(data.result == "true") //중복
           {
              alert("이미 사용중인 아이디입니다.")
           }
           else
           {
              alert("사용가능합니다.")
              $("#idcheck").val("Y");
              $("#userid").prop("readonly", true);   //수정못하게 막는 기능
              
           }
         })
         .fail((error)=>{
            //통신에러, 오류에 관한 것
               console.log(error)
         })
      })
   })

function goPassword()
{
   var frmData = new FormData(document.myform);
  
      
   $.ajax({
      url:"${commonURL}/member/findpassword_proc",
      data:frmData,
      contentType:false,
      processData:false,
      type:"POST",
   })
   .done( (result)=>{
      if(result.result=="fail"){
    	  alert("해당하는 비밀번호가 없습니다.");
      }else{
    	  $("#result").html("비밀번호는 <strong>"+ result.result+"</strong>입니다."+
    			  "<br/>이름은 "+result.username+"입니다.<br/>"+
    			  "아이디는 "+result.userid+"입니다.");
      }

   })
   .fail( (error)=>{
      console.log(error);
   })
}
function goCancel(){
	location.href="${commonURL}/";
}

</script>