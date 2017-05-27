package me.philcali.shopify.client.impl;

import java.security.Key;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import me.philcali.shopify.client.IHasher;
import me.philcali.shopify.client.exception.HashingException;

public class HmacHasher implements IHasher {
    private final String secret;

    public HmacHasher(String secret) {
        this.secret = secret;
    }

    @Override
    public byte[] hash(String contents) throws HashingException {
        try {
            Mac sha256 = Mac.getInstance("HmacSHA256");
            Key spec = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
            sha256.init(spec);
            return sha256.doFinal(contents.getBytes("UTF-8"));
        } catch (Exception e) {
            throw new HashingException(e);
        }
    }
}
