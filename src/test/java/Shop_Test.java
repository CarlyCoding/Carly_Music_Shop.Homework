import Instruments.Drums;
import Instruments.Fiddle;
import Stocktaking.Plectrum;
import Stocktaking.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Shop_Test {

    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("Carly's Music Shop",5500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Carly's Music Shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(5500.00, 5500.00, shop.getTill());
    }

    @Test
    public void canAddToStock(){
        Plectrum plectrum = new Plectrum("White plectrum",3.00,6.00, "White");
        shop.addToStock(plectrum);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        Plectrum plectrum = new Plectrum("White plectrum",3.00,6.00, "White");
        shop.removeFromStock(plectrum);
        assertEquals(0,shop.getStockCount());
    }




}
