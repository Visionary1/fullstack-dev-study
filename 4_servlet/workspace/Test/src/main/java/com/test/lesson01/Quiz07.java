package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex07")
public class Quiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print(
				"<!DOCTYPE html>" +
				"<html><head>" +
				"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>" +
				"<title>" + 
					"Quiz07" + 
				"</title></head>" +
				"<body>"
		);
		
		HashMap<String, String> order = new HashMap<>();
		order.put("address", request.getParameter("address"));
		order.put("card", request.getParameter("card"));
		order.put("price", request.getParameter("price"));
		
		out.print("주소 : " + order.get("address") + " 배달 준비중" + "<br>");
		out.print("결제 금액 : " + order.get("price"));
		
		out.print("</body></html>");
		out.close();
	}
}
