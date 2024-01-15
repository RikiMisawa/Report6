package Draw;

public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        
        for(String card : deck.getCards()){
            System.out.println(card);
        }

        Player player1 = new Player("Player1");

        player1.drawCard(deck,5);

        player1.showHand();
    }

    
}
