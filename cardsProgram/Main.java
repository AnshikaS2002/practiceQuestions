package cardsProgram;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.addCards();
        deckOfCards.printDeck();
        System.out.println("");
        deckOfCards.shuffleCards();
        System.out.println("");
        deckOfCards.printDeck();
        System.out.println("");
        deckOfCards.distributeCards(4, 9);
        System.out.println("");
        deckOfCards.printDeck();
    }
}
