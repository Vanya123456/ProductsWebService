package com.buyukli.ivan.productswebservice.exceptions;

public class CustomRuntimeNotFoundException extends RuntimeException{
    public CustomRuntimeNotFoundException(String message) {
        super(message);
    }
}
