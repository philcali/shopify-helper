package me.philcali.shopify.client;

import java.util.List;

public class ShopifyClientConfig {
    private String clientId;
    private String clientSecret;
    private String redirectUrl;
    private List<String> scopes;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}
