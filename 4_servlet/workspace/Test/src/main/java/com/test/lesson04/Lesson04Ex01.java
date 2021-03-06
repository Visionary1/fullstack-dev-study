package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		// DB 접속 연결
        MysqlService mysqlService = MysqlService.getInstance(); // DB 연결을 위한 객체 생성(싱글턴이라 한개만 생성됨)
        mysqlService.connection(); // DB 연결
		
		// insert query
//		String insertQuery = "insert into ...";
//			
//		try {
//			mysql.update(insertQuery);
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
		
		// select query
		// used_good 없으니까 이따 추가 , 걍 임시로 new_review
		String selectQuery = "select * from `new_review`";
		
		
		// 결과 출력
		try {
			PrintWriter out = response.getWriter();
			
			ResultSet resultSet = mysqlService.select(selectQuery);
			
			while (resultSet.next()) { // 결과 행이 있는 동안 수행
				out.println(resultSet.getInt("storeId"));
				out.println(resultSet.getString("menu"));
				out.println(resultSet.getString("userName"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		mysqlService.disconnect(); // DB 연결 해제
	}
}
