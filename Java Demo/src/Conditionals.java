public class Conditionals {

    public static void main(String[] args) {

        boolean isAlien = false;
        // if (isAlien == false) {
        if (!isAlien) {
            System.out.println("It is not an alien");
        }

        int score = 95;
        if (score == 100) {
            System.out.println("A+");
        } else if (score < 100 && score >= 90) {
            System.out.println('A');
        } else {
            System.out.println("Pass");
        }

        if (score > 100 || isAlien) {
            System.out.println("It is an alien");
        }

        // Ternary operator
        boolean isAlien2 = score > 100 ? true : false;
        System.out.println(isAlien2);
        boolean isAlien3 = score > 100;
        System.out.println(isAlien3);

        String grade1 = score == 100
                ? "A+"
                : score < 100 && score >= 90
                ? "A"
                : "Pass";
        System.out.println(grade1);
    }
}
