package MethodReferenceChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person(String first) {

        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    public static void main(String[] args) {

        String[] people = {"bob", "anna", "david", "eddie", "carol"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                p -> p + " " + getRandomChar('A', 'Z') + ".",
                Main::getReversedName,
                tim::last,
                (new Person("bo"))::last
                ));

        applyChange(people, list);
    }

    private static void applyChange(String[] names, List<UnaryOperator<String>> stringFunctions) {

//        for (var name : names) {
//            for (var func : stringFunctions) {
//                name = name.transform(func);
//            }
//        }

        List<String> backedByArray = Arrays.asList(names);
        for (var func : stringFunctions) {
//            backedByArray.replaceAll(s -> s.transform(func));
//            backedByArray.replaceAll(s -> func.apply(s));
//            backedByArray.replaceAll(func::apply);
            backedByArray.replaceAll(func);
            System.out.println(Arrays.toString(names));
        }
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}

