import java.sql.SQLOutput;

public class Loops {

    public static void main(String[] args) {
//        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
//            double interestAmount = 100 * (rate / 100);
//            if (interestAmount > 8.5) {
//                break;
//            }
//            System.out.println(interestAmount);
//        }
        int countPrime = 0;
        for (int i = 10; countPrime < 3 && i <=50; i++) {
            if (isPrime(i)) {
                System.out.println("number "+ i + " is a prime number");
                countPrime++;
            }
        }

        int foundNumber = 0;
        int sum = 0;
        for (int i = 1; foundNumber < 5 && i <= 1000; i++) {
            if (i % 5 == 0 && i % 3== 0) {
                System.out.println(i);
                foundNumber++;
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        if (number <= 3) {
            return number == 2 || number == 3;
        }
// for (int i = 2; i < number; i++) {
//     if (number % i == 0) {
//         return false;
//     }
// }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
