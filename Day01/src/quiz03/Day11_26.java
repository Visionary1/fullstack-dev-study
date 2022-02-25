package quiz03;

import java.util.Scanner;

public class Day11_26 {
    public static void main(String[] args) {
        
        // double d = 3.68;
        // System.out.println(Math.round(d));

        // max
        //Math.max(a, b)

        // abs
        //Math.abs(a)


        /*
        1. name method
        2. name input
        3. name output
        4. implementation
        */ 

        // argument

        // int x = 4;
        // int y = 5;
        // System.out.println(sum(x,y));

        // printHelloWorld();

        Scanner scan = new Scanner(System.in);

        // System.out.print("Q1. Type number : ");
        // System.out.println(sqrt(scan.nextInt()));

        // System.out.print("Q2. Type numbers : ");
        // System.out.println(avg(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));

        // System.out.print("Q3. Type numbers : ");
        // printQuotientRemainder(scan.nextInt(), scan.nextInt());

        // System.out.print("Q4. Type numvers : ");
        // System.out.println(isEven(scan.nextInt()));

        // System.out.print("Q5. Type number sum : ");
        // System.out.println(sum(scan.nextInt()));

        // System.out.print("Q6. Type numbers min : ");
        // min(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.print("Q7. Type numbers prime : ");
        System.out.println(isPrime(scan.nextInt()));

        

        scan.close();
    }

    // 1. 2의 제곱 함수
    // 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
    // hint ) 함수 원형 - public static int getSquared(int x)
    // 입력 예시
    // 제곱값을 구할 숫자를 입력하세요: 5
    // 출력 예시
    // 5의 제곱은 25이다.

    public static int sqrt(int x) {
        return x * x;
    }

    // 2. 평균 구하기 함수
    // 4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
    // hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)

    // 입력 예시
    // 점수를 입력하세요: 85 72 65 99
    // 출력 예시
    // 평균은 80.25
    public static double avg(int x, int y, int z, int k) {
        return (x + y + z + k) / 4.0;   
    }

    // 3. 몫과 나머지 출력 함수
    // 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
    // hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
    // 입력 예시
    // 숫자와 나눌 수를 입력하세요: 20 7
    // 출력 예시
    // 몫: 2
    // 나머지: 6

    public static void printQuotientRemainder(int x, int y) {
        System.out.println("몫 : " + (int)x / y);
        System.out.println("나머지 : " + x % y);
    }


    // 4. 홀짝 함수
    // 정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
    // 입력 예시
    // 숫자를 입력하세요: 6
    // 출력 예시
    // true
    public static boolean isEven(int x) {
        return x % 2 == 0 ? true : false;
        // return x % 2 == 0
    }


    // 1. 합 구하기
    // 수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
    // 단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
    // 입력 예시
    // 수를 입력하세요 : 85
    // 출력 예시
    // 105
    public static int sum(int x) {
        int number = 0;
        for (int i = x; i > 0; i--) {
            number += i;
        }

        return number;
    }    

    // 2. 최소값
    // 5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
    // 입력 가능한 최대값은 1000 입니다.
    // 입력 예시
    // 5개의 수를 입력하세요 : 4 29 9 398 -4
    // 출력 예시
    // 최소값은 -4
    public static void min(int x, int y, int z, int j, int k) {
        System.out.println(Math.min(Math.min(Math.min(x, y), Math.min(z, j)), k));
    }

    // 3. 소수(prime) 판별
    // 소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.

    // 수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
    // 소수이면 true, 소수가 아니면 false를 리턴
    // 단, 입력하는 수는 2 이상
    // 입력 예시

    // 수를 입력하세요 : 22
    // 출력 예시
    // false

    public static boolean isPrime(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
        


    }





    // void doesn't return anything
    // static > mememory first
    // we need static as we need somethin to reference 

    // static, class > stack
    // parameter
    public static int sum(int x, int y) {
        return x + y;
        
    }

    public static void printHelloWorld() {
        System.out.println("Hello World !");

        return; // terminated method
    }


}
