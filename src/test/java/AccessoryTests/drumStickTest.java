package AccessoryTests;

import Accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class drumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp(){
       drumStick = new DrumStick("Vic Firth", 8, 6);
    }

    @Test
    public void hasType() {
        assertEquals("Vic Firth", drumStick.getType());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(8, drumStick.getSalePrice());
    }

    @Test
    public void hasShopPurchasePrice() {
        assertEquals(6, drumStick.getShopPurchasePrice());
    }

    @Test
    public void canMarkUp(){
        assertEquals(9, drumStick.markUp());
    }

}
