package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards;
    private int total;
    private String name;

    public Player(String name) {
        this.cards = new ArrayList<>();
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void drawCard(List<Card> inputCards) {
        cards.add(inputCards.remove(0));
    }

    public List<Card> getCards() {
        return cards;
    }

    public Integer calTotal(){
        for (Card card : cards){
            total += card.getNumber();
        }

        return total;
    }


}
