package com.manjeet.TightlyCoupled.services;

import com.manjeet.TightlyCoupled.services.TextMessageService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TextMessageService textMessageService = new TextMessageService();
        textMessageService.printMessage();

        textMessageService.printMessage("Welcome to the programming world");


    }
}