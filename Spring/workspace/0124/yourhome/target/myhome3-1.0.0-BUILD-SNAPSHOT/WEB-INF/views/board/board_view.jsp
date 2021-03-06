<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.woori.yourhome.board.*" %>
<%@page import="com.woori.yourhome.common.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
    <%@include file="../include/nav.jsp" %>
   <%
      String key = StringUtil.nullToValue(request.getParameter("key"), "1");
      String keyword = StringUtil.nullToValue(request.getParameter("keyword"), "");
      String pg = StringUtil.nullToValue(request.getParameter("pg"), "0");
   %>
   <%
   BoardDto dto = (BoardDto)request.getAttribute("boardDto");
   %>
   
   <form name="myform">
      <input type="hidden" name="id"      value="<%=dto.getId()%>" >
      <input type="hidden" name="pg"      value="<%=pg%>" >
      <input type="hidden" name="key"     value="<%=key%>" >
      <input type="hidden" name="keyword" value="<%=keyword%>" >
      
    <div class="container" style="margin-top:80px">
        <h2>게시판 상세보기</h2>
        <table class="table table-hover " style="margin-top:30px;">
            <tbody>
              <tr class="table-secondary">
                <th >제목</th>
                <td colspan="3"><%=dto.getTitle()%></td>
              </tr>
              <tr >
                <th >작성자</th>
                <td><%=dto.getUsername()%></td>
                <th>작성일</th>
                <td><%=dto.getWdate()%></td>
       
              </tr>
              <tr>
                <th colspan="4"  >내용</td>
              </tr>
              <tr>
                <td colspan="4">             
               <%=dto.getContents().replaceAll("\n", "<br/>")%>
                </td>
              </tr>
            </tbody>
          </table>

 
       
          <div class="container mt-3" style="text-align:right;">
            <a href="#none" onclick="goList()" class="btn btn-secondary">목록</a>
            <%if(userid.equals(dto.getWriter())){ %>
            <a href="#none" onclick="goModify()" class="btn btn-secondary">수정</a>
            <a href="#none" onclick="goDelete()" class="btn btn-secondary">삭제</a>
          	<%} %>
          </div>
          
          
           <table class="table" style="margin-top:20px" id="tbl_comment">
              <colgroup>
                 <col width="10%">
                 <col width="*">
                 <col width="20%">
              </colgroup>
          <thead>
            <tr>
              <th colspan="3"> 댓글</th>
            </tr>
          </thead>
          <tbody >
          
          </tbody>
        </table>
          
            <input type="hidden" name="userid" id="userid" value="<%=userid%>" />
            <input type="hidden" name="board_id" id="board_id" value="<%=dto.getId()%>" />
            <input type="hidden" name="comment_id" id="comment_id" value="" />
            <div class="mb-3" style="margin-top:13px;">
               <textarea class="form-control" rows="3" id="comment" name="comment"></textarea>
            </div>
            
            <div class="container mt-3" style="text-align:right;" id = "btnRegister">
               <a href="#none" onclick="goCommentWrite()" class="btn btn-primary"><span id ="btnCommentSave">댓글등록</span></a>
            </div>
     
    </div>
    
  
    </form>
</body>
</html>

<script>

$(function(){
   goInit();
});

function goList()
{
   var frm = document.myform;
   frm.action="<%=request.getContextPath()%>/board/list";
   frm.submit();
}

function goModify()
{
   var frm = document.myform;
   frm.action="<%=request.getContextPath()%>/board/modify";
   frm.submit();
}


function goDelete()
{
   if( confirm("삭제하시겠습니까?"))
   {
      var frm = document.myform;
      frm.action="<%=request.getContextPath()%>/board/delete";
      frm.submit();
   }
}

function goInit()
{
   var frmData = new FormData(document.myform);
   console.log( $("#board_id").val() );
       
   $.ajax({
      url:"${commonURL}/comment/list?board_id="+$("#board_id").val(),
      type:"GET",
      dataType:"JSON"
   })
   .done( (result)=>{
       //데이터를 배열형태로 전달받음 
//       $("#tbl_comment>tbody:last").remove();
       for(i=$("#tbl_comment tr").length-2; i>=0; i--){
    	   $("#tbl_comment tr:last").remove();
    	   
       }
       var userid ='<%=userid%>';
       var i=1;
	   result.forEach((item)=>{
			var data = "<tr>";
		 		data += "<td>"+i+"</td>";
		   		data += "<td>"+item.comment+"</td>";
		   		if(userid ==item.userid)
		   			data+= "<td>"+item.username
		   				+"&nbsp<button type = 'button' onclick=goCommentModify('"+item.id+"')>수정</button>"
		   				+"&nbsp<button type = 'button' onclick=goCommentDelete('"+item.id+"')>삭제</button>"
		   				+"</td>"
		   		
		   		else
		   			data +="<td>"+item.username+"</td>";
		   		
		   		data += "</tr>";
		   		i++;
		   console.log(data);
        	$("#tbl_comment>tbody:last").append(data);
        })
      
   })
   .fail( (error)=>{
      console.log(error);
   })
}

function goCommentWrite()
{
	var userid ='<%=userid%>';
	if(userid == ""){
		alert("로그인하세요");
		location.href="${commonURL}/member/login";
	}
	
   var frmData = new FormData(document.myform);
     console.log( frmData );
   $.ajax({
      url:"${commonURL}/comment/insert",
      data:frmData,
      contentType:false,
      processData:false,
      type:"POST",
   })
   .done( (result)=>{
	   $("#comment").val("");
	   $("#btnCommentSave").html("답글등록");
	   $("#comment_id").val("");
       goInit();
   })
   .fail( (error)=>{
      console.log(error);
   })
}


function goCommentModify(comment_id)
{
	
	var userid ='<%=userid%>';
	$("#comment_id").val(comment_id);
	if(userid == ""){
		alert("로그인하세요");
		location.href="${commonURL}/member/login";
	}

   $.ajax({
      url:"${commonURL}/comment/getView?id="+comment_id,

      type:"GET",
      dataType :"json"
   })
   .done( (result)=>{
	   $("#comment").val(result.comment);
	   $("#btnCommentSave").html("저장");
     
   })
   .fail( (error)=>{
      console.log(error);
   })
}

function goCommentDelete(comment_id)
{
	var userid ='<%=userid%>';
	$("#comment_id").val(comment_id);
	if(userid == ""){
		alert("로그인하세요");
		location.href="${commonURL}/member/login";
	}
	if(!confirm("삭제하시겠습니까?"))
		return false;
   var frmData = new FormData(document.myform);
     console.log( frmData );
   $.ajax({
      url:"${commonURL}/comment/delete",
      data:frmData,
      contentType:false,
      processData:false,
      type:"POST",
   })
   .done( (result)=>{
	   $("#comment").val("");
	   $("#comment_id").val("");
       goInit();
   })
   .fail( (error)=>{
      console.log(error);
   })
}
</script>










