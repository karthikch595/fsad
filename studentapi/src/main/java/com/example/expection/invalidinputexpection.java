package com.example.expection;

public class invalidinputexpection extends RuntimeException {

    public invalidinputexpection(String message) {
        super(message);
    }
}