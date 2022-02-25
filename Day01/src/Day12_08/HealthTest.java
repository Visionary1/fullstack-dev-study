package Day12_08;

public class HealthTest {

    public static void main(String[] args) {
        HealthRate healthRate = new HealthRate("찬섭", 170, 55);

        //healthRate.showInfo();
        // (비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
        // 출력 예시 (HealthTest.java)
        // 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
        // 홍길동님의 신장 168, 몸무게 90kg => 비만입니다.

        healthRate.showInfo();
        //System.out.println(healthRate.weightCheck());
        // System.out.println(healthRate.getStdWeight());
        // System.out.println(healthRate.getObesityLevel());

    }
    
    


}
