package Draw;



public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        
        for(Card card : deck.getCards()){
            System.out.println(card);
        }

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        player1.drawCard(deck,5);
        player2.drawCard(deck, 5);

        player1.showHand();
        player2.showHand();

        

        Game game = new Game(deck,player1);

        game.exchangeCards();

       
    }

    
}
