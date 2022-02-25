package quiz03;

import java.util.Scanner;


public class Day12_02 {
    public static void main(String[] args) {


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

        // String s1 = "eclipse";
        
        // // int CharAt - returns chat at Index
        // System.out.println(s1.charAt(5)); // s

        // // boolean contains
        // System.out.println(s1.contains("s"));

        // // boolean startsWith - to check whether if string starts with ...
        // System.out.println(s1.startsWith("ecc"));

        // // boolean endsWith 
        // // s1.endsWith("ee")

        // // length
        // // s1.length()

        // // replace
        // // s1 = "I want chicken"
        // // return = s1.replace(target, replacement)
        
        // // split - split using regex (splitter)
        // String s3 = "apple,melon,grape";
        // String[] fruits =  s3.split(",");
        
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        // // substring - cut
        // String s4 = "javastudy";
        // // s4.substring(beginIndex)
        // // s4.substring(beginIndex, endIndex) // endindex = add + 1 index
        
        // System.out.println(s4.substring(4));

        // System.out.println(s4.substring(0, 4));


        // 문자열 정수 변환
        // 아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
        // String birthday = "1995";

        // 출력 예시
        
        // 27세

        // String birthday = "1995";
        // System.out.println("Q1. " + (2022 - Integer.valueOf(birthday)));

        // 1. 문자열 변환
        // 아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
        // String gradeStr = "My grade is A";
        // 출력 예시
        // My grade is B

        /*
        String gradeStr = "My grade is A";

        System.out.println("Q1 . " + gradeStr.replace("A", "B"));

        // 2. 문자열 정수 변환
        // 아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요. (한국나이)
        // String birth = "19950721";
        // 출력 예시
        // 27세

        String birth = "19950721";
        int year = Integer.valueOf(birth.substring(0, 4));

        System.out.println("Q2. " + (2022 - year));


        // 3. 문자열 검색
        // 아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
        // String sentence = "To be, or Not to Be. That Is The Question";
        // 출력 예시
        
        // 단어 개수 : 10

        String sentence = "To be, or Not to Be. That Is The Question";
        String[] array = sentence.split(" ");

        System.out.println("Words Count : " + array.length);
        */



        Scanner scan = new Scanner(System.in);

        // String word = scan.next(); // this takes String input, but >

        // System.out.println(word); // but doesn't include space

        // scan.nextLine(); // clear stream / spaces / inputs

        // String sentences = scan.nextLine(); // this takes String including spaces
        // System.out.println(sentences);



        // 1. 문자열 입력
        // id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
        // Welcome! {id}
        // 입력 예시
        
        // ID를 입력 하세요 : hagulu
        // 출력 예시
        
        // Welcome! hagulu


        
        
        System.out.print("Q1. ID : " );
        String id = scan.next();

        System.out.println("Welcome! " + id);

        // 2. 문자열 검색
        // 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
        // 입력 예시
        // 단어를 입력하세요 : elephant
        // 출력 예시   
        // e의 개수는 2개 입니다.
        System.out.print("Q2. type words : ");
        String word = scan.next();
        
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
        
            if (word.substring(i, i + 1) == "e") {
                count += 1;
            }
        }

        System.out.println("Q2. " + count);
        
        // 1. 문자열 검색
        // 파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
        // String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
        // 출력 예시
        
        // jpg 파일 개수 : 3

        String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
        
        count = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].contains("jpg")) {
                count += 1;
            }
        }

        // v2 way
        // count = 0;
        // for (int i = 0; i < files.length; i++) {
        //     if (files[i].endsWith("jpg")) {
        //         count += 1;
        //     }
        // }

        System.out.println("Q1. " + count);

        // 2. 영 단어 퀴즈
        // 영어 단어 퀴즈를 낸다.
        // 아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
        // 100점 만점 기준으로 몇점인지 출력한다.
        // 1. 승리을 영어로 입력하세요 :
        // 2. 사랑을 영어로 입력 하세요 :
        // 3. 컴퓨터를 영어로 입력 하세요 :
        // 4. 노트북을 영어로 입력하세요 :
        // 입력 예시
        
        // 1. 승리을 영어로 입력하세요 :victory
        // 2. 사랑을 영어로 입력 하세요 :lobe
        // 3. 컴퓨터를 영어로 입력 하세요 :computer
        // 4. 노트북을 영어로 입력하세요 :notebook
        // 출력 예시
        // 점수는 75점 입니다.
        
        String[] questions = {"승리", "사랑", "컴퓨터", "노트북"};
        String[] answers = {"victory", "love", "computer", "notebook"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.print("Q2. Type " + questions[i] + " in English : ");

            // == doesn't work, use .equal instead
            // if (scan.next() == answers[i]) {
            //     score += 1;
            // }

            if (scan.next().equals(answers[i])) {
                score += 1;
            }

            scan.nextLine();
            System.out.println();
        }

        System.out.println(score / 100.0);

        // 3. 동명이인 수 구하기
        // String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
        // 동명이인 종류: 송강호, 이민정, 이정재 => 3
        
        // 출력 예시
        
        // 동명이인 종류 수:3

        String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";

        String[] member = memberStr.split(":");
        
        count = 0;

        for (int i = 0; i < member.length; i++) {

            String name = member[i];
            boolean isSame = false;

            if (name.equals("")) {
                continue;
            }
            
            for (int j = i + 1; j < member.length; j++) {

                if (name.equals(member[j])) {
                    isSame = true;
                    member[j] = "";
                }
            }

            if (isSame) {
                count += 1;
            }
        }

        // for (int i = 0; i < member.length; i++) {
        //     for (int j = 0; j < member.length; j++) {
        //         if (member[i].equals(member[j])) {
        //             count += 1;
        //         }
        //     }
        // }

        System.out.println(count);


        scan.close();

   
    }
    
}
