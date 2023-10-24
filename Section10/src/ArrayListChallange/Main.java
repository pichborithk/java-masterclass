package ArrayListChallange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            printActions();
            switch (scanner.nextInt()) {
                case 1 -> addItems(myList);
                case 2 -> removeItems(myList);
                default -> flag = false;
            }
            myList.sort(Comparator.naturalOrder());
            System.out.println(myList);
        }

    }

    public static void printActions() {
        System.out.print("""
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""" + " ");
    }

    public static void addItems(ArrayList<String> arrayList) {
        System.out.println("Add item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        arrayList.addAll(List.of(items));

        for (String item : items) {
//            if (arrayList.indexOf(item.strip()) < 0) {
//                arrayList.add(item.strip());
//            }
            if (!arrayList.contains(item.strip())) {
                arrayList.add(item.strip());
            }
        }
    }

    public static void removeItems(ArrayList<String> arrayList) {
        System.out.println("Remove item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            arrayList.remove(item.strip());
        }
    }
}
