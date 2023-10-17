public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder helloWorld = new StringBuilder("Hello World");
        helloWorld.append(" and Goodbye");
        printInformation(helloWorld);

        StringBuilder emptyString = new StringBuilder();
        StringBuilder emptyString32 = new StringBuilder(32);

        printInformation(emptyString);
        printInformation(emptyString32);

        emptyString.append("a".repeat(17));
        printInformation(emptyString);

        helloWorld.deleteCharAt(16).insert(16, 'g');
        System.out.println(helloWorld);

        helloWorld.setLength(11);
        System.out.println(helloWorld);

        helloWorld.replace(6, 11, "bo");
        System.out.println(helloWorld);
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
