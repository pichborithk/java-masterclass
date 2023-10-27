package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

@FunctionalInterface
interface Operation<T> {

    T operate(T value1, T value2);
}

public class Main {

    public static void main(String[] args) {

        int result = calculator((a, b) -> a + b, 5, 2);
        int result2 = calculator2((a, b) -> a + b, 5, 2);
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> T calculator2(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}
