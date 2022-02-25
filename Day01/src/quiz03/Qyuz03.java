package quiz03;

public class Qyuz03 {

	public static void main(String[] args) {
//		아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//		평균은 소수 둘째자리 까지만 출력하세요.
//		국어 : 93 수학 : 88 영어 : 94
		
		int lang = 93;
		int math = 88;
		int eng = 94;
		
		double avg = (double)(lang + math + eng) / 3;

		
		double round2 = Math.round(avg * 100.0) / 100.0;
		
		System.out.println(round2);

		
//		
//		아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//		화씨 온도 = 9 / 5 * 섭씨온도 + 32
		
		double celcius = 30.0;
		double fahrenheit = 9.0 / 5.0 * celcius + 32.0;
		System.out.println("celcius : " + celcius + ", fahrenheit : " + fahrenheit);
				


	}

}
