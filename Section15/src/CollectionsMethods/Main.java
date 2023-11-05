package CollectionsMethods;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Suit.HEART, 'A');

//      -------------------- Fill Method --------------------
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());
//        Collections.fill method only fill any amount of exist elements in collection

//      -------------------- nCopied Method --------------------
        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

//      -------------------- addAll & Copy Method --------------------
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 1);

        Card kingOfClubs = Card.getFaceCard(Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        // Collections.copy copied all elements from a collection to replace the same amounts elements (start from 0 index)
        // in another collection
        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 1);
        // Collections.addAll added all elements from a collection to another collection (start from last index)
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);
        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);
        // List.copyOf copied entire collection and replace another collection entirely
        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings", 1);

//      -------------------- Reverse Method --------------------
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck of Cards", 4);

//      -------------------- Shuffle Method --------------------
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);

//      -------------------- Sort Method --------------------
        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);

        List<Card> kings = new ArrayList<>(deck.subList(44, 48));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(32, 36));
        Card.printDeck(tens, "Tens in deck", 1);

//      -------------------- Index of SubList Method --------------------
        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("Sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        Collections.shuffle(deck);
        subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("Sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

//      -------------------- Disjoint Method --------------------
        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("Disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("Disjoint2 = " + disjoint2);

//      -------------------- Binary Search Method --------------------
        Card tenOfHearts = Card.getNumericCard(Suit.HEART, 10);
        deck.sort(sortingAlgorithm);
//        to use binarySearch method the collections must be pre-sorted
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println("Found Index = " + foundIndex);
//        can use the method below if list is not sorted
        System.out.println("Found Index = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

//      -------------------- Replace All Method --------------------
        Card tenOfClubs = Card.getNumericCard(Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);
        // Collection.replaceAll has return value as boolean
        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else {
            System.out.println("No tens of hearts found in the list");
        }

//      -------------------- Frequency Method --------------------
        System.out.println("Ten of Clubs Cards = " + Collections.frequency(deck, tenOfClubs));

//      -------------------- Max Min Method --------------------
        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithm));

//      -------------------- Rotate Method --------------------
        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by Suit, Rank", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("Rotated 2: " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("Rotated -2: " + copied);

//      -------------------- Swap Method --------------------
        copied = new ArrayList<>(deck.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse : " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using reverse : " + copied);
    }
}
