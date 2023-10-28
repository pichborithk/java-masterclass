package FunctionalInterfaceDemo.Supplier;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};

        String[] randomList = randomlySelectedValues(15, names, () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> supplier) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[supplier.get()];
        }

        return selectedValues;
    }
}
