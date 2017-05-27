package me.philcali.shopify.data.customer;

public class CustomerContainer {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerContainer withCustomer(Customer customer) {
        setCustomer(customer);
        return this;
    }
}
