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
  <h1>로그인</h1>

  <div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="아이디" name="userid" id="userid">
  </div>

  <div class="input-group mb-3">
    <input type="password" class="form-control" name="password" id="password" placeholder="페스워드">
  </div>

  
     <div class="container" style="text-align:right">
    
     <div class="btn-group">
       
       <button type="button" class="btn btn-primary" onclick="goWrite()">로그인</button>&nbsp;&nbsp;
       <button type="button" class="btn btn-primary" onclick="goCancel()">취소</button>&nbsp;&nbsp;
     </div>
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

function goWrite()
{
   var frmData = new FormData(document.myform);
   console.log( frmData );
      
   $.ajax({
      url:"${commonURL}/member/login_proc",
      data:frmData,
      contentType:false,
      processData:false,
      type:"POST",
   })
   .done( (result)=>{
      if(result.flag==1){
    	  alert("로그인 되었습니다.");
          location.href="${commonURL}/"; //시작화면으로 이동하기  
      }else if(result.flag ==2){
    	  alert("아이디를 찾을 수 없습니다.");
      }else{
    	  alert("패스워드가 일치하지 않습니다.");
      }

   })
   .fail( (error)=>{
      console.log(error);
   })
}


</script>