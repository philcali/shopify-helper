package me.philcali.shopify.client;

import java.util.Optional;

public interface IShopifyServiceProvider {
    default IShopifyService getService(String shop) {
        return getService(shop, Optional.empty());
    }

    IShopifyService getService(String shop, Optional<String> accessToken);

    default IShopifyService getService(String shop, String accessToken) {
        return getService(shop, Optional.ofNullable(accessToken));
    }
}
