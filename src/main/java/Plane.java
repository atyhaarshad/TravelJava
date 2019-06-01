import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getType() {
        return (PlaneType) this.planeType;
    }

    // get type

    // get passenger size
}

