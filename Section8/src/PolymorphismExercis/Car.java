package PolymorphismExercis;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine = true;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
       return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Holden -> startEngine()";
    }

    @Override
    public String brake() {
       return "Holden -> accelerate()";
    }

    @Override
    public String startEngine() {
       return "Holden -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford -> startEngine()";
    }

    @Override
    public String brake() {
        return "Ford -> accelerate()";
    }

    @Override
    public String startEngine() {
        return "Ford -> brake()";
    }
}