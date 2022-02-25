package quiz01;

import java.security.KeyStore.Entry;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();

		// System.out.println(cal.YEAR + " - " + cal.MONTH);

		System.out.println(cal.get(Calendar.YEAR) + " - " + Integer.valueOf(cal.get(Calendar.MONTH) + 1));

		


		// System.out.println(cal.getTime());

		// System.out.println(cal.get(Calendar.YEAR));

		// String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};



		// for (String string : values) {
		// 	System.out.println(string);
		// }

		// 날짜 1일로 수정
		// cal.set(Calendar.DATE, 1);

		// cal.set(Calendar.MONTH, 2);

		// start day
		// System.out.println(dayOfWeek.get(cal.get(Calendar.DAY_OF_WEEK)));

		// // last day
		// System.out.println(cal.getActualMaximum(Calendar.DATE));

		// week size
		int day = cal.get(Calendar.DATE);
		int month = Integer.valueOf(cal.get(Calendar.MONTH) + 1);
		int year = cal.get(Calendar.YEAR);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		int weekSize = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int maximumDays = cal.getActualMaximum(Calendar.DATE);

		HashMap<Integer, String> dayInString = new HashMap<>();
		dayInString.put(1, "일");
		dayInString.put(2, "월");
		dayInString.put(3, "화");
		dayInString.put(4, "수");
		dayInString.put(5, "목");
		dayInString.put(6, "금");
		dayInString.put(7, "토");

		// System.out.println(month);
		// System.out.println(year);
		// System.out.println(dayInString.get(dayOfWeek));

		cal.set(Calendar.DAY_OF_MONTH,1); //DAY_OF_MONTH를 1로 설정 (월의 첫날)
		int week = cal.get(Calendar.DAY_OF_WEEK); //그 주의 요일 반환 (일:1 ~ 토:7)
		System.out.println(week);
		// System.out.println(dayInString.get(week));

		// Collection<String> values = dayInString.values();

		// 1 2 3 4 5 6 7
		//     1

		int init = 0;

		


		System.out.println(weekSize);
		System.out.println(maximumDays);

		System.out.println(maximumDays / weekSize);


		int counter = 1;
		// 5번
		for (int i = 0; i < weekSize; i++) {

			System.out.println("<tr>");

			for (int j = 1; j < 8; j++) {
				if (counter > maximumDays) {
					break;
				}

				System.out.print("<td>");

				if (week <= (i * 7 + j)) {
					System.out.print(counter);
					counter++;
				}
				System.out.println("<td>");
			}
			System.out.println("</tr>");
		}


		// for (int i = 0; i < weekSize - 1; i++) {
		// 	System.out.println("<tr>");

		// 	for (int j = 0; j < 7; j++) {

		// 		if (((i * 7) + (j + 1)) > maximumDays) {
		// 			break;
		// 		}

		// 		System.out.print("<td>");

		// 		if (week >= ((i * 7) + (j + 1))) {
		// 			System.out.print("");
		// 		} else {
		// 			counter++;
		// 			System.out.print(counter);
		// 		}


		// 		System.out.println("</td>");

		// 		// // 현재 달 1일부터 시작하게
		// 		// if (init == 0) {
		// 		// 	for (int k = 0; k < week; k++) {
		// 		// 		System.out.print("<td></td>");
		// 		// 	}
		// 		// 	init = 1;
		// 		// }

		// 		// System.out.print("<td>");

		// 		// System.out.print(((i * 7) + (j + 1)));

		// 		// System.out.println("</td>");

				
		// 	}

		// 	System.out.println("</tr>");
		// }




	}

}
