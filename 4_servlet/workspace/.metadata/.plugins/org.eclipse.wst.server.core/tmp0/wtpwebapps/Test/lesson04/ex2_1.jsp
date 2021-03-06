<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.test.common.MysqlService" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users</title>
</head>
<body>
<%
	// DB connect
	MysqlService mysql = MysqlService.getInstance();

	mysql.connection();
	
	String selectQuery = "select * from `new_student`";
	ResultSet result = mysql.select(selectQuery);
%>

	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>폰번호</th>
				<th>이메일</th>
				<th>드림잡</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<%
			while (result.next()) {
		%>
			<tr>
				<td><%= result.getString("name") %></td>
				<td><%= result.getString("phoneNumber") %></td>
				<td><%= result.getString("email") %></td>
				<td><%= result.getString("dreamJob") %></td>
				<td><a href="/lesson04/user_delete?id=<%= result.getInt("id")%>">삭제하기</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>