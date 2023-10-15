package LargestPrime;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        int result = -1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                int factor = number / i;
                boolean isPrime = true;
                for (int j = 2; j <= factor / 2; j++) {
                    if (factor % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    result = factor;
                    break;
                }
            }
        }

        return result;
    }
}
