<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Layout</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
#wrap {
	width: 100%;
	height: 900px;
}

header {
	height: 50px;
}

.content-box {
	height: 850px;
}

section {
	height: 90%;
}

footer {
	height: 10%;
}
</style>
</head>
<body>
	<div id="wrap" class="bg-secondary">
		<!-- 		<header class="bg-success">
			logo
		</header> -->
		<!--ctrl + shift + f : indent reorg  -->
		<jsp:include page="header.jsp"></jsp:include>
		
		<div class="content-box bg-dark d-flex">
			<aside class="col-2 bg-info">
				<jsp:include page="menu.jsp"></jsp:include>
			</aside>
			<div class="col-10 bg-primary">
				<%
					String contentName = "content1.jsp";
				%>
				<jsp:include page="<%= contentName %>"></jsp:include>
				<jsp:include page="footer.jsp"></jsp:include>
			</div>
		</div>
	</div>
</body>
</html>