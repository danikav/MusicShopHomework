package instruments;

public class Drum extends Instrument {
    public Drum(double buyingPrice, String material, double sellingPrice) {
        super(buyingPrice, material, sellingPrice);
    }

    @Override
    public String play() {
        return "ba dum dum";
    }

}
