public class SumInputNumber {

    public static void main(String[] args) {
        printSumInputNumber();
    }

    public static void printSumInputNumber() {
        int sum = 0;
        int counter = 1;
        do {
            String input = System.console().readLine("Enter number #" + counter + ": ");
            try {
                int number = Integer.parseInt(input);
                counter++;
                sum += number;
            } catch (NumberFormatException badDataInput) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

//        while (counter <= 5) {
//            String input = System.console().readLine("Enter number #" + counter + ": ");
//            try {
//                int number = Integer.parseInt(input);
//                counter++;
//                sum += number;
//            } catch (NumberFormatException badDataInput) {
//                System.out.println("Invalid number");
//            }
//        }

        System.out.println("The sum of the 5 numbers = " + sum);
    }

}
