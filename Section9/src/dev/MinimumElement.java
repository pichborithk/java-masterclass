package dev;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();
        String[] sArray = input.split(",");
        int[] intArray = new int[sArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(sArray[i].trim());
        }

        return intArray;
    }

    public static int findMin (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value: array) {
            min = Math.min(value, min);
        }

        return min;
    }
}
