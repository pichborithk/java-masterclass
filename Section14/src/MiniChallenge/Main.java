package MiniChallenge;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (var p : parts) {
                    System.out.println(p);
                }
            }
        };

        Consumer<String> printTheParts2 = s -> {
            String[] parts = s.split(" ");
            for (var p : parts) {
                System.out.println(p);
            }
        };

        printTheParts.accept("a b c d e");
        printTheParts2.accept("a b c d e");

        UnaryOperator<String> bo1 = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }

            }
            return returnVal.toString();
        };

        String string1 = bo1.apply("1234567890");

//        String string2 = everySecondChar2(s -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//                }
//
//            }
//            return returnVal.toString();
//        }, "1234567890");

        String string2 = everySecondChar2(bo1, "1234567890");

        Supplier<String> iLoveJava = () -> "I love Java!";
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }

        }
        return returnVal.toString();
    }

    public static String everySecondChar2(UnaryOperator<String> function, String source) {
        return function.apply(source);
    }

}
