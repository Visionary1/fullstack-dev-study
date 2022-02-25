package Day12_08;

public class HealthRate extends HealthInfo {

    public HealthRate(String name, int height, int weight) {
        super(name, height, weight);
    }

    @Override
    public void showInfo() {
        // ex) 홍길동님의 신장 160, 몸무게 45kg 입니다.
        super.showInfo();
        System.out.println(weightCheck());
        //System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다." + " " + weightCheck());
    }

    private String weightCheck() {

        double obesityLevel = getObesityLevel();

        String isObesity;

        if (obesityLevel < 10) {
            isObesity = "정상";
        } else if (obesityLevel < 20) {
            isObesity = "과체중";
        } else {
            isObesity = "비만";
        }

        return isObesity;
    }

    private double getStdWeight() {
        return (this.height - 100) * 0.9;
    }

    private double getObesityLevel() {
        double sw = getStdWeight();
        return (this.weight - sw) / sw * 100;
    }
    

    // 비만도 계산하기
    // 사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램
    
    // 표준체중:SW=(H-100)*0.9
    // 비만도: B(%)=(W-SW)/SW * 100
    
    // 부모 클래스(HeathInfo.java)를 상속받는 비만도 계산 클래스를 설계한다.(HealthRate.java)
    // 표준체중 계산하는 메소드를 정의한다.
    // 비만 여부를 구하는 메소드를 정의한다.
    // (비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
    // 출력 예시 (HealthTest.java)
    // 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
    // 홍길동님의 신장 168, 몸무게 90kg => 비만입니다.


}
