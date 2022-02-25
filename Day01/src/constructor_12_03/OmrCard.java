package constructor_12_03;

import java.util.Scanner;

public class OmrCard {
    // OMR 카드 채점 프로그램 만들기
    // 객관식 문제 5개를 OMR 카드 리더기로 읽어 점수를 구하는 프로그램
    
    // 1. OmrCard 클래스
    // ＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)
    // ＊학번과 이름을 입력 받는다.
    // ＊순서대로 학생의 답 5개를 입력받는 메소드를 만든다.

    private int studentID;
    private String name;
    private int[] answer = new int[5];

    public OmrCard(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.studentID;
    }

    public int[] receiveAnswers() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Answers : ");

        //int[] answers = new int[5];

        for (int i = 0; i < this.answer.length; i++) {
            this.answer[i] = scan.nextInt();
        }

        scan.close();

        return this.answer;
    }
    
    

}
