package MethodReferenceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Anna", "Dave", "Chuck", "Bob"));

        list.forEach(System.out::println);
//        calculator((a, b) -> a + b, 10, 2);
        calculator(Integer::sum, 10, 2);

        Supplier<PlainOdd> reference1 = () -> new PlainOdd();
        Supplier<PlainOdd> reference2 = PlainOdd::new;

        PlainOdd newPojo = reference2.get();

        System.out.println("Getting array");
        PlainOdd[] pojo1 = seedArray(PlainOdd::new, 5);
    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }

    private static PlainOdd[] seedArray(Supplier<PlainOdd> referance, int count) {
        PlainOdd[] array = new PlainOdd[count];
        Arrays.setAll(array, i -> referance.get());
        return array;
    }
}
