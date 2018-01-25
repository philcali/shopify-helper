package me.philcali.shopify.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import me.philcali.oauth.api.model.IClientConfig;
import me.philcali.shopify.client.IHasher;
import me.philcali.shopify.client.IShopifyIntegration;
import me.philcali.shopify.client.IShopifyService;
import me.philcali.shopify.client.IShopifyServiceProvider;

public class ShopifyIntegrationImpl implements IShopifyIntegration {
    private final IClientConfig config;
    private final IShopifyServiceProvider provider;

    public ShopifyIntegrationImpl(final IClientConfig config) {
        this(config, new ShopifyServiceProviderImpl(config));
    }

    public ShopifyIntegrationImpl(final IClientConfig config, IShopifyServiceProvider provider) {
        this.config = config;
        this.provider = provider;
    }

    @Override
    public <T> T convert(InputStream input, Class<T> clazz) throws IOException {
        return provider.convert(input, clazz);
    }

    @Override
    public ShopifyAuthManager createAuth(String shop) {
        return new ShopifyAuthManager(shop, config, provider);
    }

    @Override
    public IHasher createHasher() {
        return new HmacHasher(config.getClientSecret());
    }

    @Override
    public IShopifyService getService(String shop, Optional<String> accessToken) {
        return provider.getService(shop, accessToken);
    }
}
