package me.philcali.shopify.client.exception;

public class ShopifyServiceException extends RuntimeException {
    private static final long serialVersionUID = 7715922579967888059L;

    public ShopifyServiceException(Throwable e) {
        super(e);
    }
}
