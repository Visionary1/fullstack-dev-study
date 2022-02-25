package quiz03;

import java.util.Scanner;

public class Day11_30 {
    public static void main(String[] args) { 
        // 1. 배열 값 변경
        // index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
        // int[] numbers = {3, 5, 2, 10, 39};
        // 입력 예시
        
        // 변경할 index와 값을 입력하세요 : 2 16
        // 출력 예시
        // 3 5 16 10 39 


        Scanner scan = new Scanner(System.in);

        /*
        int[] numbers = {3, 5, 2, 10, 39};

        System.out.print("Q1. Type index and value : ");

        numbers[scan.nextInt()] = scan.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2. 점수 채점
        // 아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다.
        // 100점 만점 기준으로 몇점을 맞았는지 출력하세요.
        // char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
        // 출력 예시
        // 60점

        char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};

        int right = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 'O') {
                right += 100 / scores.length;
            }
        }

        System.out.println("Q2. " + right);


        // 3. 임금 계산
        // 아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
        // 시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.
        // 평일 시급 : 8500원
        // 주말(토,일) 시급 : 9500원
        
        // int[] works = {3, 5, 5, 3, 5, 3, 5};
        
        // 출력 예시
        
        // 일주일간 총 임금은 254500원

        int[] works = {3, 5, 5, 3, 5, 3, 5};

        int wage = 0;

        for (int i = 0; i < works.length; i++) {
            if (i < 5) {
                wage += works[i] * 8500;
            } else {
                wage += works[i] * 9500;
            }
        }

        System.out.println("Q3. " + wage);

        // 4. 배열 값 변경
        // 길이가 5인 int 배열을 만든다.
        // 수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
        // 배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.

        // 입력 예시
        // 수를 입력하세요 : 34
        // 수를 입력하세요 : 65
        // 수를 입력하세요 : 23
        // 수를 입력하세요 : 74
        // 수를 입력하세요 : 2
        // 수를 입력하세요 : 74
        // 수를 입력하세요 : 57
        // 수를 입력하세요 : 68
        // 출력 예시
        // 34 74 2 74 68

        int[] evens = new int[5];

        int i = 0;
        int number = 0;
        // System.out.println("Q4. ");

        while (i < 5) {
            System.out.println("Q4. ");

            number = scan.nextInt();
            if (number % 2 == 0) {
                evens[i] = number;
                i += 1;
            }
        }

        for (int j = 0; j < evens.length; j++) {
            System.out.print(evens[j] + " ");
        }

        System.out.println();
        */


        /*
        // 1. 위치 변경 (swap)
        // 두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
        // int[] numbers = {3, 5, 2, 10, 39};
        // 입력 예시
        // 두 개의 index를 입력하세요 : 2 4
        // 출력 예시
        // 3 5 39 10 2
        int[] numbers = {3, 5, 2, 10, 39};

        System.out.print("Q1. Type two indexes : ");

        int x = scan.nextInt();
        int y = scan.nextInt();

        int temp = numbers[x];

        numbers[x] = numbers[y];
        numbers[y] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // 2. 배열 순서 변경
        // 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
        // 힌트
        // Random을 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체하면 된다.
        
        // rand 함수 사용하는법
        
        // Random rand = new Random();
        
        // // 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.     
        // for (int i = 0; i < 100; i++) {
        //     int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
        //     // swap 구현
        // }
        // 출력 예시(매번 달라짐)
        
        // 4 5 7 8 9 1 3 6 2 10 

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            x = rand.nextInt(10);
            y = array[0];

            temp = array[x];
            array[0] = temp;
            array[x] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // 3. 빈도수 구하기
        // 1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
        // 1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
        // int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
        
        // 출력 예시
        // 1 : 2개
        // 2 : 3개
        // 3 : 3개
        // 4 : 1개
        // 5 : 1개

        int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
        int[] counts = new int[6];

        for (int i = 0; i < numbers3.length; i++) {
            counts[numbers3[i]] += 1;
        }

        for (int i = 1; i < counts.length; i++) {
            System.out.println(i + " : " + counts[i] + " ");
        }

        System.out.println();

        */

        // int[][] scores = {
        //     {80, 85, 90},
        //     {91, 82, 72},
        //     {77, 88, 99},
        //     {66, 55, 44},
        //     {33, 22, 11}
        // };

        // for (int i = 0; i < scores.length; i++) {
        //     for (int j = 0; j < scores[i].length; j++) {
        //         System.out.print(scores[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // find mean
        // double avg = 0;

        // for (int i = 0; i < scores.length; i++) {
        //     for (int j = 0; j < scores[i].length; j++) {
                
        //         System.out.print(scores[i][j] + " ");
        //         avg += scores[i][j];
        //     }

        //     System.out.print("avg " + avg / (double)scores[i].length);
        //     System.out.println();
        //     avg = 0;
        // }

        int[][] scores = {
            {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
            {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
            {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
            {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
            {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
        };

        // 1. 학생별 평균 구하기
        // 각 학생의 평균을 각각 구해서 출력하세요.
        // 출력
        
        // 1번째 학생의 평균은 89.9
        // 2번째 학생의 평균은 84.8
        // 3번째 학생의 평균은 94.2
        // 4번째 학생의 평균은 78.3
        // 5번째 학생의 평균은 54.8
        
        // double avg = 0;

        // for (int i = 0; i < scores.length; i++) {
        //     for (int j = 0; j < scores[i].length; j++) {
                
        //         System.out.print(scores[i][j] + " ");
        //         avg += scores[i][j];
        //     }

        //     System.out.print("avg " + avg / (double)scores[i].length);
        //     System.out.println();
        //     avg = 0;
        // }  
        
        // 2. 학생별 최고점 구하기
        // 각 학생의 최고 점수를 구해서 출력하세요.
        // 출력
        
        // 1번째 학생의 최고점은 93
        // 2번째 학생의 최고점은 98
        // 3번째 학생의 최고점은 98
        // 4번째 학생의 최고점은 100
        // 5번째 학생의 최고점은 67

        // int max = 0;

        // for (int i = 0; i < scores.length; i++) {
        //     max = scores[i][0];
        //     for (int j = 1; j < scores[i].length; j++) {
        //         if (max < scores[i][j]) {
        //             max = scores[i][j];
        //         }
        //     }

        //     System.out.println(i + 1 + " Max score : " + max);
        //     max = 0;
        // }

        // 3. 평균 최고점 구하기
        // 평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
        // 출력
        // 평균이 가장 높은 학생은 3번째 학생이고, 평균 점수는 94.2

        double max = 0;
        int std = 0;
        double[] avg = new double[scores.length];

        avg[0] = 0;
        max = avg[0];
        
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
                avg[i] += scores[i][j];
            }

            System.out.print("avg " + (double) avg[i] / scores[i].length);
            System.out.println();
            
            if (max < (double) avg[i] / scores[i].length) {
                max = (double) avg[i] / scores[i].length;
                std = i + 1;
            }
        }

        System.out.println("Student with highest avg is " + std + " with avg of " + max);

        // 4. 특정 과목 최고점
        // 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
        // 출력
        
        // 4번째 과목의 최고 성적자는 2번째 학생이고, 점수는 98

        //int highestScore = scores[3][0];
        double sum;
        double maxAverage = 0;
        int maxIndex = 0;
        double average = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = 0;
            for (int j = 3; j < scores[i].length; j++) {
                sum += scores[i][j];
                
            }

            average = (double) sum / 5.0;
            if (maxAverage < average) {
                maxAverage = average;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + " " + maxAverage);

        // String[] colours = { "Red", "Orange", "Yellow", "Green" };

        // int indexOfYellow = ArrayUtils.indexOf(colours, "Yellow");
        
        //System.out.println(Arrays.asList(temp).indexOf(100));

        //System.out.println(Arrays.asList(scores[3]).indexOf(highestScore));

        scan.close();

        

    }
}
