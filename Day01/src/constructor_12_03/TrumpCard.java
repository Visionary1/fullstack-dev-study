package constructor_12_03;

import java.util.Hashtable;

public class TrumpCard {

    // 트럼프 카드 섞기
    // 트럼프 카드를 만들고 섞은 후 잘 섞였는지 확인하는 프로그램
    // * 스페이드(spade), 하트(heart), 다이아몬드(diamond), 클로버(club) 네 가지의 모양이 있다.
    // * 각 모양별로 13장의 카드가 있다.(1~13까지의 번호로 저장)
    // * 카드를 랜덤으로 섞는다.
    // * 섞는 방법 힌트: 총 52장의 카드가 들어있는 배열에서
    // index 0번째 카드와 랜덤한 index번째 카드와의 교환(swap)을 1,000회 하여 섞는다.
    // * 카드들이 잘 섞여졌는지 전체 출력한다.
    
    // 힌트: 트럼프 카드 객체는 '한 장'이며 모양과 숫자를 넣어주고, 카드를 섞는 것은 사용자다.

    //private String[] shape = {"spade", "heart", "diamond", "club"};
    private Hashtable<Integer, String> shape = new Hashtable<Integer, String>();
    private int[] number = new int[13];

    private int[][] deck = new int[4][13];

    public TrumpCard() {

        this.shape.put(1, "spade");
        this.shape.put(2, "heart");
        this.shape.put(3, "diamond");
        this.shape.put(4, "club");

        //shape.get(1));

        for (int i = 1; i < deck.length + 1; i++) {
            for (int j = 1; j < number.length + 1; j++) {
                deck[i - 1][j - 1] = j;
                // this.shape.get(i) + " " + j;
                
            }
        }
    }

    public void mix() {
        
    }
    

    /*
    
    */
    

    

    // private int[] spades = new int[13];
    // private int[] hearts = new int[13];
    // private int[] diamonds = new int[13];
    // private int[] clubs = new int[13];

    // private int deck[][] = new int[4][13];
    

    // public TrumpCard() {
    //     for (int i = 0; i < this.spades.length; i++) {
    //         this.spades[i] = i;
    //     }

    //     for (int i = 0; i < this.hearts.length; i++) {
    //         this.hearts[i] = i;
    //     }

    //     for (int i = 0; i < this.diamonds.length; i++) {
    //         this.diamonds[i] = i;
    //     }

    //     for (int i = 0; i < this.clubs.length; i++) {
    //         this.clubs[i] = i;
    //     }

    //     deck[0] = this.spades;
    //     deck[1] = this.hearts;
    //     deck[2] = this.diamonds;
    //     deck[3] = this.clubs;

    //     for (int i = 0; i < 4; i++) {
    //         for (int j = 0; j < deck[i].length; j++) {
                
    //         }
    //     }

        
    // }

}
