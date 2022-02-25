<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.test.common.MysqlService"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3. 목록 출력하기</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<!-- 3. 목록 출력하기
jsp를 이용해서 즐겨찾기 table 태그로 출력하세요.
id 를 기준으로 내림차순으로 출력하세요.
출력 컬럼은 name, url 입니다.
url 내용을 a 태그를 이용해서 연결이 되도록 하세요. -->

<div class="container">
	<table class="table text-center">
		<thread>
		<tr>
			<th>사이트</th>
			<th>주소</th>
			<th>삭제하기</th>
		</tr>
		</thread>
		<tbody>
			<%
			MysqlService sql = MysqlService.getInstance();
			sql.connection();
			String selectQuery = "select * from `links`";
			ResultSet result = sql.select(selectQuery);
			while (result.next()) {
			%>
			<tr>
				<td><%=result.getString("name")%></td>
				<td><a href="<%=result.getString("url")%>"><%=result.getString("url")%></a></td>
				<td><a href="/lesson04/quiz02_del?id=<%= result.getInt("id")%>" class="btn btn-danger">삭제하기</a></td>
			</tr>
			<%
			}
			
			sql.disconnect();
			
			%>
		</tbody>
	</table>
	
	<!-- 4. 입력하기
	새로운 jsp에서 input 태그로 데이터를 입력 받고, form 태그와 servlet을 이용해서 insert 하세요.
	insert 후 위에서 만든 목록 출력 페이지로 리다이렉트 하세요. -->
	<div class="col-5">
		<div class="fs-3">즐겨찾기 추가</div>
		
		<form method="post" action="/lesson04/addnew">
			<div class="form-floating">
				<input type="text" class="form-control" id="name" name="name" placeholder="name"> <label for="name">사이트명</label>
			</div>
			
			<div class="form-floating mt-2">
				<input type="text" class="form-control" id="url" name="url" placeholder="url"> <label for="url">사이트 주소</label>
			</div>
			
			<button class="btn btn-success mt-2" type="submit">추가</button>
		</form>
	</div>

</div>

</body>
</html>