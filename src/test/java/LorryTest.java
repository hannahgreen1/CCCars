import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LorryTest {

    Lorry lorry;

    @Before
    public void before() {
        lorry = new Lorry("Scania", "4Series", 12, 50000.00, "White", "BIG", TireType.ALLTERRAINE, 2, 18);
    }

    @Test
    public void getNumberOfDoors(){
        assertEquals(2, lorry.getNumberOfDoors());
    }

    @Test
    public void getLoad(){
        assertEquals(18, lorry.getLoad());
    }

}