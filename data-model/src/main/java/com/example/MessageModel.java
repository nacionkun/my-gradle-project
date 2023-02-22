package com.example;

public class MessageModel {

    public String getMessage() {
        return message;
    }

    private final String message;

    public MessageModel(String message) {
        this.message = message;
    }

}
