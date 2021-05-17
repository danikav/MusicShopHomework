import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drum drum;

    @Before
    public void setUp(){
        drum = new Drum(100.00, "plastic", 150.00);
    }
    @Test
    public void canPlay() {
        assertEquals("ba dum dum", drum.play());
    }
}
