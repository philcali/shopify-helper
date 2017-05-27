package me.philcali.shopify.data.order;

import java.util.List;

public class ShippingLine {
    private String code;
    private String price;
    private String source;
    private String title;
    private List<TaxLine> taxLines;
    private String carrierIdentifier;
    private String requestedFulfillmentServiceId;

    public String getCarrierIdentifier() {
        return carrierIdentifier;
    }

    public String getCode() {
        return code;
    }

    public String getPrice() {
        return price;
    }

    public String getRequestedFulfillmentServiceId() {
        return requestedFulfillmentServiceId;
    }

    public String getSource() {
        return source;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public String getTitle() {
        return title;
    }

    public void setCarrierIdentifier(String carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRequestedFulfillmentServiceId(String requestedFulfillmentServiceId) {
        this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
