package me.philcali.shopify.client;

import java.util.ArrayList;
import java.util.List;

public class ShopifyClientConfig {
    private static final int DEFAULT_READ_TIMEOUT = 30;
    private static final int DEFAULT_CONNECT_TIMEOUT = 5;

    private String clientId;
    private String clientSecret;
    private String redirectUrl;
    private List<String> scopes;
    private int connectTimeout = DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = DEFAULT_READ_TIMEOUT;

    public ShopifyClientConfig addScope(String scope) {
        getScopes().add(scope);
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public List<String> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<>();
        }
        return scopes;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public ShopifyClientConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    public ShopifyClientConfig withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    public ShopifyClientConfig withConnectTimeout(int connectTimeout) {
        setConnectTimeout(connectTimeout);
        return this;
    }

    public ShopifyClientConfig withReadTimeout(int readTimeout) {
        setReadTimeout(readTimeout);
        return this;
    }

    public ShopifyClientConfig withRedirectUrl(String redirectUrl) {
        setRedirectUrl(redirectUrl);
        return this;
    }

    public ShopifyClientConfig withScopes(List<String> scopes) {
        setScopes(scopes);
        return this;
    }
}
