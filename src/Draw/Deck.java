package Draw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    //ジョーカーを除いた52枚のトランプ
    List<String>  card_list;

    //デッキを作成してシャッフルしたい
    public Deck(){
        card_list = new ArrayList<>();
        initializedDeck();
        shuffle();

    }

    //デッキの作成
    public void initializedDeck(){
        String suits[] = {"♠️", "♦️", "♣️", "❤️"};
        String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for(String suit : suits){
            for(String num : number){
                card_list.add(suit + num);
            }
        }
    }

    //作成したデッキをシャッフルする
    public void shuffle(){
        Collections.shuffle(card_list);
    }
    //getter
    public List<String> getCards(){
        return card_list;
    }

}
