public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }

        for (int i = x; i > 0; i /= 10) {
            int lastDigit = i % 10;
            for (int j = y; j > 0; j /= 10) {
                if (j % 10 == lastDigit) {
                    return true;
                }
            }
        }

        return false;
    }
}
