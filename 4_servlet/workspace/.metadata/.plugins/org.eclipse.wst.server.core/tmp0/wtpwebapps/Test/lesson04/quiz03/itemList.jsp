<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.test.common.MysqlService"%>
<%@ page import="java.sql.*"%>
<!-- content -->
<section class="mt-3">
	<!-- 반응형 그리드 -->
	<div class="row row-cols-2 row-cols-lg-5 g-2 g-lg-3">
		<%
		MysqlService sql = MysqlService.getInstance();
		sql.connection();
		
		String selectQuery = "SELECT seller.nickname, usedGoods.title, usedGoods.description, usedGoods.price, usedGoods.pictureUrl FROM seller JOIN usedGoods ON seller.id = usedGoods.sellerId;";
		ResultSet result = sql.select(selectQuery);
		
		while (result.next()) {
		%>
		<a href="#" class="col-4 items">
			<div class="border border-warning h-100">
				<div class="h-75">
					<img src="<%= result.getString("pictureUrl") %>" class="img-fluid" alt="goods">
				</div>

				<div class="h-25 d-flex align-items-end">
					<div>
						<div class="fw-bold text-black"><%= result.getString("title") %></div>
						<div class="fw-light text-secondary"><%= result.getInt("price") %></div>
						<div class="text-black"><%= result.getString("nickname") %></div>
					</div>
				</div>
			</div>
		</a>
		<%
		}
		sql.disconnect();
		%>
	</div>
</section>