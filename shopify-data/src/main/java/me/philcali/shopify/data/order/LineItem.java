package me.philcali.shopify.data.order;

import java.util.List;

public class LineItem {
    private Long fulfillableQuantity;
    private String fulfillmentService;
    private String fulfillmentStatus;
    private Long grams;
    private Long id;
    private String price;
    private Long productId;
    private Long quantity;
    private Boolean requiresShipping;
    private String sku;
    private String title;
    private Long variantId;
    private String variantTitle;
    private String vendor;
    private String name;
    private Boolean giftCard;
    private List<Property> properties;
    private Boolean taxable;
    private List<TaxLine> taxLines;
    private String totalDiscount;

    public Long getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public Boolean getGiftCard() {
        return giftCard;
    }

    public Long getGrams() {
        return grams;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public String getTitle() {
        return title;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public Long getVariantId() {
        return variantId;
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public String getVendor() {
        return vendor;
    }

    public void setFulfillableQuantity(Long fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public void setGrams(Long grams) {
        this.grams = grams;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
