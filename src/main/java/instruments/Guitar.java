package instruments;

public class Guitar extends Instrument {
    public Guitar(double buyingPrice, String material, double sellingPrice) {
        super(buyingPrice, material, sellingPrice);
    }

    @Override
    public String play() {
        return "ding ding";
    }
}
