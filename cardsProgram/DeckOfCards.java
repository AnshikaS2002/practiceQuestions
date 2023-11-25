package cardsProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
    ArrayList<Card> deck = new ArrayList<Card>();

    void addCards() {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(suit[i], ranks[j]));
            }
        }
    }

    void shuffleCards() {
        Random random = new Random();

        Collections.shuffle(deck, random);
    }

    void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).suit + " " + deck.get(i).rank);
        }
    }

    void distributeCards(int playerCount, int cardCount) {
        for (int i = 0; i < playerCount; i++) {
            System.out.print("player " + (i + 1) + " cards : ");
            for (int j = 0; j < cardCount; j++) {
                System.out.print(deck.get(0).rank + " " + deck.get(0).suit + ", ");
                deck.remove(0);
            }
            System.out.println("");
        }
    }
}
