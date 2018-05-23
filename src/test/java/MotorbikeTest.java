import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike;

    @Before
    public void before() {
        motorbike = new Motorbike("Ducati", "Shark", 2, 500.00, "Black", "FAST", TireType.WINTER);
    }

    @Test
    public void hasMake(){
        assertEquals("Ducati", motorbike.getMake());
    }
}

