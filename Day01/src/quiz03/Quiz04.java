package quiz03;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		// System.out.print("x : ");
		// int x = obj.nextInt();
		
		// System.out.print("y : ");
		// int y = obj.nextInt();

        // int temp = x;
        // x = y;
        // y = temp;
		
		// System.out.println("x is " + x + ", y is " + y);
	
		
		
//		초를 입력 받아서 ?분?초 형태로 출력 하세요.
//				입력 예시
		
		System.out.print("second : ");
		int second = obj.nextInt();
		
		// int min  = second / 60;
		// int remaining = second % 60;
		
		// System.out.println(min + "m " + remaining + "s");

        System.out.println(second / 60 + " m " + second % 60 + " s");

		
		// 네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
		// 입력 예시

		// 입력 : 1234
		
		System.out.print("Type number in four digits :");
        int number = obj.nextInt();

        // System.out.print("Type number in four digits :");
        // int number2 = obj.nextInt();

        int sum = 0;
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(number > 0){
            stack.push(number % 10);
			sum += number % 10;
            number = number / 10;
			
        }
        while ((!stack.isEmpty())){
            System.out.println(stack.pop());
        }

		System.out.println(sum);
        
        obj.close();
       
        
        
	}

}
