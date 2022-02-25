<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Integer x = Integer.valueOf(request.getParameter("x"));
	Integer y = Integer.valueOf(request.getParameter("y"));
	String formula = request.getParameter("formula");
	
	double result = 0;
	String printOp = "";
	
	if (formula.equals("plus")) {
		result = x + y;
		printOp = "+";
	} else if (formula.equals("minus")) {
		result = x - y;
		printOp = "-";
	} else if (formula.equals("multiply")) {
		result = x * y;
		printOp = " X ";
	} else if (formula.equals("divide")) {
		result = x / y;
		printOp = " / ";
	}
	
	// 계산 결과
	// x + " " + formula + + " " + y + " = " + result
%>

	<h1>계산 결과</h1>
	
	<div class="display-3">
		<span><%= x + " " + printOp + " " + y + " = " + result %></span>
	</div>
	
	


</body>
</html>