import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano(200.00, "wood", 400.00);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200.00, piano.getBuyingPrice(), 0.01);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(400.00, piano.getSellingPrice(), 0.01);


    }

    @Test
    public void canPlay() {
        assertEquals("lalala", piano.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200.00, piano.calculateMarkup(), 0.1);

    }
}
