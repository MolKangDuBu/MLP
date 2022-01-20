<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <%@include file ="../include/nav.jsp" %>

    <div class="container" style="margin-top:80px">
        <h2>게시판 상세보기</h2>


        <table class="table table-hover " style="margin-top:30px;">
            <tbody>
              <tr class="table-secondary">
                <th>제목</th>
                <td colspan="5">부트스트랩을 배워봅시다</td>
              </tr>
              <tr>
                <th >작성자</th>
                <td>홍길동</td>
                <th >작성일</th>
                <td>2021-12-27</td>
                <th  >조회수</th>
                <td>12</td> 
              </tr>
              <tr>
                <th colspan="6"  class="table-secondary">내용</td>
              </tr>
              <tr>
                <td colspan="6">
                  내용을 써봅시다<br/>내용을 써봅시다<br/>내용을 써봅시다<br/>내용을 써봅시다<br/>
                  내용을 써봅시다<br/>내용을 써봅시다<br/>내용을 써봅시다<br/>
                </td>
              </tr>
            </tbody>
          </table>

 
         
       
          <div class="container mt-3" style="text-align:right;">
            <a href="#" class="btn btn-secondary">Link Button</a>
            <button type="button" class="btn btn-secondary">Button</button>
            <input type="button" class="btn btn-secondary" value="Input Button">
            <input type="submit" class="btn btn-secondary" value="Submit Button">
            <input type="reset" class="btn btn-secondary" value="Reset Button">
          </div>
          
    </div>
</body>
</html>