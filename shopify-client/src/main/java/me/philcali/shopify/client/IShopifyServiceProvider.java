package me.philcali.shopify.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public interface IShopifyServiceProvider {
    <T> T convert(InputStream input, Class<T> clazz) throws IOException;

    default <T> T convert(String payload, Class<T> clazz) throws IOException {
        return convert(new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8)), clazz);
    }

    default IShopifyService getService(String shop) {
        return getService(shop, Optional.empty());
    }

    IShopifyService getService(String shop, Optional<String> accessToken);

    default IShopifyService getService(String shop, String accessToken) {
        return getService(shop, Optional.ofNullable(accessToken));
    }
}
