package InstrumentTests;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class guitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Electric", 250, 180);
    }

    @Test
    public void hasType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(250, guitar.getSalePrice());
    }

    @Test
    public void hasShopPurchasePrice() {
        assertEquals(180, guitar.getShopPurchasePrice());
    }

    @Test
    public void canPlay(){
        assertEquals("dingly ding ding", guitar.play());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canMarkUp(){
        assertEquals(270, guitar.markUp());
    }
}
