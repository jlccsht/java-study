package com.mint.sample;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Sample {
    public static void main(String[] args) {
        byte[] helloBytes = stringToBytes("Hello");
        byte[] base64HelloBytes = Base64.getEncoder().encode(helloBytes);

        byte[] decodeHelloBytes = Base64.getDecoder().decode(base64HelloBytes);
        String decodeHello = bytesToString(decodeHelloBytes);

        System.out.println(bytesToString(base64HelloBytes));
        System.out.println(decodeHello);
    }

    public static byte[] stringToBytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String bytesToString(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
