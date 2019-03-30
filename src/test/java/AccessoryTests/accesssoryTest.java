package AccessoryTests;

import Accessories.Accessory;
import enums.accessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class accesssoryTest {

    Accessory accessory;

    @Before
    public void setUp(){
       accessory = new Accessory(accessoryType.DRUM_STICKS, 8, 6);
    }

    @Test
    public void hasType() {
        assertEquals(accessoryType.DRUM_STICKS, accessory.getType());
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
