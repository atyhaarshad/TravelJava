import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before

    public void setUp(){
        plane = new Plane(PlaneType.HELICOPTER);

    }

}
