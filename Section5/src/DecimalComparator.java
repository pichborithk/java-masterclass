public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int newNum1 = (int) (num1 * 1000);
        int newNum2 = (int) (num2 * 1000);

        return newNum1 == newNum2;
    }
}
