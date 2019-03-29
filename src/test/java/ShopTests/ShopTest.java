package ShopTests;

import Accessories.DrumStick;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumStick drumStick;

    @Before
    public void setUp() {
        shop = new Shop("Ray's Music Exchange", 0);
        drumStick = new DrumStick("Vic Firth", 10, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddDrumStick(){
        shop.add(drumStick);
        assertEquals(drumStick, shop.getDrumStick());
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, shop.getStockCount());
    }

}

