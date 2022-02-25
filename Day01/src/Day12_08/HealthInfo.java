package Day12_08;

public class HealthInfo {
    protected String name;
    protected int height;
    protected int weight;

    public HealthInfo(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void showInfo() {
        // ex) 홍길동님의 신장 160, 몸무게 45kg 입니다.
        System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
