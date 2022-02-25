package quiz03;

public class ScoreData {
    int score;
    String subject;
    int ranking;
    
    void printScoreInfo() {
        System.out.println("Subject : " + this.subject);
        System.out.println("Socre : " + this.score);
        System.out.println("Rank : " + this.ranking);
    }
 }

