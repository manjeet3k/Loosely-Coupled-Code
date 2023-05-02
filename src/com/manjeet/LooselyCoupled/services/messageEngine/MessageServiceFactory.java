package com.manjeet.LooselyCoupled.services.messageEngine;

import com.manjeet.LooselyCoupled.services.MessageService;
import com.manjeet.LooselyCoupled.services.TextMessageService;
import com.manjeet.LooselyCoupled.services.WhatsAppMessageService;

public class MessageServiceFactory {

    public MessageService getmessageService(String serviceType) {
        if(serviceType.equals("text"))
            return new TextMessageService();
        else if(serviceType.equals("whatsApp")) {
            return new WhatsAppMessageService();
        }
        else {
            throw new RuntimeException("no such service type exists");
        }
    }
}
