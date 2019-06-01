import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;


    public Flight() {
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


    // getters for flightNo, destination, plane,

    // need to be able to add passenger, get passenger count
}
