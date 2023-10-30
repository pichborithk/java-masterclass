package LambdaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
//        List<String> people = new ArrayList<>(List.of("bob", "anna", "david", "eddie", "carol"));
        String[] people = {"bob", "anna", "david", "eddie", "carol"};

//        people.replaceAll(p -> p.toUpperCase());
        Arrays.setAll(people, i -> people[i].toUpperCase());
        System.out.println(Arrays.toString(people));
        Arrays.asList(people).forEach(p -> System.out.println(p));

        List<String> listPeople = Arrays.asList(people);
        listPeople.replaceAll(p -> p + " " + getRandomChar('A', 'Z') + ".");
        System.out.println(listPeople);
        listPeople.replaceAll(p -> p + " " + getReversedName(p.split(" ")[0]));
        System.out.println(listPeople);

        List<String> newList = new ArrayList<>(listPeople);
        newList.removeIf(p -> p.substring(0, p.indexOf(" ")).equals(p.substring(p.lastIndexOf(" ") + 1)));
        System.out.println(newList);
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
