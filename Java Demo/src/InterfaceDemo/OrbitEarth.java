package InterfaceDemo;

import java.util.Date;

public interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

    static void log(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }
}
