public class DataTypes {

    public static void main(String[] args) {
        System.out.println("Hello World");

        byte firstByte = 127; // MAX VALUE
        byte secondByte = -128;

        short firstShort = 32767, secondShort = -32768;

        int firstInteger = 2_147_483_647; //MAX VALUE
        int secondInteger = Integer.MIN_VALUE; //-2147483648

        System.out.println(secondInteger - 1); //2147483647 Because it cycles back to max value of integer

        //int myMaxIntValue = 2147483648; // Error: integer number too large
        int myMaxIntValue = 2147483647;
        int notUseComma = 1_663_092;


        long firstLong = 9223372036854775807L;
        long secondLong = -9223372036854775808L;
        // if you define Long variable with value that smaller or equal than Max Value of Integer without add suffix 'l' or 'L',
        // later when you change the to greater than Max Value of Integer we will get the error 'integer number too large'
        byte afterDivided0 = -128 / 2;
        int afterDivided1 = firstByte / 2; // the result from divide operator byte and integer (the integer is number 2) will return integer type,
        // so if we declare variable as other data type we will get the error
        // but we can avoid error by use type casting
        short afterDivided2 = (short) (firstShort / 2);
        // Double is default data type for decimal (real) numbers
        double firstDouble = Double.MIN_VALUE; // 4.9E-324 this mean 4.9 x 10 ** 324
        double secondDouble = 4.5d; // suffix 'd' or 'D' is optional
        float firstFloat = 1.7f; // suffix 'f' or 'F' is required
        double thirdDouble = 5f / 2; // this not error because the default value always double
        double fourthDouble = 5f / 2d;
        float secondFloat = 5f / 2; // this also not error
        float thirdFloat = 5f / 2f;

        char firstChar = 'D';
        char secondChar = '\u0044';
        char thirdChar = 68;

        String firstString = "abc";

        boolean firstBoolean = true;
    }
}
