<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<!-- html 주석 : 소스보기에서 나옴 -->
	<%-- jsp 주석 : 소스보기에서 안 나옴 --%>
	
<%
	// scriptlet
	// java syntax
	
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}	
%>

	<strong>합계 : </strong>
	<input type="text" value="<%= sum %>">
	<br>
	
<%!
	// 선언문 - 클래스같은 느낌
	
	// 필드
	private int num = 100;

	
	// 메소드
	public String getHelloWorld() {
		return "Hello world!";
	}
%>

<%= getHelloWorld() %>
<br>

<%= num + 200 %>
	
</body>
</html>