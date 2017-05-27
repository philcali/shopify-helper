package me.philcali.shopify.data.order;

import java.util.Date;
import java.util.List;

public class Fulfillment {
    private Date createdAt;
    private Long id;
    private List<LineItem> lineItems;
    private Long orderId;
    private String receipt;
    private String status;
    private String trackingCompany;
    private String trackingNumber;
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getReceipt() {
        return receipt;
    }

    public String getStatus() {
        return status;
    }

    public String getTrackingCompany() {
        return trackingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTrackingCompany(String trackingCompany) {
        this.trackingCompany = trackingCompany;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
