<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<%
	Calendar cal = Calendar.getInstance();

	// 월의 첫날
	cal.set(Calendar.DAY_OF_MONTH, 1);

	//그 주의 요일 반환 (일:1 ~ 토:7)
	int week = cal.get(Calendar.DAY_OF_WEEK);

	//몇 주 있는지
	int weekSize = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

	// 마지막 날짜
	int maximumDays = cal.getActualMaximum(Calendar.DATE);

	HashMap<Integer, String> dayOfWeek = new HashMap<>();
	dayOfWeek.put(1, "일");
	dayOfWeek.put(2, "월");
	dayOfWeek.put(3, "화");
	dayOfWeek.put(4, "수");
	dayOfWeek.put(5, "목");
	dayOfWeek.put(6, "금");
	dayOfWeek.put(7, "토");

	Collection<String> values = dayOfWeek.values();
	%>

	<div class="container">

		<div class="fw-light fs-2 text-center"><%=cal.get(Calendar.YEAR) + " - " + Integer.valueOf(cal.get(Calendar.MONTH) + 1)%></div>

		<table class="table">
			<thead>
				<tr>
					<%
					for (String day : values) {
					%>
					<th class="fw-light fs-3 <%= day.equals("일") ? "text-danger" : "" %>"><%=day%></th>

					<%
					}
					%>
				</tr>
			</thead>
			<tbody>
		<%
		int counter = 1;
		for (int i = 0; i < weekSize; i++) {
		%>
			<tr>
		<%
			for (int j = 1; j < 8; j++) {
				if (counter > maximumDays) {
					break;
				}
		%>
				<td class="fs-3 <%= (i * 7 + j) % 7 == 1 ? "text-danger" : "" %>">
		<%
				/* 월 1일 시작요일 체크 */
				if (week <= (i * 7 + j)) { 
		%>
					<%= counter %>
		<%
					counter++;
				}
		%>
				</td>
		<%
			}
		%>
			</tr>
		<%
		}
		%>
			</tbody>
		</table>
	</div>



</body>
</html>