package GenericChallenge;

import java.util.Arrays;

public abstract class Line implements Mappable{

    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
//            this.locations[index] = Mappable.stringToLatLon(l);
//            index++;
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.printf("Render %s this as LINE (%s) %n", this, locations());
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }


}
