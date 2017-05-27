package me.philcali.shopify.data;

import java.util.Date;

public class Metafield {
    private String key;
    private String namespace;
    private String value;
    private String valueType;
    private Date createdAt;
    private String description;
    private Long id;
    private Long ownerId;
    private String ownerResource;
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getNamespace() {
        return namespace;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getOwnerResource() {
        return ownerResource;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getValue() {
        return value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setOwnerResource(String ownerResource) {
        this.ownerResource = ownerResource;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

}
