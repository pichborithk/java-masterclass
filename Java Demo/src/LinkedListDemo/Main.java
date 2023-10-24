package LinkedListDemo;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        placesToVisit.addFirst("New York");
        placesToVisit.addLast("Florida");
        System.out.println(placesToVisit);
        placesToVisit.remove(2);
        placesToVisit.remove("New York");
//        String s1 = placesToVisit.remove(); // remove first element and return it
//        String s2 = placesToVisit.removeFirst(); // remove first element and return it
//        String s3 = placesToVisit.removeLast(); // remove last element and return it
        System.out.println(placesToVisit);
//        String s1 = placesToVisit.get(2);
//        String s2 = placesToVisit.getFirst();
//        String s3 = placesToVisit.getLast();

//        Queue Methods
        placesToVisit.offer("Arizona");
        placesToVisit.offerFirst("London");
        placesToVisit.offerLast("Paris");
        System.out.println(placesToVisit);
//        String s4 = placesToVisit.poll(); // remove first element and return it
//        String s5 = placesToVisit.pollFirst(); // remove first element and return it
//        String s6 = placesToVisit.pollLast(); // remove last element and return it
//        String s4 = placesToVisit.element(); // get first element (FIFO)

//        Stack Methods
        placesToVisit.push("California");
        System.out.println(placesToVisit);
//        String s7 = placesToVisit.pop(); // remove first element and return it
//        String s7 = placesToVisit.peek(); // get first element (FILO)
//        String s8 = placesToVisit.peekFirst();
//        String s9 = placesToVisit.peekLast();

//        System.out.println("Trip start at " + placesToVisit.getFirst());
//        String previousTown = placesToVisit.getFirst();
//        ListIterator<String> iterator = placesToVisit.listIterator();
//        while (iterator.hasNext()) {
//            var town = iterator.next();
//            System.out.println("--> From: " + previousTown + " to " + town);
//            previousTown = town;
//        }
//        System.out.println("Trip ends at " + placesToVisit.getLast());

        System.out.println("Trip start at " + placesToVisit.getFirst());
        String previousTown = placesToVisit.getFirst();
        ListIterator<String> iterator = placesToVisit.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + placesToVisit.getLast());
    }

}
