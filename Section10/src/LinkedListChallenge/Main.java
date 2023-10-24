package LinkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Town> townToVisit = new LinkedList<>();
        addTown(townToVisit, new Town("Adelaide", 1374));
        addTown(townToVisit, new Town("Alice Springs", 2771));
        addTown(townToVisit, new Town("Brisbane", 917));
        addTown(townToVisit, new Town("Darwin", 3972));
        addTown(townToVisit, new Town("Melbourne", 877));
        addTown(townToVisit, new Town("Perth", 3923));
        addTown(townToVisit, new Town("Sydney", 0));
        System.out.println(townToVisit);

    }

    public static void addTown(LinkedList<Town> list, Town town) {
        if (list.contains(town)) {
            System.out.println("Found duplicate: " + town);
            return;
        }

        for (Town t : list) {
            if (t.name().equalsIgnoreCase(town.name())) {
                System.out.println("Found duplicate: " + town);
                return;
            }
        }

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (town.distance() < iterator.next().distance()) {
                iterator.previous();
                iterator.add(town);
                return;
            }
        }

//        int matchedIndex = 0;
//        for (Town t : list) {
//            if (town.distance() < t.distance()) {
//                list.add(matchedIndex, town);
//                return;
//            }
//            matchedIndex++;
//        }

        list.add(town);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter:
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    public static void runApp(LinkedList<Town> list) {
        var iterator = list.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String input = scanner.nextLine().toUpperCase().substring(0, 1);
            switch (input) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) { // Reversing direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); // Adjust position forward
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User want to go backward");
                    if (forward) { // Reversing direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous(); // Adjust position forward
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(list);
                    break;
                case "M":
                    printMenu();
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
}
