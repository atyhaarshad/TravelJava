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
        int allBaggage = 0;
        ArrayList<Passenger> remainingBaggage = flight.getPlane().getPassengers();
        for (Passenger passenger : remainingBaggage){
            allBaggage += getPassengersBaggageWeight(passenger);
        }
        int flightBaggageWeight = flight.getPlane().getPlaneType().weight / 2;
        return flightBaggageWeight - allBaggage;

    }
}
