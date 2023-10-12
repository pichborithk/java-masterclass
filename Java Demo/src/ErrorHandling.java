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
        int age = year - Integer.parseInt(scanner.nextLine());

        System.out.println("So you are " + age + "year old");
    }
}
