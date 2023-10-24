package BoxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
//        Integer boxedInt = new Integer(15); // deprecated since JDK 9
//        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer boxedInt = 12;
        int unboxedInt = boxedInt;
        System.out.println(boxedInt.getClass().getName());

        Double boxedDouble = getDoubleObject(); // Java auto boxing return value
        double unboxedDouble = getDoublePrimitive(); // Java auto unboxing return value

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50; // Java auto boxing to Integer Object
        System.out.println(Arrays.toString(wrapperArray)); // Array was initialize to nulls

        System.out.println(wrapperArray[0].getClass().getName());

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    public static Double getDoubleObject() {
        return Double.valueOf(10.0);
    }

    public static double getDoublePrimitive() {
        return 10.0;
    }

    public static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : varargs) {
            list.add(i);
        }
        return list;
    }
}
