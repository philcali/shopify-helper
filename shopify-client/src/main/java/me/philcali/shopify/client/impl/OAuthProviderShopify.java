package me.philcali.shopify.client.impl;

import me.philcali.oauth.api.IAuthManager;
import me.philcali.oauth.api.model.IClientConfig;
import me.philcali.oauth.spi.AbstractOAuthProvider;

public class OAuthProviderShopify extends AbstractOAuthProvider {
    private static final String TYPE = "shopify";

    @Override
    public String getApiType() {
        return TYPE;
    }

    @Override
    protected IAuthManager lazilyCreate(final IClientConfig config, final String ... params) {
        return new ShopifyIntegrationImpl(config).createAuth(params[0]);
    }
}
