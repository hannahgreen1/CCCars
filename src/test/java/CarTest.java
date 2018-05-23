import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Volkswagen", "Golf", 4, 500.00, "Red", "VR6", TireType.SUMMER, 5);
    }

    @Test
    public void hasMake(){
        assertEquals("Volkswagen", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Golf", car.getModel());
    }

    @Test
    public void getNumberOfWheels(){
        assertEquals(4, car.getNumberOfWheels());
    }

    @Test
    public void hasPrice(){
        assertEquals(500.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals("VR6", car.getEngine());
    }

    @Test
    public void hasNumberOfDoors(){
        assertEquals(5, car.getNumberOfDoors());
    }

    @Test
    public void getTireType(){
        assertEquals(TireType.SUMMER, car.getTireType());
    }

    @Test
    public void getCarEngineNoise(){
        assertEquals("VRRRMmmm", car.noise("VRRRMmmm"));
    }

}
