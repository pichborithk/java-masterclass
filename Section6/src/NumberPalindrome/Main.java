package NumberPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            reverse = (reverse * 10) + lastDigit;
        }

        return reverse == number;
    }
}
