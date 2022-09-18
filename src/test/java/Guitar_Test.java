import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Guitar_Test {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender Strat", "Strings","1960's white", "All along the watchtower",
                500.00, 572.00, "Electric", "Maple", "American vintage 65's" );

    }

    @Test
    public void hasGuitarType(){
        assertEquals("Electric", guitar.getGuitarType());
    }

    @Test
    public void hasFretboard(){
        assertEquals("Maple", guitar.getFretboard());
    }

    @Test
    public void hasPickups(){
        assertEquals("American vintage 65's", guitar.getPickups());
    }
}
