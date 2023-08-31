package com.damjan.quantitystore.exceptions;

public class SkuNotFoundException extends RuntimeException {
    public SkuNotFoundException(Integer sku) {
        super("SKU " + sku + " is not found or does not exists");
    }
}
