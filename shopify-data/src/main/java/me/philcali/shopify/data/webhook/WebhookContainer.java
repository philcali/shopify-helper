package me.philcali.shopify.data.webhook;

public class WebhookContainer {
    private Webhook webhook;

    public Webhook getWebhook() {
        return webhook;
    }

    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    public WebhookContainer withWebhook(Webhook webhook) {
        setWebhook(webhook);
        return this;
    }
}
