package com.example.springresthelloworld.student.exp;

public class AppBadException extends RuntimeException{

    public AppBadException(String message) {
        super(message);
    }
}
