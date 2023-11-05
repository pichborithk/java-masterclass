package CollectionsMethodsChallenge.games.poker;

import CollectionsMethodsChallenge.Card;

import java.util.*;
import java.util.function.Consumer;

public class PokerGame {

    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainningCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay() {
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomMiddle = new Random().nextInt(15, 25);
        Collections.rotate(deck, randomMiddle);
        Card.printDeck(deck);

        deal();
        System.out.println("-".repeat(30));
        Consumer<PokerHand> checkHand = PokerHand::evalHand;
        pokerHands.forEach(checkHand.andThen(System.out::println));

        int cardsDealt = playerCount * cardsInHand;
        int cardsRemaining = deck.size() - cardsDealt;

//        remainningCards = new ArrayList<>(deck.subList(cardsDealt, deck.size()));
        remainningCards = new ArrayList<>(Collections.nCopies(cardsRemaining, null));
        remainningCards.replaceAll(c -> deck.get(cardsDealt + remainningCards.indexOf(c)));
        Card.printDeck(remainningCards, "Remaining Cards", 2);

    }

    public void deal() {
        Card[][] hands = new Card[playerCount][cardsInHand];
        for (int deckIndex = 0, i = 0; i < cardsInHand; i++) {
            for (int j = 0; j < playerCount; j++) {
                hands[j][i] = deck.get(deckIndex++);
            }
        }

        int playerNo = 1;
        for (var hand : hands) {
            pokerHands.add(new PokerHand(playerNo, Arrays.asList(hand)));
        }
    }
}
