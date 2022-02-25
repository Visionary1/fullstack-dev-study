package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz04")
public class UrlMappingQuiz04 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			
			out.print(
					"<!DOCTYPE html>" +
					"<html><head>" +
					"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>" +
					"<title>" + 
						"Ex03" + 
					"</title></head>" +
					"<body>"
			);
			
			// body
			out.print("<ul>");

			for (int i = 1; i < 31; i++) {
				out.print("<li>" + i + "번째 리스트" + "</li>");
			}

			out.print("</ul>");
			
			out.print("</body></html>");
			
	      } finally {
	    	  out.close();
	      }
	};
}
