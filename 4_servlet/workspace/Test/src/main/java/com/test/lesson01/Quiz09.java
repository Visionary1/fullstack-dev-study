package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09")
public class Quiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print(
				"<!DOCTYPE html>" +
				"<html><head>" +
				"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>" +
				"<title>" + 
				"Quiz09" + 
				"</title></head>" +
				"<body>"
		);

		// 이름
		String name = request.getParameter("name");

		// 자기 소개서
		String comment = request.getParameter("comment");
		
		String preface = "<strong>" + name + "</strong>" + " 님 지원이 완료 되었습니다";
		String title = "<h3>" + "지원내용" + "</h3>";
		
		out.print(preface + "<br>");
		out.print(title);
		out.print(comment);
		out.close();
		// comment
	}
}
