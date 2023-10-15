package PlayingCat;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
//        boolean result = false;
//        if (summer) {
//            if (temperature <= 45 && temperature >= 25) {
//                result = true;
//            }
//        } else if (temperature <= 35 && temperature >= 25) {
//            result = true;
//        }
//
//        return result;

        if (summer) {
            return temperature <= 45 && temperature >= 25;
        }

        return temperature <= 35 && temperature >= 25;
    }
}
