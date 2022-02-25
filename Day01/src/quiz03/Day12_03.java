package quiz03;

public class Day12_03 {
    public static void main(String[] args) {
        
        // Cellphone cellphone = new Cellphone();

        // cellphone.maker = "Apple";
        // cellphone.model = "iPhone 12";
        // cellphone.color = "Black";
        // cellphone.price = 1299;

        // System.out.println(cellphone.maker);

        // cellphone.call();
        // cellphone.camera();

        // // create 100 objects 
        // Cellphone[] cellphones = new Cellphone[100];

        // for (int i = 0; i < cellphones.length; i++) {
        //     cellphones[i] = new Cellphone();
        // }

        // for (int i = 0; i < cellphones.length; i++) {
        //     System.out.println(cellphones[i].maker);
        // }

        // 1. Person 클래스 만들기
        // Person 클래스를 만드세요.
        // 멤버변수명(필드)과 메소드명은 영문 소문자로 지으세요.
        
        // 필드
        // 이름(String)
        // 생년월일(String) - 'yyyymmdd' 형식
        // 성별(String)
        // 메소드
        // 인사하기: 인사말을 출력한다.
        // 걷기: 걷는다고 출력한다.
        // 자기소개 하기: "내 이름은 OOO이고 성별은 OO이다." 라고 출력한다.
        // 나이 알려주기: 생년월일을 이용해서 나이를 계산하여 "나이는 OO세이다."라고 출력한다.
        // 객체 생성 후 메소드들을 모두 호출하세요.
        
        // 객체 생성 및 호출 예시(메소드명은 각자 지을 것)
        
        // //
        
        // // 메소드 호출
        // 객체명.인사하기();
        // 객체명.걷기();
        // 객체명.소개하기();
        // 객체명.나이알려주기();

        Person person1 = new Person();

        person1.name = "kim";
        person1.birth = "19960423";
        person1.sex = "male";

        person1.hello();
        person1.walk();
        person1.introduce();
        person1.age();
    }
}
