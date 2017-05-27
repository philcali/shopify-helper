package me.philcali.shopify.client;

import java.util.Base64;

import org.apache.commons.codec.binary.Hex;

import me.philcali.shopify.client.exception.HashingException;

public interface IHasher {

    default String base64(String contents) {
        return Base64.getUrlEncoder().encodeToString(hash(contents));
    }

    byte[] hash(String contents) throws HashingException;

    default String hex(String contents) {
        return Hex.encodeHexString(hash(contents));
    }
}
