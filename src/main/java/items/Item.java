package items;

import interfaces.ISell;

public class Item implements ISell {
    private double  buyingPrice;
    private String description;
    private double sellingPrice;

    public Item(double buyingPrice, String description, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.description = description;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

