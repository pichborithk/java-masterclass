public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigit(125));
    }

    public static int sumDigit(int number) {
        int result = 0;
        if (number < 0) {
            result = -1;
        } else {
//            while (number > 0) {
//                result += number % 10;
//                number /= 10;
//            }
            while (number > 9) {
                result += number % 10;
                number /= 10;
            }
            result += number;
        }

        return result;
    }
}
