package quiz03;

public class Day12_02_2 {
    public static void main(String[] args) {
        // ScoreData sd = new ScoreData(); // sd is an object, instance of ScoreData

        // sd.score = 85;
        // sd.subject = "Language";
        // sd.ranking = 7;

        // sd.printScoreInfo();

        // ScoreData sd2 = new ScoreData();

        // sd2.score = 90;
        // sd2.subject = "math";
        // sd2.ranking = 1;

        // sd2.printScoreInfo();

        // 학생 명단
        // 학생 Class를 설계하세요.
        // 멤버 변수(필드)는 아래를 참조하세요.
        
        // 이름, 수업명, 나이, 전화번호
        
        // 메소드는 아래를 참조하세요.
        
        // 나이가 20세 이상이면 "OOO(이름)은 성인입니다."
        // 나이가 20세 미만이면 "OOO(이름)은 미성년자입니다."
        
        // 2개의 객체를 생성하고, 각각의 값 출력과 메소드를 호출해서 출력하세요.
        

        StudentInfo stu = new StudentInfo();
        
        stu.age = 20;
        stu.className = "math";
        stu.name = "kim";
        stu.phoneNumber = "01012345678";


        String isAdult = stu.isAdult() ? "adult" : "teenager";
        System.out.println(stu.name + " is " + isAdult);

        //System.out.println(stu.getColumnCount());

        // StudentInfo students[] = new StudentInfo();

        // StudentInfo stu2 = new StudentInfo();
        
        // stu2.age = 20;
        // stu2.className = "math";
        // stu2.name = "kim";
        // stu2.phoneNumber = "01012345678";

        // students[0] = stu;
        // students[1] = stu2;

        // web_java2_21118 수강신청

        // 문자열 마지막 문제
        // 동열밍인 수 구하기 - 풀고 이메일
        // 
    }


    
}

