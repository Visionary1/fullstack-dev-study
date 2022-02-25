package Day12_08_work;

public class triangle extends Shape {

    public triangle(int width, int height) {
        this.area = width * height * 0.5;
    }

    @Override
    public void printArea() {
        System.out.println("도형은 삼각형 넓이는 " + this.area + "cm^2 입니다.");
    }
}
