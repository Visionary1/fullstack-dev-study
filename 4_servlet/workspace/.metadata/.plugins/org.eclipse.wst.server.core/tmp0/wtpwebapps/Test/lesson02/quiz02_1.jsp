<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>

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
	String type = request.getParameter("type");

	Date now = new Date();
	SimpleDateFormat sdf;

	if (type.equals("time")) {
		// 시간 출력
		sdf = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초.");
		
	} else {
		// 날짜 출력
		sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
	}
	
	String result = sdf.format(now);
%>

<div class="container">
	<span class="display-3"><%= result %></span>
</div>

</body>
</html>