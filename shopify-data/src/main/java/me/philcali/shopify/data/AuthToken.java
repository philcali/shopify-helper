package me.philcali.shopify.data;

import me.philcali.oauth.api.model.IToken;

public class AuthToken implements IToken {
    private static final String APPLICATION = "SHOPIFY";
    private static final String TOKEN_TYPE = "request";
    private String accessToken;
    private String scope;

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public String getApi() {
        return APPLICATION;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public String getTokenType() {
        return TOKEN_TYPE;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
