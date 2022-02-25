package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/addnew")
public class Lesson04Quiz02 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// request params
		// 이걸 아래로 내리면, request 받아둔게 mysql 새로 연결하면서 유실되어서 작동이 안되는건가?..
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		// db connect
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection();
		
		// insert query
		String insertQuery = "INSERT INTO `links` (`name`, `url`)\n"
				+ "VALUES ('" + name + "', '" + url + "');";
		
		try {
			mysql.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db disconnect
		mysql.disconnect();
		
		// redirect
		response.sendRedirect("/lesson04/quiz02.jsp");
	}
}
