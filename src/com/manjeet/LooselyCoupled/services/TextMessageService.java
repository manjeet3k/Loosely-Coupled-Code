package com.manjeet.LooselyCoupled.services;

public class TextMessageService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("text message service : " + message);
    }
}
