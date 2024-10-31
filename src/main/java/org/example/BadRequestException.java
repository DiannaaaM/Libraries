package org.example;

public class BadRequestException extends Throwable {
    public BadRequestException(String invalidName) {
        super(invalidName);
    }
}
