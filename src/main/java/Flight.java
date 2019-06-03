import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNo;
    private String destination;

    public Flight(Plane plane, String flightNo, String destination) {
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean bookPassenger(Passenger passenger) {

        if (this.getPlane().getPassengers().size() < this.getPlane().getPlaneType().capacity) {
            this.getPlane().getPassengers().add(passenger);
            return true;
        } else {

            return false;
        }
    }

    public int getNoOfAvailableSeats() {

        return this.getPlane().getPlaneType().capacity - this.getPlane().getPassengers().size();
    }


}
