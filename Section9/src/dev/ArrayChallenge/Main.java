package dev.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] myArray = getRandomArray(5);
        System.out.println(Arrays.toString(myArray));
        int[] reverseSortedArray = reverseSortArray(myArray);
        System.out.println(Arrays.toString(reverseSortedArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private static int[] reverseSortArray(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(newArray));
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    int temp = array[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                    System.out.println("------> " + Arrays.toString(newArray));
                }
            }
            System.out.println("---> " + Arrays.toString(newArray));
        }
        return newArray;
    }
}
