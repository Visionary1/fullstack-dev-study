package Day12_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Day12_10.list_test;

public class ex01 {
    public static void main(String[] args) {

        // List 입력, 출력, 삭제 하기
        // 중복되지 않는 과일 이름들을 입력, 출력, 삭제 하는 프로그램
        
        // ＊1:입력 2:출력 3:삭제 4:종료
        // ＊무한루프를 돌고, 4번을 누르면 입력 종료
        
        // ＊1.입력: "과일 이름을 입력하세요: " 출력하고 입력 받는다.
        // ＊과일 입력 후 입력이 성공했는지 여부를 출력한다.
        
        // ＊2.출력: 과일이 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.
        
        // ＊3.삭제: "삭제할 과일 이름을 입력하세요: "를 출력하고 해당 과일을 삭제한다.
        // ＊과일 삭제 후 삭제가 성공했는지 여부를 출력한다.
        
        // ＊ 4.종료: "종료합니다."를 출력한 후 프로그램을 종료시킨다.
        // ＊1~4 이외의 값을 입력받으면 "잘못입력했습니다" 출력한다.

        Scanner scan = new Scanner(System.in);

        List<String> fruits = new ArrayList<>();

        int number = 0;

        while (number != 4) {
            System.out.print("1. 입력, 2. 출력, 3. 삭제, 4. 종료 : ");

            number = scan.nextInt();

            if (number == 1) {
                System.out.print("과일 이름을 입력하세요: ");
                System.out.println(fruits.add(scan.next()) ? "입력성공" : "입력 실패");

            } else if (number == 2) {
                // for (String iter : fruits) {
                //     System.out.println(iter);
                // }

                System.out.println(fruits.isEmpty() ? "비어 있음" : fruits);
                
            } else if (number == 3) {
                System.out.print("삭제할 과일 이름을 입력하세요: ");
                System.out.println(fruits.remove(scan.next()) ? "삭제 성공" : "그런 과일 없어요");
            }
        }
    }
}
