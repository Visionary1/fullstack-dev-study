package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/user_delete")
public class Lesson04Ex02Delete extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		// request parameter => id
		int id = Integer.parseInt(request.getParameter("id"));
		
		// db connect
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
		// delete query
		String deleteQuery = "delete from `new_student` where `id`=" + id;
		try {
			mysqlService.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db disconnect
		mysqlService.disconnect();
		
		// redirect to previous table template
		response.sendRedirect("/lesson04/ex2_1.jsp");
	}
}
