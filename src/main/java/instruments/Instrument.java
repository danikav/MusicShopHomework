package instruments;
import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private double buyingPrice;
    private String material;
    private double sellingPrice;


    public Instrument(double buyingPrice, String material, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;

    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    @Override
    public double calculateMarkup(){
        return sellingPrice - buyingPrice;
    }
}
