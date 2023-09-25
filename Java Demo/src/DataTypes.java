public class DataTypes {

    public static void main(String[] args) {

        // Whole numbers Data Types: byte, short, int, long
        // Default Data Types for whole numbers is Integer
        int minInt = Integer.MIN_VALUE;
        int maxInt = 2_147_483_647;
        System.out.println("Integer value range (" + minInt + " to " + maxInt + ")"); // -2147483648, 2147483647

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte value range (" + minByte + " to " + maxByte + ")"); // -128, 127

        short minShort = Short.MIN_VALUE, maxShort = Short.MAX_VALUE;
        System.out.println("Short value range (" + minShort + " to " + maxShort + ")"); // -32768, 32767

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long value range (" + minLong + " to " + maxLong + ")"); // -9223372036854775808, 9223372036854775807

        // Suffix 'l' or 'L'
        long myLongValue = 10;
        System.out.println(myLongValue);
        // We can not assign value greater than Max Value of Integer to without suffix 'l' or 'L', or we will get the error 'integer number too large'
        myLongValue = 12_147_483_647L;
        System.out.println(myLongValue);

        // Real numbers (floating point or decimal): float, double
        // Default Data Types for decimal is Double
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Long value range (" + minDouble + " to " + maxDouble + ")"); // 4.9E-324, 1.7976931348623157E308
        // 4.9E-324 this mean 4.9 x 10 ** -324

        // Suffix 'd' or 'D'
        double double1 = 4.5d; // suffix 'd' or 'D' is optional
        System.out.println(double1);
        double double2 = 10.1;
        System.out.println(double2);

        // Suffix 'f' or 'F'
        float float1 = 1.7f; // suffix 'f' or 'F' is required
        System.out.println(float1);

        // Single character
        char char1 = 'D';
        System.out.println(char1); // D
        char char2 = '\u0044';
        System.out.println(char2); // D
        char char3 = 68;
        System.out.println(char3); // D

        // Boolean value
        boolean boolean1 = true;
        System.out.println(boolean1);

        // String Class
        String string1 = "abc";
        System.out.println(string1);

    }
}
