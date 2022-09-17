import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Piano_Test {
    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Kemble","Chordophone","Walnut","Middle C",400.00,550.00, "Upright");
    }

    @Test
    public void hasBrand(){
        assertEquals("Kemble", piano.getBrand());
    }

    @Test
    public void hasFamily(){
        assertEquals("Chordophone", piano.getFamily());
    }

    @Test
    public void hasColour(){
        assertEquals("Walnut", piano.getColour());
    }

    @Test
    public void hasSound(){
        assertEquals("Middle C", piano.playInstrument());
    }


    @Test
    public void hasPriceBought(){
        assertEquals(400.00, 400.00, piano.getPriceBought());
    }

    @Test
    public void hasSalePrice(){
        assertEquals(550.00,550.00, piano.getPriceToBeSold());
    }

}
