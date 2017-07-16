package me.philcali.shopify.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import me.philcali.oauth.api.ClientConfig;
import me.philcali.shopify.client.IShopifyService;
import me.philcali.shopify.client.IShopifyServiceProvider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ShopifyServiceProviderImpl implements IShopifyServiceProvider {
    private ObjectMapper mapper;
    private ClientConfig config;

    public ShopifyServiceProviderImpl(final ClientConfig config) {
        this(new ClientConfig(), new ObjectMapper());
    }

    public ShopifyServiceProviderImpl(final ClientConfig config, final ObjectMapper mapper) {
        this.config = config;
        this.mapper = mapper.copy();
        this.mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    @Override
    public <T> T convert(InputStream input, Class<T> clazz) throws IOException {
        return mapper.readValue(input, clazz);
    }

    @Override
    public IShopifyService getService(String shop, Optional<String> accessToken) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeout(), TimeUnit.SECONDS)
                .readTimeout(config.getReadTimeout(), TimeUnit.SECONDS);

        // Add auth header if token is present
        accessToken.ifPresent(token -> {
            builder.addInterceptor(chain -> {
                return chain.proceed(chain.request().newBuilder()
                        .addHeader("X-Shopify-Access-Token", token)
                        .build());
            });
        });

        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .baseUrl(new HttpUrl.Builder()
                        .host(shop)
                        .scheme("https")
                        .build())
                .build();

        return retrofit.create(IShopifyService.class);
    }
}
