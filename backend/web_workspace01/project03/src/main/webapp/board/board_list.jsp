<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import = "java.sql.*" %>
<%@page import = "java.util.*" %>
    
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
<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	String user = "user01";
	String pwd = "1234";
	
	Connection conn=null;
	Statement stmt =null;
	ResultSet rs =null;
	
	try
	{
	   Class.forName(driver);
	   System.out.println("드라이버 로딩 성공");
	   conn = DriverManager.getConnection(url, user, pwd);
	   System.out.println("연결 성공");
	   String sql = "select * from board";
	   stmt = conn.createStatement();
	   rs = stmt.executeQuery(sql);
	}
	catch(Exception ex)
	{
	   ex.printStackTrace();
	}
%>
<%@include file ="../include/nav.jsp" %>


    <div class="container" style="margin-top:80px">
        <h2>게시판 목록</h2>

        <div class="input-group mb-3" style="margin-top:20px;">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                선택하세요
            </button>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="#">제목</a></li>
              <li><a class="dropdown-item" href="#">내용</a></li>
              <li><a class="dropdown-item" href="#">제목+내용</a></li>
            </ul>
            <input type="text" class="form-control" placeholder="Search">
            <button class="btn btn-secondary" type="submit">Go</button>
          </div>

        <table class="table table-hover ">
        	<colgroup>
        		<col width="8%">
        		<col width="*">
        		<col width="12%">
        		<col width="12%">
        	</colgroup>
            <thead class="table-secondary">
              <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
              </tr>
            </thead>
            <tbody>
            <%while(rs.next()){ %>
              <tr>
                <td><%=rs.getString("id") %></td>
                <td><%=rs.getString("title") %></td>
                <td><%=rs.getString("writer") %></td>
                <td><%=rs.getString("wdate") %></td>
              </tr>
              <%}%>
             </tbody>
          </table>
			
		<%
			if (rs!=null) rs.close();
			if (stmt!=null) stmt.close();
			if (conn!=null) conn.close();
			
		%>
 
          <ul class="pagination  justify-content-center">
            <li class="page-item disabled"><a class="page-link" href="#">first</a></li>
            <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item"><a class="page-link" href="#">4</a></li>
            <li class="page-item"><a class="page-link" href="#">5</a></li>
            <li class="page-item"><a class="page-link" href="#">Next</a></li>
            <li class="page-item"><a class="page-link" href="#">last</a></li>
          </ul>
       
          <div class="container mt-3" style="text-align:right;">
            <a href="<%=request.getContextPath()%>/board?cmd=write" class="btn btn-secondary">글쓰기</a>
            
          </div>
          
    </div>
</body>
</html>