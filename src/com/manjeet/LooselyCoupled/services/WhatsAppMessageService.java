package com.manjeet.LooselyCoupled.services;

public class WhatsAppMessageService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("whatsApp message service : " + message);
    }
}
