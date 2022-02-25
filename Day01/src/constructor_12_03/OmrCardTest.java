package constructor_12_03;

public class OmrCardTest {
    public static void main(String[] args) {
    // 객체 생성 및 호출 예시(메소드명은 각자 지을 것) - RectangleTest.java
    
    // Rectangle rect1 = new Rectangle(30, 50);
    // System.out.println("넓이:" + rect1.넓이구하기() + "cm^2");
    // System.out.println("둘레:" + rect1.둘레구하기() + "cm");
    
    // Rectangle rect2 = new Rectangle(10, 10);
    // System.out.println("넓이:" + rect2.넓이구하기() + "cm^2");
    // System.out.println("둘레:" + rect2.둘레구하기() + "cm");
    // 출력 예시
    
    // 가로 30cm, 세로 50cm 사각형이 만들어졌습니다.
    // 넓이:1500cm^2
    // 둘레:160cm
    // 가로 10cm, 세로 10cm 사각형이 만들어졌습니다.
    // 넓이:100cm^2
    // 둘레:40cm

    // Rectangle rect = new Rectangle(30, 50);
    // System.out.println("width : " + rect.getWidth());
    // System.out.println("circum : " + rect.getCircum());

    // Rectangle rect2 = new Rectangle(10, 10);
    // System.out.println("width : " + rect2.getWidth());
    // System.out.println("circum : " + rect2.getCircum());

    // Circle circle = new Circle(8);

    // System.out.println(circle.getArea());
    // System.out.println(circle.getWidth());

    // System.out.println(circle.getWidth(25));

    // ProductManagement product = new ProductManagement("새우깡", 1500, "2021-12-26");

    // System.out.println(product.getName());
    // System.out.println(product.getPrice());
    // System.out.println(product.getPrice(5));
    // System.out.println(product.getExpire());


    // System.out.println(product.isExpired());

    // 3. OmrCardTest 클래스
    // - OMR 카드와 카드 리더기 객체를 만드는 클래스
    // - OmrCard 객체에는 정답을 입력한다.
    // - OmrCardReader 객체에는 위에서 만든 OmrCard를 넣어 결과를 받는다.

    OmrCard omrcard = new OmrCard(20200102, "kim");
    
    int[] answers = new int[5];
    int[] correctAnswers = {1, 2, 3, 4, 5};

    answers = omrcard.receiveAnswers();

    OmrCardReader omrCardReader = new OmrCardReader(omrcard, answers, correctAnswers);

    
    // 출력 예시
    
    // 이름: 신보람
    // 학번: 20200302
    // 점수: 80점
    }
}
