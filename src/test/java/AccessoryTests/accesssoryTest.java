package AccessoryTests;

import Accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class accesssoryTest {

    Accessory accessory;

    @Before
    public void setUp(){
       accessory = new Accessory("Drum Sticks", 8, 6);
    }

    @Test
    public void hasType() {
        assertEquals("Drum Sticks", accessory.getType());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(8, accessory.getSalePrice());
    }

    @Test
    public void hasShopPurchasePrice() {
        assertEquals(6, accessory.getShopPurchasePrice());
    }

    @Test
    public void canMarkUp(){
        assertEquals(9, accessory.markUp());
    }

}
