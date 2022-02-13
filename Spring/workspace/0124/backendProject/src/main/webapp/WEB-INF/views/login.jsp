<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
   
    <title>로그인 폼</title>
    <style>
        body {
            text-align: center;
        }

  
    </style>



</head>

<body>
    <h1>로그인</h1>
    <hr>
    <form name = "myform">
    <div>
        <p>아이디 <input style="margin-left: 20px;" type="text" id="id" name ="id"></p>
        <p>비밀번호<input style="margin-left: 10px;" type="password" id="password" name = "Password"></p><br />
        <button type = "button" onclick="Login()">로그인</button>&nbsp;
        <button type ="button">취 소</button>
       
    </div>
	</form>

</body>

</html>

<script>
    function Login() {
    
        
    	var queryString = $("form[name=myform]").serialize();
        $.ajax({
         url:"<%=request.getContextPath()%>/login",
         data:queryString,
         type:"POST",
         queryString

       })
         .done( (result)=>{
           if(result.result == "success"){
          	  alert("login ok");
            }else if(result.result =="fail"){
          	  alert("login fail");
            }
           
           
         })
         .fail( (error)=>{
            console.log(error);
         })

    }
</script>