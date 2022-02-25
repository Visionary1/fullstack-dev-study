package constructor_12_03;

public class Circle {

    // 1. 원
    // 원 을 Class 로 설계하세요.
    // 멤버 변수는 아래를 참조 하세요.
    // 반지름
    
    // 메소드는 아래 를 참조하세요
    // 넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
    
    // pi는 3.14
    
    // 원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
    
    // 출력 예시
    
    // 원의 넓이 : 200.96
    // 원의 둘레 : 50.24
    // 원 25개 넓이 : 5024.0

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

        System.out.println("r " + this.radius);
    }

    public double getWidth() {
        return (3.14 * this.radius * this.radius);
        //System.out.println("Width : " + 3.14 * this.radius * this.radius);
    }

    public double getArea() {
        return (2 * 3.14 * this.radius);
        //System.out.println("area :" + 2 * 3.14 * this.radius);
    }

    // overloading
    // 메소드 이름은 같은데, 파라미터의 개수가 다르거나,  파라미터의 타입이 다른 경우 => 다른 메소드로 인지함
    public double getWidth(int count) {
        return getWidth() * count;
    }
    
}
