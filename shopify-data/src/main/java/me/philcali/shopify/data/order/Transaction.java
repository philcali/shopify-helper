package me.philcali.shopify.data.order;

import java.util.Date;

public class Transaction {
    private String amount;
    private String authorization;
    private Date createdAt;
    private Long deviceId;
    private String gateway;
    private String sourceName;
    private PaymentDetails paymentDetails;
    private Long id;
    private String kind;
    private Long orderId;
    private String errorCode;
    private String status;
    private Boolean test;
    private Long userId;
    private String currency;

    public String getAmount() {
        return amount;
    }

    public String getAuthorization() {
        return authorization;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getGateway() {
        return gateway;
    }

    public Long getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public Long getOrderId() {
        return orderId;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getTest() {
        return test;
    }

    public Long getUserId() {
        return userId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
