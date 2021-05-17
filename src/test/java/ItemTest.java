import instruments.Piano;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setUp() {
        item = new Item(50.00, "music book", 100.00);
    }
    @Test
    public void hasBuyingPrice() {
        assertEquals(50.00, item.getBuyingPrice(), 0.01);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(100.00, item.getSellingPrice(), 0.01);
    }
    @Test
    public void canGetMarkup() {
        assertEquals(50.00, item.calculateMarkup(), 0.1);

    }
}
