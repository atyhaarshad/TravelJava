import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Flight flight2;
    Plane plane = new Plane(PlaneType.HELICOPTER);
    Plane plane2 = new Plane(PlaneType.BOEING787);
    Passenger passenger7;
    Passenger passenger8;

    @Before
    public void setUp(){
        flight = new Flight(plane, "LDN321", "London");
        flight2 = new Flight(plane2, "DXB123", "Dubai");
        passenger7 = new Passenger("Atyha", 5);
        passenger8 = new Passenger("Bob", 0);
        flightManager = new FlightManager(flight);

    }

    @Test // baggage weight for passenger in flight
    public void canGetReservedBaggageWeightForAPassenger(){
        assertEquals(500, flightManager.getBaggageWeight(flight));
        assertEquals(48, flightManager.getBaggageWeight(flight2));
    }

    @Test // find out how much baggage each passenger has assuming one bag = 10kg
    public void canGetActualBaggageWeightOfPassenger(){
        assertEquals(50, flightManager.getPassengersBaggageWeight(passenger7));
        assertEquals(0, flightManager.getPassengersBaggageWeight(passenger8));
    }

    @Test // overall weight reserved for remaining baggage for flight
    public void canGetRemainingBaggageLeftForFlight(){
        assertEquals(0, flightManager.getRemainingBaggageWeight(flight));
    }






}
