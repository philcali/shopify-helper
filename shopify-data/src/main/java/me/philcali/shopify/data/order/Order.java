package me.philcali.shopify.data.order;

import java.util.Date;
import java.util.List;

import me.philcali.shopify.data.Address;
import me.philcali.shopify.data.Metafield;
import me.philcali.shopify.data.customer.Customer;

public class Order {
    private List<Address> billingAddress;
    private String browserIp;
    private Boolean buyerAcceptsMerketing;
    private String cancelReason;
    private Date cancelledAt;
    private String cartToken;
    private List<ClientDetails> clientDetails;
    private Date closedAt;
    private Date createdAt;
    private String currency;
    private Customer customer;
    private List<Discount> discounts;
    private String email;
    private String financialStatus;
    private List<Fulfillment> fulfillments;
    private String fulfillmentStatus;
    private String tags;
    private String gateway;
    private Long id;
    private String landingSite;
    private List<LineItem> lineItems;
    private Long locationId;
    private List<Metafield> metafields;
    private String name;
    private String note;
    private List<Property> noteAttributes;
    private Long number;
    private Long orderNumber;
    private PaymentDetails paymentDetails;
    private List<String> paymentGatewayNames;
    private Date processedAt;
    private String processingMethod;
    private String referringSite;
    private List<Refund> refunds;
    private List<Address> shippingAddress;
    private List<ShippingLine> shippingLines;
    private String sourceName;
    private String subtotalPrice;
    private List<TaxLine> taxLines;
    private Boolean taxesIncluded;
    private String token;
    private String totalDiscounts;
    private String totalLineItemsPrice;
    private String totalPrice;
    private String totalTax;
    private Long totalWeight;
    private Date updatedAt;
    private Long userId;
    private String orderStatusUrl;

    public List<Address> getBillingAddress() {
        return billingAddress;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public Boolean getBuyerAcceptsMerketing() {
        return buyerAcceptsMerketing;
    }

    public Date getCancelledAt() {
        return cancelledAt;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public String getCartToken() {
        return cartToken;
    }

    public List<ClientDetails> getClientDetails() {
        return clientDetails;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public String getEmail() {
        return email;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public List<Fulfillment> getFulfillments() {
        return fulfillments;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public String getGateway() {
        return gateway;
    }

    public Long getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public Long getLocationId() {
        return locationId;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public List<Property> getNoteAttributes() {
        return noteAttributes;
    }

    public Long getNumber() {
        return number;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public List<Refund> getRefunds() {
        return refunds;
    }

    public List<Address> getShippingAddress() {
        return shippingAddress;
    }

    public List<ShippingLine> getShippingLines() {
        return shippingLines;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    public String getTags() {
        return tags;
    }

    public Boolean getTaxesIncluded() {
        return taxesIncluded;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public String getToken() {
        return token;
    }

    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public Long getTotalWeight() {
        return totalWeight;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setBillingAddress(List<Address> billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public void setBuyerAcceptsMerketing(Boolean buyerAcceptsMerketing) {
        this.buyerAcceptsMerketing = buyerAcceptsMerketing;
    }

    public void setCancelledAt(Date cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public void setClientDetails(List<ClientDetails> clientDetails) {
        this.clientDetails = clientDetails;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public void setFulfillments(List<Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setNoteAttributes(List<Property> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite;
    }

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    public void setShippingAddress(List<Address> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingLines(List<ShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public void setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Metafield> getMetafields() {
        return metafields;
    }

    public void setMetafields(List<Metafield> metafields) {
        this.metafields = metafields;
    }

}
