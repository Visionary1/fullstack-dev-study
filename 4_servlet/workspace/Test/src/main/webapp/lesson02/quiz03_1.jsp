<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz03_1</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<%
	Integer height = Integer.valueOf(request.getParameter("height"));
	Integer weight = Integer.valueOf(request.getParameter("weight"));
	
	double bmi = weight / ((height / 100.0) * (height / 100.0));
	
	String result = "";
	
	if (bmi <= 20) {
		result = "저체중";
	} else if (bmi <= 25) {
		result = "정상";
	} else if (bmi <= 30) {
		result = "과체중";
	} else if (bmi >= 31) {
		result = "비만";
	}
%>

<span class="display-3">BMI : <%= bmi %></span>
<br><br>
<span class="display-4">결과 : <%= result %></span>

</body>
</html>