<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<!-- css -->
<style>
a:hover {
	text-decoration: none;
	background-color: rgb(230, 109, 109);
}

.content-box {
	height: 500px;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<!-- header -->
		<header class="text-center text-danger display-6">SK Broadband IPTV</header>

		<!-- nav -->
		<div class="bg-danger mt-2">
			<ul class="nav nav-fill">
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=all">전체</a></li>
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=local">지상파</a></li>
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=tvseries">드라마</a></li>
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=entertainment">예능</a></li>
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=films">영화</a></li>
				<li class="nav-item"><a class="nav-link text-white"
					href="?page=sports">스포츠</a></li>
			</ul>
		</div>

		<!-- table -->
		<jsp:include page="quiz10_1.jsp"></jsp:include>

		<!-- footer -->
		<jsp:include page="footer.jsp"></jsp:include>

	</div>
</body>
</html>