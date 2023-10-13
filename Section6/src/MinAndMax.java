public class MinAndMax {

    public static void main(String[] args) {
        printMinAndMax();
    }

    public static void printMinAndMax() {
        double min = 0;
        double max = 0;
        int loopCount = 0;
        do {
            String input = System.console().readLine("Enter number, or any character to exit: ");
            try {
                double number = Double.parseDouble(input);
                if (loopCount == 0) {
                    min = number;
                    max = number;
                } else {
                    min = Math.min(number, min);
                    max = Math.max(number, max);
                }
                loopCount++;
            } catch (NumberFormatException badDataInput) {
                break;
            }
        } while (true);

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
