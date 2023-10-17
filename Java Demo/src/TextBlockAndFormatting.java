public class TextBlockAndFormatting {

    public static void main(String[] args) {

        String bulletIt = "Print a bulleted list:\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 34;
        System.out.printf("Your age is %d %n", age);

        System.out.printf("Age = %d, Birth year = %d %n", age, 2023 -  age);

        System.out.printf("Your age is %f%n",(float) age);

        System.out.printf("Your age is %.2f %n",(float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %d %n", i);
        }

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        String anotherFormattedString = "Your age is %d".formatted(age);
        System.out.println(anotherFormattedString);

    }
}
