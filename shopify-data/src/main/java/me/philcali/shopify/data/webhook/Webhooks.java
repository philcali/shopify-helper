package me.philcali.shopify.data.webhook;

import java.util.List;

public class Webhooks {
    private List<Webhook> webhooks;

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
    }
}
