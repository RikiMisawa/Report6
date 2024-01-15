package Draw;

public class Card {
    private String suit;
    private String number;

    public Card(String suit, String number){
        this.suit = suit;
        this.number = number;
    }

    //getter
    public String getSuit(){
        return suit;
    }

    public String getNumber(){
        return number;
    }
    
    //オブジェクトをテキストにしたい
    @Override
    public String toString(){
        return suit + number;
    }

}
