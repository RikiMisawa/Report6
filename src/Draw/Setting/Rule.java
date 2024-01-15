package Draw.Setting;

import java.util.List;

import Draw.Card;
import Draw.Player;

public class Rule {

    //役の順位を数値化
    static final int ROYAL_FLASH = 1;
    static final int STRAIGHT_FLASH = 2;
    static final int FOUR_CARD = 3;
    static final int FULL_HOUSE = 4;
    static final int FLUSH = 5;
    static final int STRAIGHT = 6;
    static final int THREE_CARD = 7;
    static final int TWO_PAIR = 8;
    static final int ONE_PAIR = 9;
    static final int HIGH_HAND = 10;

    //手札のマークと数字を記憶したい
    List<Card> hand; 

    public Rule(List<Card> hand){
        this.hand = hand;
    }
    
    //役の判定メソッド
    private boolean isFourCard(){

    }
    
}
