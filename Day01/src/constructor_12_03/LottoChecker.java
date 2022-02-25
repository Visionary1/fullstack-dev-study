package constructor_12_03;

import java.nio.channels.Selector;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

public class LottoChecker {

    // LottoChecker.java - 로또 확인
    // 1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
    // 로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
    // 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝

    private int[] answers = new int[6];

    public LottoChecker() {
        Random rand = new Random();
        for (int i = 0; i < this.answers.length; i++) {
            this.answers[i] = rand.nextInt(45) + 1;
        }
    }

    public String check(Lotto lotto) {
        
        int[] inputs = lotto.getInputs();
        int count = 0;

        for (int i = 0; i < this.answers.length; i++) {
            for (int j = 0; j < inputs.length; j++) {
                if (inputs[i] == this.answers[j]) {
                    count++;
                    break;
                }
            }
        }

        String msg = "꽝";

        switch (count) {
            case 6:
                msg = "1st";
                break;
            case 5:
                msg = "2nd";
                break;
            case 4:
                msg = "3rd";
                break;
            case 3:
                msg = "4th";
                break;
        }

        return msg;
    }
}
