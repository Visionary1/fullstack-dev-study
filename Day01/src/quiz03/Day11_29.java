package quiz03;

public class Day11_29 {
    public static void main(String[] args) {
        
        // int[] scores = {80, 85, 90, 95, 100};

        // for (int i = 0; i < scores.length; i++) {
        //     System.out.println(scores[i]);
        // }

        // int sum = 0;

        // for (int i = 0; i < scores.length; i++) {
        //     sum += scores[i];
        // }

        // System.out.println(sum);


        // 아래 배열을 이용해서 문제를 푸세요.
        // 배열 index의 시작은 0 부터인것을 유의하세요
        // int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
        // 1. 배열 값 접근
        // 배열의 4번째 값을 6으로 바꾸세요.

        int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};

        System.out.println("Q1. Before " + numbers[3]);
        numbers[3] = 6;
        System.out.println("Q1. After " + numbers[3]);
        
        // 2. 배열 출력
        // 배열의 값을 순서대로 출력하세요.
        // 출력 예시
        // 3 8 9 6 2 1 7 5 
        
        System.out.print("Q2. ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }

        // 3. 배열 역순 출력
        // 배열의 값의 반대 순서(역순)로 출력하세요.
        // 출력 예시
        // 5 7 1 2 6 9 8 3 
        System.out.println();
        System.out.print("Q3. ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        
        // 4. 배열 출력
        // 배열의 짝수번째 위치에 있는 값들을 출력하세요.
        // 출력 예시
        // 8 6 1 5 
        // int[] numbers = {3, 8, 9, 6, 2, 1, 7, 5};
        System.out.println();
        System.out.print("Q4. ");
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.print(" " + numbers[2 * i + 1]);
        }
        
        // 5. index
        // 배열의 값 중 2가 들어 있는 index를 출력하세요.
        // 반복문을 돌면서 2가 있는 값을 찾으세요.
        // 출력 예시
        // 2가 들어 있는 index는 4

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                System.out.println("Q5. Index having 2 is " + i);
            }
        }

        // 6. 최대값
        // 배열의 값 중 가장 큰 값을 출력하세요.
        // 출력 예시
        // 가장 큰 값은 9
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Q6. greatest is " + max);


        // 7. 최소값 index
        // 배열의 값 중 가장 작은 수가 저장된 index를 출력하세요.
        // 출력 예시
        // 최소값의 인덱스는 5

        int min = numbers[0];
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Q7. minimum is " + minIndex);

        // 8. 평균
        // 배열의 모든 수의 평균을 출력하세요
        // 출력 예시
        // 평균은 5.125

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Q8. avg is " + (double)sum / numbers.length);
    }
}
