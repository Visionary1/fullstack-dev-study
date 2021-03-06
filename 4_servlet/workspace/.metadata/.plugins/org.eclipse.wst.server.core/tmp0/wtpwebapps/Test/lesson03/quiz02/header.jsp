<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<header>
	<nav class="navbar navbar-expand-lg navbar-light">
		<div class="container-fluid">
			<!-- 로고 -->
			<a class="navbar-brand fs-5 fw-normal text-success" href="list_template.jsp">Melong</a>
			
			<!-- 반응형 토글 -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarToggler" aria-controls="navbarToggler" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarToggler">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link text-black menu-item" href="#">멜롱차트</a></li>
					<li class="nav-item"><a class="nav-link text-black menu-item" href="#">최신음악</a></li>
					<li class="nav-item"><a class="nav-link text-black menu-item" href="#">장르음악</a></li>
					<li class="nav-item"><a class="nav-link text-black menu-item" href="#">멜롱DJ</a></li>
					<li class="nav-item"><a class="nav-link text-black menu-item" href="#">뮤직어워드</a></li>
				</ul>

				<!-- 곡 검색하기 -->
				<form class="d-flex" action="./info_template.jsp">
					<!-- song 파라미터 넘기기 -->
					<input name="search" class="form-control me-2" type="text" placeholder="곡 제목" aria-label="Search">
					<button class="btn btn-outline-success text-nowrap" type="submit">검색</button>
				</form>
			</div>
		</div>
	</nav>
</header>