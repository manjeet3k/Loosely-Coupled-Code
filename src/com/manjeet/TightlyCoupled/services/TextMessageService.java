package com.manjeet.TightlyCoupled.services;

import java.sql.SQLOutput;

public class TextMessageService {

    public void printMessage() {
        System.out.println("Hello! I'm from text message service");
    }

    public void printMessage(String message) {
        System.out.println("hello  - " + message);
    }
}
