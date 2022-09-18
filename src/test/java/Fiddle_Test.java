import Instruments.Fiddle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fiddle_Test {

    Fiddle fiddle;

    @Before
    public void setUp() {
        fiddle = new Fiddle("Stentor", "Strings", "Classic", "Sreeech",
                100.00, 140.00, "Student", "Walnut", "Harlequin");

    }

    @Test
    public void hasOutfit() {
        assertEquals("Student", fiddle.getFiddleOutfit());
    }

    @Test
    public void hasFiddleWood(){
        assertEquals("Walnut",fiddle.getFiddleWood());
    }

    @Test
    public void hasFiddleType(){
        assertEquals("Harlequin", fiddle.getFiddleType());
    }


}
