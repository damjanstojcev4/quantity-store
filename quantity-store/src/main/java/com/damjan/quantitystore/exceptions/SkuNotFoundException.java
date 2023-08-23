package com.damjan.quantitystore.exceptions;

public class SkuNotFoundException extends RuntimeException {
    public SkuNotFoundException(Integer sku) {
        super("Шифрата " + sku + " не е пронајдена или не постои");
    }
}
