package constructor_12_03;

public class Rectangle {
    // 1. 사각형(Rectangle) 클래스 만들기
    // Rectangle 클래스를 만드세요.
    // 필드명과 메소드명은 영문 소문자로 지으세요.
    
    // 필드
    // 가로길이(int)
    // 세로길이(int)
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        System.out.println("가로 " + width + " 세로 " + height + " 사각형");

    }
    // 메소드
    // 생성자: 가로길이, 세로길이를 받는다.
    // "가로 OOcm, 세로 OOcm 사각형이 만들어졌습니다" 출력
    // 넓이 구하기: 넓이를 리턴
    // 둘레 구하기: 둘레를 리턴
    // 객체 생성 후 메소드들을 모두 호출하세요.

    public int getWidth() {
        return (this.width * this.height);
    }

    public int getCircum() {
        return (this.width + this.height) * 2;
    }

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
}
