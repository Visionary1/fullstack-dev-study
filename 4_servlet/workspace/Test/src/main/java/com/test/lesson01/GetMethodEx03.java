package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class GetMethodEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		// JSON (JavaScript Object Notation)
		// {"user_id": "chanseopkim", "name": "this_is_my_name", "age": 20}
		
//		out.print("{\"user_id\": \"" + userId + "}"");
//
//		out.print("{\"user_id\": \"" + userId + ", " + "\name\": "\this_is_my_name\", "\age\": 20}")
//		
//		" {\"title\":\"" + 제목1 + " \",\"content\":\"내용1\""}
//		
//		out.println("GET METHOD call");
		
		
		String userId = request.getParameter("user_id");
		out.println("user_id " + userId);
		
		String name = request.getParameter("name");
		out.println("name " + name);
		
		Integer age = Integer.valueOf(request.getParameter("age"));
		out.println("age " + age);
		
		out.close();
	}
}
