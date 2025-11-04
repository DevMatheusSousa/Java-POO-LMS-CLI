package com.example.lms.util;

public class ExcessaoLMS extends Exception {
    public ExcessaoLMS(String message) {
        super(message);
    }

    public ExcessaoLMS(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcessaoLMS(Throwable cause) {
        super(cause);
    }
}
