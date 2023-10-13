import java.util.Scanner;

public class ErrorHandling {

    public static void main(String[] args) {
        try {
            getInputFromConsole(2023);
        } catch (NullPointerException err) {
            getInputFromScanner(2023);
        }
    }

    public static void getInputFromConsole(int year) {
        String name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " + name);

        int age = year - Integer.parseInt(System.console().readLine("What year were you born? "));

        System.out.println("So you are " + age + "year old");
    }

    public static void getInputFromScanner(int year) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (year - 125) + " and <= " + year);
            try {
                age = checkData(year, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!! Try again.");
            }
        } while (!validDOB);


        System.out.println("So you are " + age + "year old");
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }

        return currentYear - dob;
    }
}
