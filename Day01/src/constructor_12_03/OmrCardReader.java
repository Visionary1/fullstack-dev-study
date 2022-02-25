package constructor_12_03;

public class OmrCardReader {
    // 2. OmrCardReader 클래스
    // ＊객체 생성 시 문제의 정답 5개를 입력받아 정답 배열에 저장해둔다.
    // ＊OmrCard 하나를 입력받아서 이름, 학번, 점수(100점 만점)를 출력한다.

    private int[] answers;
    private int[] correctAnswers = new int[5];

    public OmrCardReader(OmrCard OmrCard, int[] answer, int[] correctAnswers) {
        this.answers = answer;
        this.correctAnswers = correctAnswers;

        //int[] correctAnswers = {1, 2, 3, 4, 5};
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            if (correctAnswers[i] == answer[i]) {
                count++;
            }
        }

        System.out.println("Name : " + OmrCard.getName());
        System.out.println("ID : " + OmrCard.getID());
        System.out.println("Score : " + (count / 5.0) * 100);
    }


}
