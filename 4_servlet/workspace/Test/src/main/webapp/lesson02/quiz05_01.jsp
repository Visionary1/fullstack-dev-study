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
	int length = Integer.valueOf(request.getParameter("length"));

	String[] types = request.getParameterValues("btnradio");
%>

<h2>
<%= length %>
<%

	for (String type : types) {
		if (type.equals("inch")) {
			out.print(length + " in inch");
		} else if (type.equals("feet")) {
			out.print(length + " in feet");
		} else if (type.equals("meter")) {
			out.print(length + " in meter");
		}
	}

%>
</h2>

</body>
</html>