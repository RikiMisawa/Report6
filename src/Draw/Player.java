package Draw;

import java.util.List;
import java.util.ArrayList;

public class Player {
    //フィールド
    String name;
    List<Card> hand;

    //プレイヤーは名前だけを保存
    Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    //カードを5枚引く(drawCard関数に数字を入力->その枚数ひく)
    public void drawCard(Deck deck,int numCards){
    for(int i=0; i<numCards; i++){
        hand.add(deck.getCards().remove(0));
    }
    }

    //ハンドを見せる
    public void showHand(){
        System.out.println(name + "のハンドは" + hand);
    }

    //getter
    public String getName(){
        return name;
    }

    public List<Card> getHand(){
        return hand;
    }

    public void exchangeCard(int i) {
    }

}
