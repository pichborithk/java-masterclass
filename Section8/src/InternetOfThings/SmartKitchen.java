package InternetOfThings;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
        System.out.println("Adding water...");
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
        System.out.println("Pouring milk...");
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
        System.out.println("Load dishwasher...");
    }

    public void setKitchenState(boolean coffeeMakerState, boolean refrigeratorState, boolean dishWasherState) {
        brewMaster.setHasWorkToDo(coffeeMakerState);
        iceBox.setHasWorkToDo(refrigeratorState);
        dishWasher.setHasWorkToDo(dishWasherState);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class Refrigerator {

    private boolean hasWorkToDo;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering foot");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing dishes...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Making coffee...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}