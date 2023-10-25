package AbstractClassesDemo;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    // Final method do not allow subclass to override this method
    public final String getExplicitType() {
        return getClass().getName() + " (" + type + ")";
    }
}
