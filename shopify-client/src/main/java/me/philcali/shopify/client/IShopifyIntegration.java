package me.philcali.shopify.client;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.StringJoiner;

import me.philcali.shopify.client.exception.HashingException;
import me.philcali.shopify.client.impl.ShopifyAuthManager;
import me.philcali.shopify.data.AuthToken;

public interface IShopifyIntegration extends IShopifyServiceProvider {
    ShopifyAuthManager createAuth(String shop);

    IHasher createHasher();

    default String getAuthUrl(String shop, String...state) {
        return createAuth(shop).getAuthUrl(state);
    }

    default AuthToken login(String shop, String code) {
        return createAuth(shop).exchange(code);
    }

    default boolean validate(Map<String, String> params) {
        StringJoiner paramJoiner = new StringJoiner("&");
        params.keySet().stream()
                .sorted()
                .filter(key ->!key.equals("hmac") && !key.equals("signature"))
                .map(key -> String.format("%s=%s", key, params.get(key)))
                .forEach(paramJoiner::add);
        try {
            String urlSafe = URLEncoder.encode(paramJoiner.toString(), "UTF-8");
            return createHasher().hex(urlSafe).equals(params.get("hmac"));
        } catch (IOException e) {
            throw new HashingException(e);
        }
    }

    default boolean validate(String payload, String hmac) {
        return createHasher().base64(payload).trim().equals(hmac);
    }
}
