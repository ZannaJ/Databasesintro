package com.company;

public enum User {
    USERNAME("username"),
    PASSWORD("password");

    private final String value;

    User(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}