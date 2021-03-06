<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
header {
	background-color: orange;
}

li {
	transition: 0.4s;
}

li:hover {
	background-color: rgb(255, 175, 25);
}

a, a:hover {
	text-decoration: none;
}

/* 호버시 줌 */
.items:hover {
	transform: scale(1.03);
}
</style>
<body>
	<div class="container-fluid">
		<jsp:include page="header.jsp"></jsp:include>
		
		<%
 			String pages = request.getParameter("page");
		
			// 그냥 들어오면 판매 리스트 보여주기
			if (pages == null) {
				pages = "itemList.jsp";
			
			// 물건 올리기 탭 으로 들어오면
			} else if (pages.equals("addNewItem")) {
				pages = "addNewItem.jsp";
			}
		%>
		
		<jsp:include page="<%= pages %>"></jsp:include>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>