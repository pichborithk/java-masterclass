public class Methods {
    // main is special, because Java's virtual machine (JVM) will look for main method
    // with particular signature (String[] args) to use it as entry point for execution code (on command line)
    public static void main(String[] args) {
        greeting();

        grade("A+");

        int score = sum(50, 25);

        grade(score);

    }

    public static void greeting() {
        System.out.println("Hello");
    }

    // method can have the same name with different signature (set of parameters)
    public static void grade(String grade) {
        System.out.println(grade);
    }

    public static void grade(int score) {
        if (score > 90) {
            System.out.println('A');
        } else if (score < 90 && score >= 80) {
            System.out.println('B');
        } else if (score < 80 && score >= 70) {
            System.out.println('C');
        } else if (score < 70 && score >= 60) {
            System.out.println('D');
        } else if (score < 60 && score >= 50) {
            System.out.println('E');
        } else {
            System.out.println("Fail");
        }
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
