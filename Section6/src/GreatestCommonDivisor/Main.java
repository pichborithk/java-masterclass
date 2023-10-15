package GreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int x, int y) {
        int result = 1;
        if (x < 10 || y < 10) {
            result = -1;
        } else {
            for (int i = 2; i <= x || i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    result = i;
                }
            }
        }

        return result;
    }
}
