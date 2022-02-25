package Day12_13;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Ex02 {
    public static void main(String[] args) {
        // map
        // 1. key-value just like dictionary in other lang
        // 2. key can NOT be duplicated, while value can be duplicated
        // 3. can get value by key
        // 4. hard to get key by value

        /*
        // key is hash
        Map<String,Integer> map = new HashMap<>();//new에서 타입 파라미터 생략가능
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 4);

        System.out.println(map.get("a"));

        map.put("a", 3);

        System.out.println(map.get("a"));

        // containsKey 
        System.out.println(map.containsKey(1));

        // containsValue
        System.out.println(map.containsValue(3));

        // size (pairs) of map ; key-value is one pair
        System.out.println(map.size());

        // get only Keys
        Set<String> keys = map.keySet();
        System.out.println(keys);
        
        for (String string : keys) {
            System.out.println(map.get(string));
            System.out.println(string);
        }

        // get values
        Collection<Integer> values = map.values();
        System.out.println(values);

        // delete pair by key
        map.remove("a");
        System.out.println(map);

        // delete pair by key and value
        map.remove("b", 2);
        System.out.println(map);

        // map 에 map 추가하기
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("z", 100);

        map2.putAll(map);

        System.out.println(map2);
        
        */

        //     1. 자료 입력
        //     아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
        //     국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
            //     출력 예시
            //     {국어=90, 사회=80, 과학=100, 수학=85, 영어=90}

        Map<String, Integer> grades = new HashMap<>();
        grades.put("lang", 90);
        grades.put("math", 85);
        grades.put("eng", 90);
        grades.put("society", 80);
        grades.put("science", 100);

        System.out.println(grades);

        //     2. 값 수정
        //     사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
        //     값을 바꾸고 출력 하세요.
            //     출력 예시
            //     {국어=90, 사회=85, 과학=100, 수학=85, 영어=90}

        grades.put("society", 85);
        System.out.println(grades);

        //     3. 값 찾기
        //     과목명을 입력 받고, 점수를 출력 하세요.
        //     단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
            //     입력 예시
            //     조회할 과목명을 입력하세요 : 영어
            //     출력 예시
            //     영어 : 90

        Scanner scan = new Scanner(System.in);

        System.out.print("Type course name : ");

        String courseName = scan.next();
        
        if (grades.containsKey(courseName)) {
            System.out.println(grades.get(courseName));
        } else {
            System.out.println("N/A");
        }

        //     4. 값 찾기
        //     90점 이상의 모든 과목을 출력하세요.
            //     출력 예시
            //     국어 과학 영어 

        Set<String> courses = grades.keySet();
        String courseAbove = "";

        // Iterator<String> iter = courses.iterator();


        for (String string : courses) {
            if (grades.get(string) >= 90) {

                courseAbove = string + " " + courseAbove;
            }
        }

        System.out.println(courseAbove);

        //     5. 값 확인
        //     100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
        //     성적 우수상을 받을 수 있는지 출력하세요.
            //     출력 예시
            //     수상 가능

        if (grades.containsValue(100)) {
            System.out.println("available");
        }
        
        scan.close();
    }
}
