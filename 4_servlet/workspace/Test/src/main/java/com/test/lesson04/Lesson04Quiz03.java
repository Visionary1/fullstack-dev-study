package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/addNewItem")
public class Lesson04Quiz03 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// request params
		String sellerId = request.getParameter("sellerId");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String pictureUrl = request.getParameter("pictureUrl");
		
		// DB connect
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
		// insert query
		String insertQuery = "INSERT INTO `usedGoods` (`sellerId`, `title`, `description`, `price`, `pictureUrl`)\n"
				+ "VALUES (" + "'" + sellerId + "', '" + title + "', '" + description + "', '" + price + "', '" + pictureUrl + "');";
		
		try {
			mysqlService.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB disconnect
		mysqlService.disconnect();
		
		// redirect
		response.sendRedirect("/lesson04/quiz03/template.jsp");
	}
}
