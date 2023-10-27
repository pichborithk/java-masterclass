package FunctionalInterfaceDemo.PredicateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

        list.forEach(s -> System.out.println(s));
        list.removeIf(s -> s.startsWith("b"));
        list.forEach(s -> System.out.println(s));

        list.forEach(s -> processPoint(s, (t) -> t.endsWith("a")));
    }

    public static <T> void processPoint(T t, Predicate<T> predicate) {
        boolean result = predicate.test(t);
        if (result) {
            System.out.println(t + " Pass the test");
        }
    }

}
