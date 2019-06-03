import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Passenger> passengers;


    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }


    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }


    public int getCapacity() {
        return this.planeType.capacity;
    }

    public int getWeight() {
        return this.planeType.weight;
    }
}

