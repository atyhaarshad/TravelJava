import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    PlaneType planeType;
    Plane plane = new Plane(PlaneType.HELICOPTER);

    @Before

    public void setUp() {
        flight = new Flight(plane,"GLA123", "Glasgow");
        passenger1 = new Passenger("Atyha", 2);
        passenger2 = new Passenger("Ching", 1);
        passenger3 = new Passenger("Tom", 1);
        passenger4 = new Passenger("Bob", 1);
        passenger5 = new Passenger("Pri", 1);
        plane = new Plane(PlaneType.HELICOPTER);
    }

    @Test
    public void passengerCountStartsEmpty(){
        assertEquals(0, flight.getPlane().getPassengers().size());
    }


    @Test // add a passenger to a flight
    public void canAddPassengersToFlight(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPlane().getPassengers().size());
    }

    @Test //can get plane type
    public void getPlaneType(){
        assertEquals(planeType.HELICOPTER, flight.getPlane().getPlaneType());
    }


    @Test // can get no of seats
    public void getNoOfAvailableSeats(){
        assertEquals(5, flight.getNoOfAvailableSeats());
    }

    @Test // can book a passenger in if enough seats
     public void canBookPassengerIfSeats() {
        flight.bookPassenger(passenger1);
        assertEquals(4, flight.getNoOfAvailableSeats());
    }

    @Test // testing cant book passenger because flight full
    public void cantBookPassenger(){ // should return false
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(false, flight.bookPassenger(passenger1));
    }


}
