package me.philcali.shopify.client.impl;

import java.io.IOException;
import java.util.StringJoiner;

import me.philcali.oauth.api.IAuthManager;
import me.philcali.oauth.api.exception.AuthException;
import me.philcali.oauth.api.model.IClientConfig;
import me.philcali.oauth.api.model.IToken;
import me.philcali.shopify.client.IShopifyServiceProvider;
import me.philcali.shopify.data.AuthToken;
import me.philcali.shopify.data.shop.Shop;
import okhttp3.HttpUrl;

public class ShopifyAuthManager implements IAuthManager {
    private final String shop;
    private final IClientConfig config;
    private final IShopifyServiceProvider provider;

    public ShopifyAuthManager(final String shop, final IClientConfig config, final IShopifyServiceProvider provider) {
        this.shop = shop;
        this.config = config;
        this.provider = provider;
    }

    @Override
    public AuthToken exchange(String code) throws AuthException {
        try {
            return provider.getService(shop)
                    .authenticate(config.getClientId(), config.getClientSecret(), code)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new AuthException(e);
        }
    }

    @Override
    public String getAuthUrl(String... state) {
        StringJoiner scopes = new StringJoiner(",");
        config.getScopes().forEach(scopes::add);
        HttpUrl url = new HttpUrl.Builder()
                .host(shop)
                .scheme("https")
                .addPathSegment("/admin/oauth/authorize")
                .addEncodedQueryParameter("client_id", config.getClientId())
                .addEncodedQueryParameter("scope", scopes.toString())
                .addEncodedQueryParameter("redirect_url", config.getRedirectUrl())
                .addEncodedQueryParameter("state", generateState(state))
                .build();
        return url.toString();
    }

    @Override
    public Shop me(IToken token) throws AuthException {
        try {
            return provider.getService(shop, token.getAccessToken())
                    .getShop().execute().body();
        } catch (IOException e) {
            throw new AuthException(e);
        }
    }
}
