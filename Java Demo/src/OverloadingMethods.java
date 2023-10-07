public class OverloadingMethods {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(100));

        System.out.println("5ft, 9in = " + convertToCentimeters(5, 9) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");

        System.out.println(getDurationString(3601));
        System.out.println(getDurationString(5, 30));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    //    This is also a way to make default Parameter Value
    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters(heightInFeet * 12) + convertToCentimeters(heightInInches);
    }

    public static String getDurationString(int seconds) {
//        if (seconds >= 0) {
//            String hours = seconds / 3600 > 10 ? (seconds / 3600) + "h" : "0" + (seconds / 3600) + "h";
//            int remainFromHours = seconds % 3600;
//            String minutes = remainFromHours / 60 > 10 ? (remainFromHours / 60) + "m" : "0" + (remainFromHours / 60) + "m";
////            String remainedSecond = remainFromHours % 60 > 10 ? (remainFromHours % 60) + "s" : "0" + (remainFromHours % 60) + "s";
//            String remainedSecond = seconds % 60 > 10 ? (seconds % 60) + "s" : "0" + (seconds % 60) + "s";
//            return hours + " " + minutes + " " + remainedSecond;
//        } else {
//            return "Invalid input";
//        }
        if (seconds < 0) {
            return "Invalid input";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
//        if (seconds >= 0 || seconds < 60 || minutes >= 0) {
//            return getDurationString((minutes * 60) + seconds);
//        } else {
//            return "Invalid input";
//        }

        if (seconds < 0 || seconds > 59 || minutes < 0) {
            return "Invalid input";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds+ "s";
    }
}
