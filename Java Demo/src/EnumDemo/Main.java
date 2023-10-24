package EnumDemo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfWeek weekDay = DayOfWeek.TUE;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d %n", weekDay.name(), weekDay.ordinal());

        for (var topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static DayOfWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[randomInteger];
    }
}
