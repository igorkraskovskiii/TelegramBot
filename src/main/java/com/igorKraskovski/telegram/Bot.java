package com.igorKraskovski.telegram;

import com.igorKraskovski.entity.City;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    private String botName = "ResCityInfoBot";
    private String botToken = "1131663128:AAGS_aQCEBQJQcaLVW5GnTZJsxkZ1H13VlA";

    Connect connect = new Connect();

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        sendText(message);
    }
    private synchronized void sendText(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId());
        sendMessage.setReplyToMessageId(message.getMessageId());

        City city = connect.getCityByCityName(message.getText());

        if (message.getText().equals("/start")) {
            sendMessage.setText("Hello " + message.getChat().getFirstName() +
                    "! :) \nThis bot will help you learn about any city." +
                    "\nTry enter city's name.");
        } else if (city.getCityName() == null) {
            sendMessage.setText("City does not exist! Please enter correct city.\n" +
                    "For example: Moscow");
        } else {
            sendMessage.setText("What I know about " + city.getCityName() +
                    ":\n" + city.toString());
        }
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public String getBotUsername() {
        return botName;
    }

    public String getBotToken() {
        return botToken;
    }
}
