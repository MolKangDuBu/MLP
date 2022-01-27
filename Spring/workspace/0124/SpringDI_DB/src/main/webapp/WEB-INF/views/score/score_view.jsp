<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.woori.myhome.score.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
    <%@include file="../include/nav.jsp" %>

	<%
	ScoreDto dto = (ScoreDto)request.getAttribute("scoreDto");
	%>
    <div class="container" style="margin-top:80px">
        <h2>게시판 상세보기</h2>
        <table class="table table-hover " style="margin-top:30px;">
            <tbody>
              <tr  class="table-secondary">
                <th colspan="12" >성적표</th>
              </tr>
              <tr>
                <th >이름</th>
                <td><%=dto.getName()%></td>
                <th >국어</th>
                <td><%=dto.getKor()%></td>
                <th  >수학</th>
                <td><%=dto.getMat()%></td>
                <th >영어</th>
                <td><%=dto.getEng()%></td>
                <th >과학</th>
                <td><%=dto.getScience()%></td>
                <th >총점</th>
                <td><%=dto.gettotal()%></td>
      
              </tr>
              <tr>
                <th colspan="12"  class="table-secondary">평균</td>
              </tr>
              <tr>
                <td colspan="12">             
					<%=dto.getevg()%>
                </td>
              </tr>
            </tbody>
          </table>

 
         
       
          <div class="container mt-3" style="text-align:right;">
            <a href="<%=request.getContextPath()%>/score/list" class="btn btn-secondary">목록</a>
         
          </div>
          
    </div>
</body>
</html>


