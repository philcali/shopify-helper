package me.philcali.shopify.data.order;

public class ClientDetails {
    private String acceptLanguage;
    private String browserHeight;
    private String browserIp;
    private String browserWidth;
    private String sessionHash;
    private String userAgent;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public String getBrowserHeight() {
        return browserHeight;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public String getBrowserWidth() {
        return browserWidth;
    }

    public String getSessionHash() {
        return sessionHash;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public void setBrowserHeight(String browserHeight) {
        this.browserHeight = browserHeight;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public void setBrowserWidth(String browserWidth) {
        this.browserWidth = browserWidth;
    }

    public void setSessionHash(String sessionHash) {
        this.sessionHash = sessionHash;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
