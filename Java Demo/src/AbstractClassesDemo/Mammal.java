package AbstractClassesDemo;

public abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " walks");
        } else {
            System.out.println(getExplicitType() + " runs");
        }
    }

    public abstract void shedHair();
}
