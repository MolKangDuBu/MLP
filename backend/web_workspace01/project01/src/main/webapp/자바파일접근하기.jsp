<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "com.woori.board.*" %>
    <%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%
	
	List<BoardDto> list = new ArrayList<BoardDto>();
	list.add(new BoardDto("1", "제목1", "김승기", "내용1", "2022-01-18"));
	list.add(new BoardDto("2", "제목1", "김승기", "내용1", "2022-01-18"));
	list.add(new BoardDto("3", "제목1", "김승기", "내용1", "2022-01-18"));
%>


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
           <colspan>
              <col width="8%"/>
              <col width="*"/>
              <col width="12%"/>
              <col width="12%"/>
           </colspan>   
            <thead class="table-secondary">
              <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>내용</th>
                <th>작성일</th>
              </tr>
            </thead>
            <tbody>
   			  <%
				for(int i =0;i<list.size();i++){
					out.println("<tr>");
					out.println("<td>"+list.get(i).getId()+"</td>");
					out.println("<td>"+list.get(i).getTitle()+"</td>");
					out.println("<td>"+list.get(i).getWriter()+"</td>");
					out.println("<td>"+list.get(i).getContents()+"</td>");
					out.println("<td>"+list.get(i).getWdate()+"</td>");
					out.println("<tr>");
				}
					
				%>
            </tbody>
          </table>
          
    </div>
		
</body>
</html>