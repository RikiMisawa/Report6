package Draw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    //ジョーカーを除いた52枚のトランプ
    List<Card>  cardList;

    //デッキを作成してシャッフルしたい
    public Deck(){
        cardList = new ArrayList<>();
        initializedDeck();
        shuffle();

    }

    //デッキの作成
    public void initializedDeck(){
        String suits[] = {"♠️", "♦️", "♣️", "❤️"};
        String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for(String suit : suits){
            for(String num : number){
                Card card = new Card(suit,num);
                cardList.add(card);
            }
        }
    }

    //作成したデッキをシャッフルする
    public void shuffle(){
        Collections.shuffle(cardList);
    }
    //getter
    public List<Card> getCards(){
        return cardList;
    }

}
