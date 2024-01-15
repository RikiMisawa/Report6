package Draw;

import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;

    public Game(Deck deck, Player player){
        this.deck = deck;
        this.player = player;
    }
    
    
    public void exchangeCards(){
        //交換が必要か尋ねる際に使うscanner
        Scanner scanner = new Scanner(System.in);
        //今の手札を見せる
        System.out.println("あなたの今の手札は");
        player.showHand();
        //交換が必要かどうか
        System.out.println(player.getName() + "さん、カードを交換しますか？（はい/いいえ）");
        String line = scanner.nextLine();
        //交換が必要な場合
        if(line.equals("はい")){
            System.out.println("どのカードを入れ替えるか入力してください（数字の間に『,』 を入力）");
            String[] nums = scanner.nextLine().split(",");
            for(String num : nums){
                //持っている手札（交換したい）
                int index = Integer.parseInt(num) - 1;//Stringをintに変換

                Card exCard = player.getHand().remove(index);
                player.getHand().add(deck.getCards().remove(0));//新しいカードを取得
                System.out.println(exCard + "を交換しました");   
            }
            
        }

        System.out.println("あなたの新しい手札は");
        player.showHand();

    }   

}
