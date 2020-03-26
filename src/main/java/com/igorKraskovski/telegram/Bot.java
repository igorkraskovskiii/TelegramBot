package com.igorKraskovski.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    private String botName = "ResCityInfoBot";
    private String botToken = "1131663128:AAGS_aQCEBQJQcaLVW5GnTZJsxkZ1H13VlA";

    public void onUpdateReceived(Update update) {
    }

    public String getBotUsername() {
        return botName;
    }

    public String getBotToken() {
        return botToken;
    }
}
