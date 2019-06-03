import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTypeTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    PlaneType planeType;

    @Before

    public void setUp(){
        plane1 = new Plane(planeType.HELICOPTER);
        plane2 = new Plane(planeType.BOEING787);
        plane3 = new Plane(planeType.PRIVATEJET);

    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(5, plane1.getCapacity());

    }

    @Test
    public void getPlaneWeight(){
        assertEquals(5000, plane1.getWeight());
    }



}
