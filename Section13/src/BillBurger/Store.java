package BillBurger;

public class Store {

    public static void main(String[] args) {

        var regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Ball");
        System.out.println(regularMeal);

        var USregularMeal = new Meal(0.68);
        System.out.println(USregularMeal);
    }
}
