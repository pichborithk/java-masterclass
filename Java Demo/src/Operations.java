public class Operations {

    public static void main(String[] args) {

        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt - 1); // 2147483647
        // Because minIt can not go lower than -2147483648 which is the Min Value for Integer so it cycles back to max value of integer


        char char1 = 'D';
        char char2 = '\u0044';
        char char3 = 68;
        System.out.println(char1 + char2 + char3); // 204
        // Because Character Data Types will use decimal code value to operate the '+' operator then print it out
        // Character will behave the same when works with any operator ('+', '-', '*', '/')
        System.out.println("" + char1 + char2 + char3); // DDD


        byte byte1 = -128;
        int int1 = byte1 / 2;
        System.out.println(int1);
        // Result from divide operator byte and integer (2 is integer type) will return integer type,
        // so if we declare variable as other data type we will get the error
        // byte byte2 = -128 / 2; // Error
        // but we can avoid error by use type casting
        short short1 = 100;
        short short2 = (short) (short1 / 2);
        System.out.println(short2);

        double double1 = 10 / 2.0;
        System.out.println(double1); // 5.0
        double double2 = 5f / 2;
        // this not error because the default value always double
        System.out.println(double2); // 2.5
        double double3 = 10f / 3d;
        System.out.println(double3); // 3.3333333333333335

        float float1 = 5f / 2;
        // this also not error
        System.out.println(float1); // 2.5
         float float2 = 10 / 3;
        // // this also not error but the 10 / 3 come out as integer first (3) then convert to float (3.0)
         System.out.println(float2); // 3.0
        // Error case for float and Expression
        // float float3 = 10.0 / 2.0;
        // float float4 = 5.2d / 2.2f;
    }
}
