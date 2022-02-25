package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz06")
public class Quiz06 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	    // 아래 코드는 반드시 메소드의 가장 위쪽에 위치해야 한다!!!
	    response.setCharacterEncoding("utf-8");
	    response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		
		Integer numberOne = Integer.valueOf(request.getParameter("number1"));
		Integer numberTwo = Integer.valueOf(request.getParameter("number2"));

		String jsonString = "{" + 
								"\"addition\":" + (numberOne + numberTwo) + "," +
								"\"subtraction\":" + (numberOne - numberTwo) + "," +
								"\"multiplication\":" + (numberOne * numberTwo) + "," +
								"\"division\":" + (numberOne / numberTwo) +
							"}";
		
		out.print(jsonString);
		
		out.close();
		
		
		
		
	}
}
