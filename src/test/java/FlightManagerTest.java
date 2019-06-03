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
    Passenger passenger9;
    Passenger passenger10;

    @Before
    public void setUp(){
        flight = new Flight(plane, "LDN321", "London");
        flight2 = new Flight(plane2, "DXB123", "Dubai");
        passenger7 = new Passenger("Atyha", 5);
        passenger8 = new Passenger("Bob", 0);
        flightManager = new FlightManager(flight);
        passenger9 = new Passenger("test", 3);
        passenger10 = new Passenger("test2", 2);

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
        flight.bookPassenger(passenger7); // 50kg
        flight.bookPassenger(passenger9); //30kg
        flight.bookPassenger(passenger10); //20kg
        // total baggage of passengers = 100kg
        // baggage capacity for HELI is 2500kg, 2500 - 100 = 2400[assertion]
        assertEquals(2400, flightManager.getRemainingBaggageWeight(flight));
    }






}
