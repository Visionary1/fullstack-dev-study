package quiz03;

import java.util.Scanner;

public class Day11_25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // 1. 무한 입력
        // 무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
        // 입력이 끝나면 "끝"을 출력하세요
        // 입력 예시
        // 수를 입력하세요 : 21
        // 수를 입력하세요 : 24
        // 수를 입력하세요 : 83
        // 수를 입력하세요 : 2
        // 수를 입력하세요 : 9
        // 수를 입력하세요 : 0
        // 출력 예시
        // 끝

        // while (true) {
        //     System.out.print("Type number : ");

        //     if (scan.nextInt() == 0) {
        //         break;
        //     }
        // }
        // System.out.println("Done !");


        // // 2. 배수의 합 구하기
        // // 3부터 50까지 3의 배수의 합을 출력하세요.
        // // 증감 연산은 +1씩 하세요.
        // // continue문을 사용하세요.
        // // 출력 예시
        // // 408

        // int sum = 0;

        // for (int i = 0; i <= 50; i += 1) {
        //     if (i % 3 != 0) {
        //         continue;
        //     }
        //     sum += i;
        // }

        // System.out.println(sum);


        // 1. 합 구하기
        // 수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
        // 입력 예시
        
        // 수를 입력하세요 : 45
        // 출력 예시
        // 1035

        // int sum = 0;
        
        // System.out.print("Q1. Type number : ");

        // for (int i = scan.nextInt(); i >= 1; i -= 1) {
        //     sum += i;
        // }

        // System.out.println(sum);

        // // 2. 팩토리얼
        // // 팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
        // // 5! = 1 * 2 * 3 * 4 * 5
        // // 7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
        
        // // 수를 입력 받고 그 수의 팩토리얼을 출력하세요.
        // // 입력 받는 수의 최대값은 10이다.
        // // 입력 예시
        // // 수를 입력하세요 : 8
        // // 출력 예시
        // // 40320

        // int fact = 1;

        // System.out.print("Q2. Type number : ");
        
        // for (int i = scan.nextInt(); i >= 1; i -= 1) {
        //     fact = fact * i;
        // }

        // System.out.println(fact);

        // // 3. 약수 구하기
        // // 수를 입력 받아서 그 수의 약수를 모두 출력하세요.
        // // 약수: 어떤 수를 나누어 떨어지게 하는 수
        
        // // 예) 8의 약수 => 1 2 4 8
        // // 입력 예시
        // // 수를 입력하세요 : 24
        // // 출력 예시
        // // 1 2 3 4 6 8 12 24

        // System.out.print("Q3. Type number : ");

        // int i = scan.nextInt();

        // for (int j = 1; j <= i; j += 1) {
        //     if (i % j == 0) {
        //         System.out.print(j + " ");
        //     }
        // }
        
        // 1. 주사위 문제
        // 두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수를 출력하세요.
        // 출력 예시
        // (1, 1) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6)  
        // (2, 1) (2, 2) (2, 3) (2, 4) (2, 5) (2, 6) 
        // (3, 1) (3, 2) (3, 3) (3, 4) (3, 5) (3, 6) 
        // (4, 1) (4, 2) (4, 3) (4, 4) (4, 5) (4, 6) 
        // (5, 1) (5, 2) (5, 3) (5, 4) (5, 5) (5, 6) 
        // (6, 1) (6, 2) (6, 3) (6, 4) (6, 5) (6, 6) 

        // for (int j = 1; j <= 6; j++) {
        //     System.out.println();
        //     for (int k = 1; k <= 6; k++) {
        //         System.out.print("(" + j + " , " + k + ") ");
        //     }
            
        // }

        // 2. 구구단
        // 구구단을 2단에서 부터 9단 까지 모두 출력하세요.
        // 출력 예시
        // 2 X 1 = 2
        // 2 X 2 = 4
        // 2 X 3 = 6
        // 2 X 4 = 8
        // 2 X 5 = 10
        // 2 X 6 = 12
        // 2 X 7 = 14
        // 2 X 8 = 16
        // 2 X 9 = 18
        // 3 X 1 = 3
        // 3 X 2 = 6

        // for (int j = 2; j <= 9; j++) {
        //     for (int k = 1; k <= 9; k++) {
        //         System.out.println(j + " X " + k + " = " + j * k);
        //     }
            
        // }

        // 3. 별찍기
        // 아래 형태처럼 *을 출력하세요
        // 출력 예시
        // *
        // **
        // ***
        // ****
        // *****

        // v1
        // for (int i = 0; i < 5; i++) {
        //     System.out.print("*");
        // }

        // v2
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // my version
        // String text = "*";

        // for (int j = 0; j < 5; j++) {
        //     System.out.println(text);
        //     text += "*";
        // }


        // 4. 거꾸로 된 삼각형
        // 아래 형태처럼 *을 출력하세요.
        // 출력 예시
        
        // *****
        // ****
        // ***
        // **
        // *

        // text = "*****";

        // int len = text.length();

        // for (int i = 0; i <= len; i += 1) {
        //     System.out.println(text.substring(0, text.length()-i));

        // }

        // teacher's version
        // for (int i = 5; i>= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5. 피라미드
        // 아래 형태처럼 *을 출력하세요.
        // 출력 예시
        
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        // ----*  2n + 1 = alwatys odd no
        // ---***
        // --*****
        // -*******
        // *********

        for (int i = 0; i < 5; i++) {
            // blank (space)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            // put *
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 1. 모래시계 출력하기
        // 모래시계의 크기를 나타내는 홀수의 정수(3 <= n < 99)를 입력받고 모래시계 모양을 출력하세요.
        // 입력 예시
        
        // 모래시계 크기를 입력하세요: 3
        // 출력 예시
        
        // *+*
        // -*-
        // *+*
        // 크기 5 출력 예시
        // *+*+*
        // -*+*-
        // --*--
        // -*+*-
        // *+*+*

        // 크기 7 출력 예시
        // *+*+*+*
        // -*+*+*-
        // --*+*--
        // ---*---
        // --*+*--
        // -*+*+*-
        // *+*+*+*

        // System.out.print("Q1. Type odd number : ");
        
        // int number = scan.nextInt();

        // for (int i = 1; i <= number; i++) {

        //     for (int j = 1; j <= number; j++) {
            
        //         if (i == 1 || i == number) {
        //             if (j % 2 != 0) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print("+");
        //             }
        //         }

        //         else {
                    
        //         }

        //     }
        //     System.out.println();
            

        // }
        scan.close();

    }
    
}
