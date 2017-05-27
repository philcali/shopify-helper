package me.philcali.shopify.data.customer;

import java.util.Date;
import java.util.List;

import me.philcali.shopify.data.Address;
import me.philcali.shopify.data.Metafield;

public class Customer {
    private Boolean acceptsMarketing;
    private List<Address> addresses;
    private Date createdAt;
    private Address defaultAddress;
    private String email;
    private String phone;
    private String firstName;
    private Long id;
    private List<Metafield> metafield;
    private String lastName;
    private Long lastOrderId;
    private String lastOrderName;
    private String note;
    private Long ordersCount;
    private String state;
    private String tags;
    private Boolean taxExempt;
    private String totalSpent;
    private Date updatedAt;
    private Boolean verifiedEmail;

    public Boolean getAcceptsMarketing() {
        return acceptsMarketing;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Address getDefaultAddress() {
        return defaultAddress;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getLastOrderId() {
        return lastOrderId;
    }

    public String getLastOrderName() {
        return lastOrderName;
    }

    public List<Metafield> getMetafield() {
        return metafield;
    }

    public String getNote() {
        return note;
    }

    public Long getOrdersCount() {
        return ordersCount;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getTags() {
        return tags;
    }

    public Boolean getTaxExempt() {
        return taxExempt;
    }

    public String getTotalSpent() {
        return totalSpent;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    public void setAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setDefaultAddress(Address defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLastOrderId(Long lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public void setMetafield(List<Metafield> metafield) {
        this.metafield = metafield;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

}
