package FunctionalInterfaceDemo.FunctionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

        list.forEach(el -> processPoint(el, (t) -> t.substring(0, 1).toUpperCase()) );
    }

    // Function<T, R> T is argument type, R is return type
    // BiFunction<T, U, R> T and U is argument type, R is return type
    // UnaryOperator<T> argument and return has the same type
    // BinaryOperator<T> 2 argument and return has the same type
    public static <T, R> void processPoint(T t, Function<T, R> function) {
        R result = function.apply(t);
        System.out.println(t + " become " + result);
    }
}
