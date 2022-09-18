import Stocktaking.Plectrum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Plectrum_Test {

    Plectrum plectrum;

    @Before
    public void setUp() {
        plectrum = new Plectrum("A white pearl plectrum", 3.00, 5.00, "White");
    }

    @Test
    public void getDescription() {
        assertEquals("A white pearl plectrum", plectrum.getStockItemDescription());
    }

    @Test
    public void getPriceBought() {
        assertEquals(3.00, 3.00, plectrum.getPriceBought());
    }

    @Test
    public void getPriceSold() {
        assertEquals(5.00, 5.00, plectrum.getPriceSold());

    }
}

