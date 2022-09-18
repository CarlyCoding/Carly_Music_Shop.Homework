import Instruments.Clarinet;
import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Clarinet_Test {

    Clarinet clarinet;

    @Before
    public void setUp(){
        clarinet = new Clarinet("Yamaha","Woodwind","Black","Fur Elise",500.00,
        550.00,"Bass");
    }

    @Test
    public void hasBassType(){
        assertEquals("Bass", clarinet.getBassType());
    }

}
