package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ClientInfo";
    }

    @Override
    public String getBotToken() {
        return "7171497701:AAHaD0YSPibK2W-FkF7YoB1Wg0O08Rbebbk";
    }

    @Override
    public void onUpdateReceived(Update update) {}

}