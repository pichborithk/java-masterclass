package ClassDemo;

// "public" is access modifier class, it means any other class in any package can access this class
// if we put nothing (class Car) is called "package access", means this class is accessible only in
// the same package
public class Car {

//    "public" means any other class in any package can access this
//    "protected" allows classes in the same package, and any subclasses in other packages to have access this
//    when modifier is omitted (int door) meaning this member is accessible only to classes in the same package
//    "private" modifier means no other class can access this member (field or method)
    private int doors = 4;
    private String make = "Tesla";
    private String color = "Red";
    private String model = "Model X";
//    if we do not declare default value, Java will declare default value for field base on the data type
//    For example "false" for boolean, "null" for String, "0" for integer and "0.0" for double
    private boolean convertible;

//    Constructor
    public Car(int doors, String make, String color, String model, boolean convertible) {
        this();
        this.doors =doors;
        this.make = make;
        this.color = color;
        this.model = model;
        this.convertible = convertible;
    }

//    Constructor overloading or Constructor chaining
    public Car() {
        System.out.println("Empty constructor called");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
