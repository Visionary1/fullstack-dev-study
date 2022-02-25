<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Calendar today = Calendar.getInstance();
	// out.println(today);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
	
	out.println("오늘 날짜: " + sdf.format(today.getTime()));
	
	// 어제 날짜
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	Calendar yesterday = Calendar.getInstance();
	
	yesterday.add(Calendar.DATE, -1); // 하루 전, 오늘 - 1 일
	// yesterday.add(Calendar.MONTH, -1); 
	// yesterday.add(Calendar.YEAR, -1);
	
	out.println("어제 날짜: " + sdf2.format(yesterday.getTime()));
	
	// 두 날짜 비교
	// int comparision compareTo 
	// return 1 if x > y
	// 0 if x = y
	// -1 if x < y
	
	int result = today.compareTo(yesterday);
	if (result > 0) {
		out.print("today가 더 큼");
	} else if (result == 0) {
		out.print("같음");
	} else {
		out.print("작음");
	}
	
%>

</body>
</html>