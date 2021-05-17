import interfaces.ISell;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<ISell> items = new ArrayList<>();

    public void addItem(ISell item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }
}

