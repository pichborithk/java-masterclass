package LambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

        people.sort((o1, o2) -> o1.firstName.compareTo(o2.firstName));

        for (var p : people) {
            System.out.println(p);
        }

        System.out.println("-".repeat(10));
        people.forEach(p -> System.out.println(p));
//        people.forEach(System.out::println);



    }



}
