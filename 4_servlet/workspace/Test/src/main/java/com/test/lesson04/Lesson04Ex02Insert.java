package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/user_insert")
public class Lesson04Ex02Insert extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// request params
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String dreamJob = request.getParameter("dreamJob");
		
		// DB connect
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
		// insert query
		String insertQuery = "insert into `new_student` (`name`, `phoneNumber`, `email`, `dreamJob`)\n"
				+ "values(" + "'" + name +"', '" + phoneNumber + "', '" + email + "', '" + dreamJob + "');";
		
//		System.out.println(insertQuery);
		
		try {
			mysqlService.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB disconnect
		mysqlService.disconnect();
		
		// redirect
		response.sendRedirect("/lesson04/ex2_1.jsp");
		
	}
}
