package me.philcali.shopify.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;

import me.philcali.shopify.client.IHasher;
import me.philcali.shopify.client.IShopifyIntegration;
import me.philcali.shopify.client.IShopifyService;
import me.philcali.shopify.client.IShopifyServiceProvider;
import me.philcali.shopify.client.ShopifyClientConfig;
import me.philcali.shopify.client.exception.ShopifyServiceException;
import me.philcali.shopify.data.AuthToken;
import okhttp3.HttpUrl;

public class ShopifyIntegrationImpl implements IShopifyIntegration {
    private final ShopifyClientConfig config;
    private final IShopifyServiceProvider provider;

    public ShopifyIntegrationImpl(ShopifyClientConfig config) {
        this(config, new ShopifyServiceProviderImpl());
    }

    public ShopifyIntegrationImpl(ShopifyClientConfig config, IShopifyServiceProvider provider) {
        this.config = config;
        this.provider = provider;
    }

    @Override
    public <T> T convert(InputStream input, Class<T> clazz) throws IOException {
        return provider.convert(input, clazz);
    }

    @Override
    public IHasher createHasher() {
        return new HmacHasher(config.getClientSecret());
    }

    @Override
    public String getAuthUrl(String shop, String ... states) {
        StringJoiner scopes = new StringJoiner(",");
        config.getScopes().forEach(scopes::add);
        StringJoiner state = new StringJoiner(":");
        Arrays.stream(states).forEach(state::add);
        HttpUrl url = new HttpUrl.Builder()
                .host(shop)
                .scheme("https")
                .addPathSegment("/admin/oauth/authorize")
                .addEncodedQueryParameter("client_id", config.getClientId())
                .addEncodedQueryParameter("scope", urlEncode(scopes.toString()))
                .addEncodedQueryParameter("redirect_url", urlEncode(config.getRedirectUrl()))
                .addEncodedQueryParameter("state", urlEncode(state.toString()))
                .build();
        return url.toString();
    }

    @Override
    public IShopifyService getService(String shop, Optional<String> accessToken) {
        return provider.getService(shop, accessToken);
    }

    @Override
    public AuthToken login(String shop, String code) {
        try {
            return getService(shop).authenticate(
                    config.getClientId(),
                    config.getClientSecret(),
                    code).execute().body();
        } catch (IOException e) {
            throw new ShopifyServiceException(e);
        }
    }

    private String urlEncode(String string) {
        try {
            return URLEncoder.encode(string, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new ShopifyServiceException(e);
        }
    }
}
