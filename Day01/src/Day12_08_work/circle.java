package Day12_08_work;

public class circle extends Shape {

    public circle(double radius) {
        this.area = radius * radius * 3.14; 
    }

    @Override
    public void printArea() {
        System.out.println("도형은 원 넓이는 " + this.area + "cm^2 입니다.");
    }
}
