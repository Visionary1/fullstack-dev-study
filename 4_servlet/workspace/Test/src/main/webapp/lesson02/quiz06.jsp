<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.util.Arrays, java.util.List, java.util.ArrayList" %>
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

	List<String> goodsList = Arrays.asList(new String[]{ 
			"저지방 우유", "요플레 4개", "딸기 1팩", "삼겹살 300g", "생수 6개", "주방 세제"
		});

/* 	out.print("<table><tr><th>번호</th><th>품목</th></tr>");
	
	for (int i = 1; i <= goodsList.size(); i++) {
		out.print("<tr>");
		out.print("<td>" + i + "</td>");
		out.print("<td>" + goodsList.get(i - 1) + "</td>");
		out.print("</tr>");
	}
	
	out.print("</table>"); */

%>

<div class="container">
	<h1 class="text-center">장보기 목록</h1>
	
	<table class="table text-center">
		<tr>
			<th>번호</th>
			<th>품목</th>
		</tr>
		<%
			for (int i = 0; i < goodsList.size(); i++) {
		%>
		<tr>
			<td><%= i + 1 %></td>
			<td><%= goodsList.get(i) %></td>
		</tr>
		<%
			}
		%>
	</table>
</div>



</body>
</html>