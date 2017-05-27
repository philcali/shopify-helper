package me.philcali.shopify.data.order;

public class Discount {
    private String amount;
    private String code;
    private String type;

    public String getAmount() {
        return amount;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }
}
