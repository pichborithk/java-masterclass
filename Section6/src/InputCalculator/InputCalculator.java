package InputCalculator;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        double counter = 0;
        int average = 0;
        while (true) {
            String input = System.console().readLine("Enter number: ");
            try {
                int number = Integer.parseInt(input);
                sum += number;
                counter++;
            } catch (NumberFormatException badInputData) {
                break;
            }
        }

        if (counter > 0) {
            average = (int) Math.round(sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }


}
