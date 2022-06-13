package com.example.telegrambot.command;

import com.example.telegrambot.Services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{
    private SendBotMessageService sendBotMessageService;

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String START_MESSAGE="Привет, ты можешь выбрать для изучения курс или создать свой";


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMassege(update.getMessage().getChatId().toString(),START_MESSAGE);
    }
}
