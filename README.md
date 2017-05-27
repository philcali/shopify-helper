# Shopify Helpers

Just throwing some Shopify helper into a single integration package.

## How do I use it?

Everything is bundled up into a single integration object:

``` java
final IShopifyIntegration integration = new ShopifyIntegrationImpl(new ShopifyClientConfig()
        .withClientId(clientId)
        .withClientSecret(clientSecret)
        .withRedirectUrl("https://example.com/auth")
        .withScopes(Arrays.asList("read_customers", "read_orders")));
```

## How do I authenticate?

Once you have an `IShopifyIntegration` implementation, you can use the component
as middleware to both receive a user authentication URL *and* receive an access token:

__Generate an authentication URL__

``` java
// Plain authentication URL
String authUrl = integration.getAuthUrl(shop);

// authentication URL with application specific nonces
String authNonceUrl = integration.getAuthUrl(shop, state1, state2, stateN);
```

Send the user to either of those auth URL's to complete application installation.

__Complete the login for a token__
Use your favorite serverless or server framework to handle the Shopify OAuth redirect:

``` java
Map<String, String> params = request.getParams();
String code = params.get("code");
String shop = params.get("shop");
Optional<String> state = Optional.ofNullable(params.get("state"));

if (integration.validate(params)) {
    AuthToken token = integration.login(shop, code);
    // Use the integration to parse out nonces passed in the auth URL
    state.map(integration::parseState)
            .map(Arrays::stream)
            .ifPresent(states -> states.forEach(System.out::println));
    System.out.println(token.getAccessToken()); // You'll need this for later!
} else {
    throw new UnauthorizedException("Oops, the hmac did not validate!");
}
```

## Great! How do I actually use the API?

It's super easy! All you need is a `IShopifyProvider` implementation which is a
Shopify REST API client provider. The good news is that the `IShopifyIntegration`
extends the `IShopifyProvider` interface, so you can reuse the same implementation
for this task.

``` java
IShopifyService shopify = integration.getService(shop, token.getAccessToken());
Call<Webhooks> webhooksCall = shopify.getWebhooks(); // And many more
```

## What about webhooks?

Webhooks are also covered using the same integration object.

``` java
String body = request.getBody();
String hmac = request.getHeader("HTTP_X_SHOPIFY_HMAC_SHA256");

if (integration.validate(body, hmac)) {
    // Handle the payload accordingly...
} else {
    throw new UnauthorizedException("Oops, the webhooks hmac did not validate!");
}
```
