import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before

    public void setUp(){
        plane = new Plane(PlaneType.HELICOPTER);

    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.HELICOPTER, plane.getPlaneType());
    }
    // has type

//    @Test
    // stars with no passengers
}
