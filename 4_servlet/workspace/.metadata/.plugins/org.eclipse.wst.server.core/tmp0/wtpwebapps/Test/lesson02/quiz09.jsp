<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">

	<h3>오늘부터 1일</h3>
	<%
		Calendar today = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// for (int i - 100; i <= 1000; i += 100)
		for (int i = 1; i < 11; i++) {
			today.add(Calendar.DATE, +(i * 100));
	%>
			<div class="d-flex">
				<span class="display-4"><%= i * 100 %>일: </span>
				<span class="display-3 text-danger"><%= sdf.format(today.getTime())  %></span>
			</div>
	<%
		}
	%>

<!-- 
	quiz10 과제
 -->
</div>
</body>
</html>