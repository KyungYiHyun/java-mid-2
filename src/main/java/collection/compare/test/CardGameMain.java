package collection.compare.test;

import java.util.*;

public class CardGameMain {
    public static void main(String[] args) {
        // 코드 작성
        Deck deck = new Deck();

        Player player1 = new Player("A");
        Player player2 = new Player("B");
        for (int i = 0; i < 5; i++){
            player1.drawCard(deck.getCards());
            player2.drawCard(deck.getCards());
        }

        player1.getCards().sort(null);
        player2.getCards().sort(null);
        System.out.println("플레이어1의 카드: " + player1.getCards() + ", 합계: " + player1.calTotal());
        System.out.println("플레이어2의 카드: " + player2.getCards() + ", 합계: " + player2.calTotal());
        Player winner = getWinner(player1, player2);
        if (winner == null){
            System.out.println("무승부");
        } else {
            System.out.println(winner.getName() + "승리");
        }

    }


    private static Player getWinner(Player p1, Player p2){
        Integer t1 = p1.calTotal();
        Integer t2 = p2.calTotal();
        if (t1 > t2){
            return p1;
        } else if (t1 < t2) {
            return p2;
        }
        else return null;
    }
}