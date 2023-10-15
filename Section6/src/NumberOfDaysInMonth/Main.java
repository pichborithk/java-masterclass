package NumberOfDaysInMonth;

public class Main {

    public static void main(String[] args) {

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

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        boolean isLeap = isLeapYear(year);
        if (month == 2 && isLeap) {
            return 29;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            default -> 30;
        };
    }
}
