package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz02")
public class UrlMappingQuiz02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		Date today = new Date();
		
		// 소문자 m은 미닛임
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 hh시 mm분 ss입니다");
		out.println("Q2. " + sdf.format(today) );
		
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		out.print(
				"<html>"
				+ "<head>"
				+ "<title>"
				+ "합계"
				+ "</title>"
				+ "</head>"
				+ "<body>"
			);
		
		out.print("합계 : <strong>" + sum + "<strong>");
		out.print("</body></html>");
	};
}