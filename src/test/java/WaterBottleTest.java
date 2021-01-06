import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canTakeDrink(){
        assertEquals(90, waterBottle.takeDrink());
    }
    @Test
    public void canTakeAnotherDrink(){
        assertEquals(80, waterBottle.takeDrink());
    }
    @Test
    public void canEmptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }

    /*
    - Create a water bottle class with a volume property.
    - The volume should start at 100.
    - Add a drink function that takes 10 from the volume each time it is called.
    - Create an empty function that brings the volume down to 0.
    - Create a fill function that fills the volume back to 100.
    */
}
