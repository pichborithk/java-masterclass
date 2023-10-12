public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        while (goal != 0) {
            if (goal - 5 >= 0 && bigCount > 0) {
                goal -= 5;
                bigCount--;
            } else if (goal - 1 >= 0 && smallCount > 0){
                goal--;
                smallCount--;
            } else {
                break;
            }
        }

        return goal == 0;
    }
}
