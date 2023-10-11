public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(3));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverseNumber(-121));
//        System.out.println(reverseNumber(1212));
//        System.out.println(reverseNumber(1234));
//        System.out.println(reverseNumber(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int count = getDigitCount(number);
            int reversedNumber = reverseNumber(number);
            for (int i = 0; i < count; i++) {
                switch (reversedNumber % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                reversedNumber /= 10;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            count = -1;
        } else {
            do {
                count++;
                number /= 10;
            } while (number > 0);
        }

        return count;
    }

    public static int reverseNumber(int number) {
        int result = 0;
        while (number != 0) {
            result = (result * 10) + (number % 10);
            number /= 10;
        }

        return result;
    }
}
