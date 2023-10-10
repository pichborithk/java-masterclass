import java.sql.SQLOutput;

public class ControlFlow {

    public static void main(String[] args) {
        switchDemo(5);
    }

    public static void switchDemo(int x) {
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("2");
                break;
            default:
                System.out.println("Default");
                break;
        }
//        Can not you long, float, double, boolean or their wrappers
    }

    public static void enhancedSwitchDemo(int x) {
        switch (x) {
            case 1 -> System.out.println("1");
            case 2, 3, 4 -> System.out.println("2");
            default -> System.out.println("Default");
        }
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                System.out.println("Do something");
                yield "Bad";
//                If we want to do something before return any value instead of use "return" keyword
//                we use yield
            }
        };
    }
}
