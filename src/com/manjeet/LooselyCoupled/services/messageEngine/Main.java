package com.manjeet.LooselyCoupled.services.messageEngine;

import com.manjeet.LooselyCoupled.services.MessageService;

public class Main {
    public static void main(String[] args) {
        MessageServiceFactory messageServiceFactory = new MessageServiceFactory();
        MessageService messageService = messageServiceFactory.getmessageService("text");
        messageService.sendMessage("Hello World");

        messageService = messageServiceFactory.getmessageService("whatsApp");
        messageService.sendMessage("Hello Students");

        messageService = messageServiceFactory.getmessageService("FacebookMessage");
        messageService.sendMessage("Hello folks");

    }
}
