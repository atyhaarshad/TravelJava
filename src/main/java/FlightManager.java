import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int getBaggageWeight(Flight flight) {
        int weight = flight.getPlane().getPlaneType().weight / 2;
        return weight / flight.getPlane().getPlaneType().capacity;
    }

    public int getPassengersBaggageWeight(Passenger passenger) {
        return passenger.getNoOfBags() * 10;
        // get passengers noOfbags and times by 10 (assuming one bag is 10kg)
    }

    public int getRemainingBaggageWeight(Flight flight) {
        ArrayList remainingBaggage = flight.getPlane().getPassengers();
        remainingBaggage.forEach();

    }
}
