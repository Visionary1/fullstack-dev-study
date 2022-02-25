package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ctrl + h 로 검색 가능, 아래 서브릿이 중복인지 아닌지 확인해보려면
@WebServlet("/servlet/quiz03")
public class UrlMappingQuiz03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain");
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
			
			Date now = new Date();
			// capital HH prints hours in 24-h format
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			out.print(
						"<h2>[단독] 고양이가 야옹해</h2>"
						+ "기사 입력 시간 : " + sdf.format(now)
						+ "<hr>끝"
					);

			out.print("</body></html>");
			
	      } finally {
	    	  out.close();
	      }
	};
}
