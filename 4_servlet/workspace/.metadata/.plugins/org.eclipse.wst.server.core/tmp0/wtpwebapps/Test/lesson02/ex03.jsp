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

String nickname = request.getParameter("nickname");
String[] foodArr = request.getParameterValues("food");



%>

<table border="1">
	<tr>
		<th>별명</th>
		<td><%= nickname %></td>
	</tr>
	<tr>
		<th>취미</th>
		<td></td>
	</tr>
	<tr>
		<th>강아지고양이</th>
		<td></td>
	</tr>
	<tr>
		<th>선호</th>
		<td>
		<%
			if (foodArr != null) {
				String result = "";
				for (String food : foodArr) {
					result += food + ","; // "민트초코"
				}
				
				// 맨 뒤에 붙은 , 제거
				// ex) ab, ab만 가져오려면 substring(0, 2)
				result = result.substring(0, result.length() - 1);
				
				out.print(result);
			}
		 %>
		</td>
	</tr>
	<tr>
		<th>과일</th>
		<td></td>
	</tr>

</table>

</body>
</html>