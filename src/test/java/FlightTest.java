import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    PlaneType plane;

    @Before

    public void setUp() {
        flight = new Flight();
        passenger1 = new Passenger("Atyha", 2);
        passenger2 = new Passenger("Test", 1);

    }

    @Test
    public void passengerCountStartsEmpty(){
        assertEquals(0, flight.getPassengerCount());
    }


    @Test
    public void canAddPassengersToFlight(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }
}
