package me.philcali.shopify.data.order;

import java.util.Date;
import java.util.List;

public class Refund {
    private Date createdAt;
    private Date processedAt;
    private Long id;
    private String note;
    private List<RefundItem> refundLineItems;
    private Boolean restock;
    private List<Transaction> transactions;
    private Long userId;

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    public List<RefundItem> getRefundLineItems() {
        return refundLineItems;
    }

    public Boolean getRestock() {
        return restock;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Long getUserId() {
        return userId;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
    }

    public void setRefundLineItems(List<RefundItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
    }

    public void setRestock(Boolean restock) {
        this.restock = restock;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
