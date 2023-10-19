import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {
        char[] fiveLetter = new char[5];
        for (int i = 0; i < fiveLetter.length; i++) {
            System.out.print(fiveLetter[i] + " ");
        }
        System.out.println();

        double myDoubleArray[] = new double[5];

        int[] firstFive = new int[]{1, 2, 3, 4, 5};

//        This is known as an anonymous array,
//        can only be used in declaration statement
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        int[] firstThree;
        firstThree = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(firstThree));

        Object[] objectArray = new Object[3];
        objectArray[0] = new StringBuilder("Hello");
        objectArray[1] = 1;
        objectArray[2] = firstThree;

        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));
        int[] thirdArray = Arrays.copyOf(firstArray, firstArray.length);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        int[] fourthArray = Arrays.copyOf(secondArray, 15);
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray = {"Mark", "David", "Able", "Jane", "Ralph"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
