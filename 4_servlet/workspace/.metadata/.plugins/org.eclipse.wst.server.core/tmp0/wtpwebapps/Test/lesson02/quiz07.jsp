<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

	<div class="container">
		<h1>메뉴 검색</h1>
		
		<form method="post" action="/lesson02/quiz07_1.jsp">
			<div class="d-flex">
				<div class="form-floating col-3">
					<input type="text" class="form-control" id="menu" placeholder="menu" name="keyword">
					<label for="menu">메뉴</label>
				</div>
				
				<label class="ms-2 mt-2">
					<input class="form-check-input me-1" type="checkbox" value="true" name="startPointFilter">
					4점 이하 제외
				</label>

			</div>
			
			<input type="submit" class="btn btn-success mt-3" value="검색">

		</form>
	</div>

</body>
</html>