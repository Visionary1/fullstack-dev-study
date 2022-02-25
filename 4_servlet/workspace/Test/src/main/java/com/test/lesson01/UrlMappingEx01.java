package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		out.println("안녕하세요");
		
		Date now = new Date();
		out.println(now);
		
		//formatter
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		out.println(sdf.format(now));
		out.println();
		
		
//		Url Mapping(web.xml) - 오늘의 날짜
//		 
//		- Servlet
//		연습 문제
//		Url Mapping(web.xml) - 오늘의 날짜
//		오늘 날짜 출력
//		오늘 날짜를 출력하세요.
//		- web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
//		- Content Type은 text/plain으로 설정하세요.
//
//		출력 예시
//
//		오늘의 날짜는 2021년 5월 20일
		
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year  = localDate.getYear();
		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		
		out.println(
				"Q1. " + 
				"오늘의 날짜는 " + 
				year + " 년 " + 
				month + 
				" 월 " + 
				day + " 일"
		);
		
		out.println();
		
//		연습 문제
//		Url Mapping(web.xml) - 현재 시간
//		시간 출력
//		현재의 시간을 출력하세요.
//		- web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
//		- Content Type은 text/plain으로 설정하세요.
//		- 24시간 표현법으로 출력하세요.
//
//		출력 예시
//
//		현재 시간은 14시 52분 43초 입니다.
		Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		
		out.println(
				"Q2. 현재 시간은 " + 
				formatter.format( calendar.getTime() )
		);
		
		out.println();
		
		
	}
}
