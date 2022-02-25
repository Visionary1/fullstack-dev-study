<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Arrays, java.util.List, java.util.ArrayList, java.util.Calendar" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz01</title>
</head>
<body>

<pre>
1. 1부터 n까지의 합계를 구하는 함수
jsp의 선언문 <%! %> 문법을 사용해서 1부터 N까지의 합을 구하는 함수를 만드세요.
</pre>

<%!
	public int sum(int x, int y) {
		int sum = 0;
		
		for(int i = x; x < y; x++) {
			sum += x;
		}
		
		return sum;
				
	}
%>

Q1. 1~50 : <%= sum(1, 50) %>
<br><br>

<pre>
2. 점수들의 평균 구하기
스크립틀릿(scriptlet) <% %> 문법을 사용해서 주어진 점수들의 평균을 구하세요.
int[] scores = {80, 90, 100, 95, 80};
</pre>

<%
	int[] scores = {80, 90, 100, 95, 80};
	
	float avg = 0;
	
	for (int i = 0; i < scores.length; i++) {
		avg += scores[i];
	}
	
	avg = avg / scores.length;

	/* 깃허브 주소 메일 */
%>

Q2. <%= avg %>
<br><br>

<pre>
3. 채점 결과
아래 채점표로 시험점수가 몇점인지 구하세요.
List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
</pre>

<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	float grade = 0;
	
	for (String counter : scoreList) {
		if (counter.equals("O")) {
			grade++;
		}
	}
	
	grade = (grade / scoreList.size()) * 100;
%>

Q3. <%= grade %>
<br><br>

<pre>
4. 나이 구하기
주어진 생년월일을 가진 사람의 나이를 구하세요.
String birthDay = "20010820";
</pre>

<%
	String birthDay = "20010820";
	
	Calendar cal = Calendar.getInstance();
	
	int age = cal.get(Calendar.YEAR) - Integer.valueOf(birthDay.substring(0, 4));
%>

Q4. <%= age %>

</body>
</html>