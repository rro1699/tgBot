package com.example.telegrambot.command;

import com.example.telegrambot.Services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command{
    private final SendBotMessageService sendBotMessageService;

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String UNKNOWN_MESSAGE = "Не понимаю вас \uD83D\uDE1F, напишите /help чтобы узнать что я понимаю.";

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMassege(update.getMessage().getChatId().toString(),UNKNOWN_MESSAGE);
    }
}
