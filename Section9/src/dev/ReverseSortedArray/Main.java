package dev.ReverseSortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        System.out.println(Arrays.toString(myArray));

    }

    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[len];
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Enter %d integer value: ", i);
            myArray[i] = scanner.nextInt();
        }
        scanner.close();

        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
