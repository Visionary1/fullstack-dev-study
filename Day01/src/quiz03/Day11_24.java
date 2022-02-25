package quiz03;

import java.util.Scanner;

public class Day11_24 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        /*

        int i = 0;

        while (i < 5) {
            System.out.println("i : " + i);
            i += 1;
        }

        // 1 ~ 5
        i = 1;
        while (i <= 5) {
            System.out.println("i : " + i);
            i += 1;
        }

        // 5 ~ 0
        i = 5;
        while (i >= 0) {
            System.out.println("i : " + i);
            i -= 1;
        }

        // 1 + 2 + 3 + ... + 10 
        i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i += 1;
        }
        System.out.println("sum : " + sum);

        
        // 1. 반복 출력
        // 수를 입력 받아서 그 수만큼 "화이팅!!!" 를 출력하세요
        // 입력 예시
        
        // 횟수를 입력하세요 : 4
        // 출력 예시
        
        // 화이팅!!!
        // 화이팅!!!
        // 화이팅!!!
        // 화이팅!!!

        System.out.print("Q1. Type number : ");

        int number = scan.nextInt();

        while (number > 0) {
            System.out.println("up");
            number -= 1;
        }

        // 2. 카운트 다운 "발사"
        // 수를 입력 받고 그 수에서 부터 0까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
        // 입력 예시
        
        // 카운트 다운 수를 입력하세요 : 3
        // 출력 예시
        
        // 3
        // 2
        // 1
        // 0
        // 발사 

        System.out.print("Q2. Type number : ");

        number = scan.nextInt();

        while (number >= 0) {
            System.out.println(number);
            number -= 1;
        }

        System.out.println("fire");

        // 3. 반복 입력
        // while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
        // 입출력 예시
        
        // 수를 입력하세요:  : 4
        // 출력 : 4
        // 수를 입력하세요:  : 5
        // 출력 : 5
        // 수를 입력하세요:  : 6
        // 출력 : 6
        // 수를 입력하세요:  : 7
        // 출력 : 7
        // 수를 입력하세요:  : 8
        // 출력 : 8

        i = 0;
        while (i < 5) {
            System.out.print("Q3. Type number : ");
            System.out.println(scan.nextInt());
            i += 1;
        }

        // 4. 구구단
        // 구구단 3단을 출력하세요
        // 출력 예시
        
        // 3 X 1 = 3
        // 3 X 2 = 6
        // 3 X 3 = 9
        // 3 X 4 = 12
        // 3 X 5 = 15
        // 3 X 6 = 18
        // 3 X 7 = 21
        // 3 X 8 = 24
        // 3 X 9 = 27

        i = 1;

        while (i <= 9) {
            System.out.println("3 x " + i + " = " + 3 * i);
            i += 1;
        }


        */


        /*
        // Do ~ while loop
        int i = 0;

        // work def once even if while is false
        do {
            System.err.println("Hello " + i);
            i++;

        } while (i < 10);
        */

        /*
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("while " + i);
            i++;
        }
        */

        /*
        // For loop
        for (int j = 0; j <= 5; j++) {
            System.out.println("j : " + j);
        }


        int sum = 0;
        // 1 + 2 + 3 + ... + 10
        for (int j = 0; j <= 10; j++) {
            sum += j;
        }

        System.out.println("sum : " + sum);
        */

        /*
        // 1. 반복 출력
        // 35 ~ 40 까지 출력 하세요
        // 출력 예시
        
        // 35 36 37 38 39 40 
        for (int k = 35; k <= 40; k++) {
            System.out.println("Q1. " + k);
        }


        // 2. 카운트 다운 출력
        // 5 ~ -5 까지 출력하세요
        // 출력 예시
        // 5 4 3 2 1 0 -1 -2 -3 -4 -5 
        for (int k = -5; k <= 5; k++) {
            System.out.println("Q2. " + k);
        }

        // 3. 특정 조건 구하기
        // 1 ~ 50 사이에 3의 배수만 출력하세요.
        // 출력 예시
        // 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 

        for (int k = 3; k<= 50; k += 3) {
            System.out.println("Q3. " + k);
        }

        
        // 4. 갯수 세기
        // 1 ~ 100 사이에 7의 배수 갯수를 구하세요.
        // 출력 예시
        // 7의 배수의 갯수는 : 14

        int count = 0;

        for (int k = 7; k < 100; k += 7) {
            if (k % 7 == 0) {
                count++;
            }
        }

        System.out.println("Q4. " + count);

        // 5. 구구단
        // 수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.
        // 입력 예시
        // 단수를 입력하세요 : 8
        // 출력 예시
        // 8 X 1 = 8
        // 8 X 2 = 16
        // 8 X 3 = 24
        // 8 X 4 = 32
        // 8 X 5 = 40
        // 8 X 6 = 48
        // 8 X 7 = 56
        // 8 X 8 = 64
        // 8 X 9 = 72

        System.out.print("Q5. Type number : ");

        int number = scan.nextInt();

        for (int k = 1; k <= 9; k++) {
            System.out.println(number + " x " + k + " = " + number * k);
        }

        */





        scan.close();

    }
    
}
