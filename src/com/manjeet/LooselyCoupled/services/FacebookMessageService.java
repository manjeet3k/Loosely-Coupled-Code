package com.manjeet.LooselyCoupled.services;

public class FacebookMessageService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("facebook Message Service: " + message);
    }
}
