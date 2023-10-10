public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1690));
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0 && year >= 1 && year <= 9999) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = true;
                }
            } else {
                result = true;
            }
        }

        return result;
    }
}
