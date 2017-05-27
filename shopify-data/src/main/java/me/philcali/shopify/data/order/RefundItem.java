package me.philcali.shopify.data.order;

public class RefundItem {
    private Long id;
    private LineItem lineItem;
    private Long lineItemId;
    private Long quantity;

    public Long getId() {
        return id;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public Long getLineItemId() {
        return lineItemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
