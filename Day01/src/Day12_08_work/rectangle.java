package Day12_08_work;

public class rectangle extends Shape {

    public rectangle(int width, int height) {
        this.area = width * height;
    }

    @Override
    public void printArea() {
        System.out.println("도형은 사각형이며 넓이는 " + this.area + "cm^2 입니다.");
    }
}
