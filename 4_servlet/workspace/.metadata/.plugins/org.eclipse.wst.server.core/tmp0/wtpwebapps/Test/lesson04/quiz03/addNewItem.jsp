<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.test.common.MysqlService"%>
<%@ page import="java.sql.*"%>

<!-- content -->
<section>
	<div class="mt-3 ms-3 fs-1 fw-light">물건 올리기</div>

	<form method="post" action="/lesson04/addNewItem">
		<div class="row g-2">
			<div class="col-md">
				<div class="form-floating">
					<select class="form-select" id="floatingSelectGrid" name="sellerId" required>
					<%
					MysqlService sql = MysqlService.getInstance();
					sql.connection();
					
					String selectQuery = "select * from `seller`";
					ResultSet result = sql.select(selectQuery);
					
					while (result.next()) {
					%>
						<option value="<%= result.getInt("id") %>"><%= result.getString("nickname") %></option>
					<%
					}
					sql.disconnect();
					%>
					</select>
					<label for="floatingSelectGrid">아이디 선택</label>
				</div>
			</div>

			<div class="col-md">
				<div class="form-floating">
					<input type="text" class="form-control" id="title" placeholder="title" name="title" required> <label for="title">제목</label>
				</div>
			</div>

			<div class="col-md input-group">
				<input type="text" class="form-control" name="price" required> <span class="input-group-text">KRW</span>
			</div>
		</div>

		<div class="mt-2">
			<textarea class="form-control" rows="5" name="description"></textarea>
		</div>

		<div class="mt-2 form-floating">
			<input type="text" class="form-control" id="imgUrl" placeholder="url" name="pictureUrl"> <label for="imgUrl">이미지 URL</label>
		</div>

		<div class="mt-2 d-grid">
			<button class="btn btn-light" type="submit">저장</button>
		</div>
	</form>
</section>