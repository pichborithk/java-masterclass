package InterfaceDemo;

public interface FlightEnabled {

    //    public static final double  MILES_TO_KM = 1.60934;
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    //    This three declasations result in the same thing
    public abstract void takeOff();

    abstract void land();

    void fly(); // PREFERRED declaration

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transitions no implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from "+ stage + " to " + nextStage);
        return nextStage;
    }
}
