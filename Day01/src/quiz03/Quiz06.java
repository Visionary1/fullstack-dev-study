package quiz03;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        int weight = scan.nextInt();

        int chickenThreshold = 70;

        if (weight <= chickenThreshold) {
            System.out.println("You can eat chicken");
        } else if (weight <= 75){
            System.out.println("Take chicken breast");
        } else if (weight <= 80) {
            System.out.println("Take salad");
        } else {
            System.out.println("better skip meal");
        }
        */

        /*
        1. 숫자 비교
        숫자를 입력 받아서 10보다 작은 수인지 큰 수인지, 같은지를 출력하세요.
        입력 예시
        
        숫자를 입력하세요 : 25
        출력 예시
        
        10보다 큽니다.
        */
        
        System.out.print("Type number : ");

        int number = scan.nextInt();

        if (number > 10) {
            System.out.println("bigger than 10");
        }

        else if (number < 10) {
            System.out.println("smaller than 10");
        }

        else if (number == 10) {
            System.out.println("equals");
        }

        /*
        2. 수 비교
        두 숫자 a, b 를 입력 받아서 a가 클 경우 "a가 더 큽니다." 를
        b가 클 경우 "b가 더 큽니다."를
        같을 경우 "a와 b는 같습니다."를 출력하세요
        입력 예시
        
        두 개의 수를 입력하세요 : 43 22
        출력 예시
        
        a가 더 큽니다.
        */

        System.out.print("Type numbers 1 & 2 : ");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }

        else if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }

        else {
            System.out.println(number1 + " = " + number2);
        }

        /*
        3. 시험 합격
        70점 이상이면 합격하는 시험에서 점수를 입력 받아서 합격 여부를 출력하세요.
        입력 예시
        
        성적을 입력하세요 : 86
        출력 예시
        
        합격입니다.
        */

        System.out.print("Type score to check whether you've passed : ");

        int score = scan.nextInt();

        if (score >= 70) {
            System.out.println("You passed !");
        }

        else {
            System.out.println("You failed");
        }

        /*
        4. 홀짝 검사
        수를 입력 받아서 짝수 인지 홀수 인지 출력하세요.
        입력 예시
        
        수를 입력하세요 : 4
        출력 예시
        
        짝수
        */

        System.out.print("Type number to check whether it is even number : ");
        int isEven = scan.nextInt();

        if (isEven % 2 == 0) {
            System.out.println("even number");
        }

        else {
            System.out.println("odd number");
        }

        /*
        1. 두 점수 합격
        두 개의 점수를 입력 받아서 두 점수 모두가 70점 이상이면 합격입니다를 출력하세요
        입력 예시
        
        두 점수를 입력하세요 : 87 73
        출력 예시
        
        합격입니다.
        */

        System.out.print("Type score 1 & 2 to check whether you've passed : ");

        int score1 = scan.nextInt();
        int score2 = scan.nextInt();

        if (score1 >= 70 && score2 >= 70) {
            System.out.println("You passed");
        }
        else {
            System.out.println("You failed");
        }
        
        /*
        2. 공배수 구하기
        수를 입력 받아서 2와 3의 공배수인지 판별하세요.
        공배수: 공통되는 배수
        입력 예시
        
        수를 입력하세요 : 12
        출력 예시
        
        2와 3의 공배수입니다.
        */

        System.out.print("Type number to check common multiple : ");
        
        int co = scan.nextInt();

        if (co % 6 == 0) {
            System.out.println("common multiple");
        } else {
            System.out.println("Not common multiple");
        }
        
        /*
        3. 범위
        1 ~ 10의 사이의 수를 입력 받아야 한다. 범위를 넘어갈 경우 잘못 입력하셨습니다를 출력하세요.
        입력 예시
        
        1~10 사이의 수를 입력하세요 : 14
        출력 예시
        
        잘못 입력하셨습니다.
        */

        System.out.print("Type number between 1 ~ 10 : ");
        
        int isBetween = scan.nextInt();

        if (isBetween >= 1 && isBetween <= 10) {
            System.out.println("Pass");
        } else {
            System.out.println("Number is not between 1 < 10");
        }
        
        /*
        1. 음수 양수 판별
        정수를 입력 받고 음수인지 양수인지 출력하세요.
        입력 예시
        
        정수를 입력 하세요 : -5
        출력 예시
        
        음수입니다
        */

        System.out.print("Type an integer to check whether it is positive or negative number : ");

        int isPositive = scan.nextInt();

        if (isPositive > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        /*
        2. 학점 출력
        점수를 입력 받고 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F 를 출력하세요
        입력 예시
        
        점수를 입력 하세요 : 86
        출력 예시
        
        B
        */

        System.out.print("Type a score to check your grade : ");

        score = scan.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        /*
        3. 비만도 구하기
        BMI 수치를 입력 받아서 비만 판정을 출력하세요.
        
        bmi 수치	비만도
        ~ 10 이하	정상
        ~ 20 이하	과체중
        20 ~ 초과	비만
        입력 예시
        
        bmi 수치를 입력 하세요 : 18
        출력 예시
        
        과체중
        */

        System.out.print("Type BMI : ");
        
        int bmi = scan.nextInt();

        if (bmi <= 10) {
            System.out.println("normal");
        }

        else if (bmi <= 20) {
            System.out.println("overweight");
        }

        else if (bmi > 20) {
            System.out.println("obesity");
        }

        /*
        1. 계절 구하기
        월(month)를 입력 받아서 어떤 계절인지 출력하세요.
        
        월	계절
        3, 4, 5	봄
        6, 7, 8	여름
        9, 10, 11	가을
        12, 1, 2	겨울
        입력 예시
        
        월을 입력하세요 : 5
        출력 예시
        
        봄
        */

        System.out.print("Type a month : ");

        int month = scan.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12: System.out.println("winter");
                break;

            case 3:
            case 4:
            case 5: System.out.println("spring");
                break;

            case 6:
            case 7:
            case 8: System.out.println("summer");
                break;

            case 9:
            case 10:
            case 11: System.out.println("fall");
                break;


        }

        /*
        1. 평균 합격 구하기
        두 점수를 입력 받고, 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
        입력 예시
        
        두 점수를 입력하세요 : 87 95
        출력 예시
        
        합격
        */

        System.out.print("Type two scores : ");
        double score_1 = scan.nextDouble();
        double score_2 = scan.nextDouble();

        double avg = (score_1 + score_2) / 2.0;

        if (avg >= 70) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }

        /*
        2. 큰 값 구하기
        세 개의 정수를 입력 받아서 가장 큰 값을 출력하세요.
        입력 예시
        
        세 개의 수를 입력하세요 : 3 8 5
        출력 예시
        8
        */

        System.out.print("Type three integers : ");

        int int_1 = scan.nextInt();
        int int_2 = scan.nextInt();
        int int_3 = scan.nextInt();

        int max = int_1;

        if (max < int_2) {
            max = int_2;
        }

        if (max < int_3) {
            max = int_3;
        }

        System.out.println("Greatest no is " + max);

        // if (int_1 > int_2) {
        //     if (int_1 > int_3) {
        //         System.out.println("Greatest no is " + int_1);
        //     } else if (int_1 < int_3) {
        //         System.out.println("Great no is " + int_3);
        //     }
        // } else {
        //     if (int_2 > int_3) {
        //         System.out.println("Greatest no is " + int_2);
        //     } else if (int_2 < int_3) {
        //         System.out.println("Greatest no is " + int_3);
        //     }
            
        // }
        
        int greatest = Math.max(Math.max(int_1, int_2), int_3);

        System.out.println("Greatest number is " + greatest);
        

        /*
        3. 과락 포함 합격 여부
        점수 두 개를 입력 받고 합격 여부를 출력하세요.
        평균이 60점 이상이면 합격
        한과목이라도 50점 이하면 무조건 과락
        평균 60점 미만이면 불합격
        .
        입력 예시
        
        점수1 : 95
        점수2 : 48
        출력 예시
        과락
        */

        System.out.print("Type scores : ");

        score1 = scan.nextInt();
        score2 = scan.nextInt();

        avg = (double)score1 + score2 / 2.0;

        String msg = "";

        if (score1 <= 50 || score2 <= 50) {
            msg = "failed";
        } else if (avg >= 60) {
            msg = "passed";
        } else {
            msg = "failed";
        }

        System.out.println(msg);

        /*
        4. 윤년 구하기
        연도를 입력 받아서 윤년인지 평년인지 출력하세요.
        윤년 조건
        4로 나누어 떨어지는 연도는 윤년이다.
        100으로 나누어 떨어지는 연도는 윤년이 아니다.
        400으로 나누어 떨어지는 연도는 무조건 윤년이다.
        
        입력 예시
        연도 : 2020
        출력 예시
        윤년
        */

        System.out.print("Type year : ");

        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("윤년 아님");
        }


        /*
        5. 윷놀이
        4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
        윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
        윷놀이는 4개의 윷을 이용하는 게임이다.
        
        도 : 1개가 뒤집어진 상태
        개 : 2개가 뒤집어진 상태
        걸 : 3개가 뒤집어진 상태
        윷 : 4개가 뒤집어진 상태
        모 : 하나도 뒤집어지지 않은 상태
        
        입력 예시  
        윷 상태를 입력하세요 : 0 1 1 1
        출력 예시
        걸
        */

        System.out.print("type states : ");

        int state1 = scan.nextInt();
        int state2 = scan.nextInt();
        int state3 = scan.nextInt();
        int state4 = scan.nextInt();

        int sum = state1 + state2 + state3 + state4;

        switch (sum) {
            case 0: System.out.println("모");
                break;

            case 1: System.out.println("도");
                break;

            case 2: System.out.println("개");
                break;

            case 3: System.out.println("걸");
                break;

            case 4: System.out.println("윷");
                break;
        }

        scan.close();
    }
}
