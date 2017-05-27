package me.philcali.shopify.data.order;

public class TaxLine {
    private String price;
    private String rate;
    private String title;

    public String getPrice() {
        return price;
    }

    public String getRate() {
        return rate;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
