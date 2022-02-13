<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<head>
	<title>Home</title>
</head>
<body>
<%@include file="./include/nav.jsp" %>
<h1 style="margin-top :80px;">
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
