package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class UrlMappingQuiz05 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	    // 아래 코드는 반드시 메소드의 가장 위쪽에 위치해야 한다!!!
	    response.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=UTF-8");
	    
	    PrintWriter out = response.getWriter();
	    
	    Integer number = Integer.valueOf(request.getParameter("number"));
		
		out.print(
				"<!DOCTYPE html>" +
				"<html><head>" +
				"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>" +
				"<title>" + 
					"quiz05" + 
				"</title></head>" +
				"<body><ul>"
		);
		
	    for (int i = 1; i < 10; i++) {
	    	out.print("<li>" + number + " x " + i + " = " + number * i + "</li>");
	    };
	    
	    out.print("</ul></body></html>");
	    
	    
	    
	}
}
