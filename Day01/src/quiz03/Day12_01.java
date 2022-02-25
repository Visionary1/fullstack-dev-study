package quiz03;


public class Day12_01 {
    public static void main(String[] args) {

        // 1. 10 입력하기
        // [2][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
        // 출력
        // 10 10 10 
        // 10 10 10 

        // int[][] array = new int[2][3];

        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         array[i][j] = 10;
        //     }
        // }
        // printArray(array);

        // 2. 순서대로 입력하기
        // [3][4] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
        // 출력
        
        // 1 2 3 4 
        // 1 2 3 4 
        // 1 2 3 4 

        /*
        int[][] array2 = new int[3][4];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = j + 1;
            }
        }

        printArray(array2);

        // 3. 배열 별로 입력하기
        // [3][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 첫 번째 행은 1, 두 번째 행은 2, 세 번째 행은 3으로 채우고 출력하세요.
        // 출력
        // 1 1 1
        // 2 2 2 
        // 3 3 3 

        int[][] array3 = new int[3][3];
        
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array3[i][j] = i + 1;
            }
        }

        printArray(array3);

        // 4. 십자(+) 그리기
        // [5][5] 크기의 배열을 만드세요.
        // 모든 값을 0으로 초기화 하세요.
        // 반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
        // 출력
        
        // 0 0 1 0 0 
        // 0 0 1 0 0 
        // 1 1 1 1 1 
        // 0 0 1 0 0 
        // 0 0 1 0 0 

        int[][] array4 = new int[5][5];
        
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == 2 || j == 2) {
                    array4[i][j] = 1;
                }
            }
        }
        printArray(array4);

        // 5. 전체 수 입력
        // [3][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
        // 출력
        
        // 1 2 3 
        // 4 5 6 
        // 7 8 9 

        int[][] array5 = new int[3][3];
        int tick = 0;

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                tick += 1;
                array5[i][j] = tick;
            }
        }

        printArray(array5);

        // 6. 전체 수 입력
        // [3][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
        // 출력
        
        // 1 4 7  i 0, j 0 1 2 0 3 6
        // 2 5 8  i 1, j 0 1 2 0 3 6
        // 3 6 9  i 2, j 0 1 2

        int[][] array6 = new int[3][3];
        //tick = 0;

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = (i + 1) + 3 * j;
            }
        }

        printArray(array6);
        */

        // String a = "hi";
        // String b = "hi";

        // String c = new String("hi"); // constant pool
        // a == b, c != a nor b
        // hence, a == c is false, to eval use, c.equals
        //c.equals(a)
        // eval String with c.equals() whenever neccessary

        // int number = 3;
        // //String str1 = number; // doesn't work, digits + string = string, hence we can
        // String str1 = number + ""; // this works, bad for memory allocation tho hence not encouraged => resolved in latest java
        // // can use StringBuffer, SringBuilder to optimize ? idk
        // System.out.println(str1);

        // String str2 = String.valueOf(number); // advised way
        // System.out.println(str2);

        // String str3 = "5";
        // int number2 = Integer.valueOf(str3);
        // System.out.println(str3);

        // int number3 = Integer.parseInt(str3);
        // System.out.println(number3);

        String s1 = "eclipse";
        
        // int CharAt - returns chat at Index
        System.out.println(s1.charAt(5)); // s

        // boolean contains
        System.out.println(s1.contains("s"));

        // boolean startsWith - to check whether if string starts with ...
        System.out.println(s1.startsWith("ecc"));
        

        // 문자열 정수 변환
        // 아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
        // String birthday = "1995";
        // 출력 예시
        
        // 27세

        String birthday = "1995";
        System.out.println("Q1. " + (2022 - Integer.valueOf(birthday)));

        // 1. 문자열 변환
        // 아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
        // String gradeStr = "My grade is A";
        // 출력 예시
        // My grade is B

        


    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
