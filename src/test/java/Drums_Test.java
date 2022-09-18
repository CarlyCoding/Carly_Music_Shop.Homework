import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Drums_Test {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Zildjian","Percussion", "Black", "Black Dog by Led Zepplin",
                800.00,950.00,"Full kit", "Regular");
    }

    @Test
    public void hasDrumType(){
        assertEquals("Full kit", drums.getDrumType());
    }

    @Test
    public void hasDrumSize(){
        assertEquals("Regular", drums.getDrumSize());
    }

}
