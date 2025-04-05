package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCards();
        getShuffle();
    }

    private void initCards() {
        for (int i = 1; i <= 13; i++){
            for (Emblem emblem : Emblem.values()){
                cards.add(new Card(i,emblem));
            }
        }

    }

    private void getShuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
