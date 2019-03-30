package ShopTests;

import Accessories.Accessory;
import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Accessory accessory;
    Guitar guitar;

    @Before
    public void setUp() {
        shop = new Shop("Ray's Music Exchange", 0);
        accessory = new Accessory("Drum Sticks", 10, 8);
        guitar = new Guitar("ESP", 250, 175);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddAccessory(){
        shop.addAccessory(accessory);
        assertEquals(accessory, shop.getAccessory());
    }

    @Test
    public void canRemoveAccessory(){
        assertEquals(null, shop.removeAccessory());
    }

    @Test
    public void canAddGuitar(){
        shop.addGuitar(guitar);
        assertEquals(guitar, shop.getGuitar());
    }

    @Test
    public void canRemoveGuitar(){
        assertEquals(null, shop.removeGuitar());
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void getMarkUp(){
        assertEquals(9, shop.markUp());
    }

    @Test
    public void getProfit(){
        assertEquals(3, shop.calculateProfit());
    }

}

