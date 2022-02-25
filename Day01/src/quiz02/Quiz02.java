package quiz02;

public class Quiz02 {

	public static void main(String[] args) {
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		
		char[] grades = {'A', 'B'};
		double[] credit = {3.0, 4.0};
		
		System.out.println("if score >= 90, then " + grades[0] + " , " + "credit " + credit[0]);
		System.out.println("if score >= 80, then " + grades[1] + " , " + "credit " + credit[1]);
		
//		두 수의 곱 : 1165.72500000000011
		int no1 = 10;
		double no2 = 1.114444444;
		System.out.println(no1 * no2);
		
//		943시간은 39일 7시간 입니다.
//		int days = 39;
//		int hours = 7;
		
		int hours = 943;
		System.out.println(hours + " equals " + (hours / 24) + " days, " + (hours % 24) + " hours ");
		
//		System.out.println((days * hours) + " hours equal " + days + " days " + hours + " hours");
		
		
//		가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
		int width = 8;
		int height = 9;
		System.out.println("Rectangle area : " +(width * height));
		System.out.println("Triangle area : " +(width * height) / 2);
		
		
	}

}
