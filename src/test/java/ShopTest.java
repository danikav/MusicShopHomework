import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ShopTest {
    Shop shop;
    Item item;

    @Before
    public void setUp() {
        shop = new Shop();
        item = new Item(50.00, "music book", 100.00);
    }

    @Test
    public void canAddItem() {
        shop.addItem(item);
        assertNotNull(shop);

    }


}
