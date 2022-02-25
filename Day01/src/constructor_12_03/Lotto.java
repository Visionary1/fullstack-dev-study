package constructor_12_03;

import java.util.Random;

public class Lotto {

    // 로또 프로그램 만들기
    // 1부터 45까지의 숫자 중 6개를 선택해서 로또를 발행하고, 당첨 결과를 확인하는 프로그램
    
    // Lotto.java - 로또
    // 메소드1: 수동(manual)
    // * 1부터 45까지의 숫자를 수동으로 6개를 입력 받는다.(중복 불가)
    // 메소드2: 자동(auto)
    // * 1부터 45까지의 숫자를 중복 없이 자동으로 입력 받는다.

    private int[] inputs = new int[6];

    public void manual(int[] inputs) {

        for (int i = 0; i < inputs.length; i++) {
            this.inputs[i] = inputs[i];
        }
        // Scanner scan = new Scanner(System.in);

        // for (int i = 0; i < this.inputs.length; i++) {
        //     System.out.println(i + " : ");
        //     this.inputs[i] = scan.nextInt();
        // }

        // scan.close();
    }

    public void auto() {
        Random rand = new Random();
        int randNum; //= rand.nextInt(45) + 1;  // 1부터 45까지의 수를 랜덤으로 뽑는다.

        boolean isDuplicated;

        for (int i = 0; i < this.inputs.length; i++) {
            isDuplicated = false;
            randNum = rand.nextInt(45) + 1;
            for (int j = 0; j < this.inputs.length; j++) {
                if (randNum == this.inputs[i]) {
                    isDuplicated = true;
                    i--; // i 를 한번 더 돌리기 위해
                    break;
                }
            }

            if (!isDuplicated) {
                this.inputs[i] = randNum;
            }

        }
        // for (int i = 0; i < this.inputs.length; i++) {
        //     randNum = rand.nextInt(45) + 1;
        //     for (int j = 0; j < this.inputs.length; j++) {
        //         while (randNum == this.inputs[i]) {
        //             randNum = rand.nextInt(45) + 1;
        //         }
        //     }
        //     this.inputs[i] = randNum;
        // }
    }

    public int[] getInputs() {
        return this.inputs;
    }
}
