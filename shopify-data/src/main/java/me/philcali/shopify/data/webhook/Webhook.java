package me.philcali.shopify.data.webhook;

import java.util.Date;
import java.util.List;

public class Webhook {
    private String address;
    private Date createdAt;
    private List<String> fields;
    private Long id;
    private List<String> metafieldNamespaces;
    private String topic;
    private Date updatedAt;

    public String getAddress() {
        return address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<String> getFields() {
        return fields;
    }

    public Long getId() {
        return id;
    }

    public List<String> getMetafieldNamespaces() {
        return metafieldNamespaces;
    }

    public String getTopic() {
        return topic;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
        this.metafieldNamespaces = metafieldNamespaces;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
