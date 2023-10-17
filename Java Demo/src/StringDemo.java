public class StringDemo {

    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");
        printInformation("         ");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of Wold = %d %n", helloWorld.indexOf("Wold"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 8));

        if (helloWorld.equals("hello world")) {
            System.out.println("Values match exactly");
        }

        if (helloWorld.equalsIgnoreCase("hello world")) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String start with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String end with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        String birthDate = "26/11/1989";
        System.out.println("Birth year = " + birthDate.substring(6));
        System.out.println("Month year = " + birthDate.substring(3, 5));
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
