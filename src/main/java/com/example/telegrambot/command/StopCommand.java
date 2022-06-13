package com.example.telegrambot.command;

import com.example.telegrambot.Services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command{
    private SendBotMessageService sendBotMessageService;

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String STOP_MESSAGE="Все текущие курсы, изучаемые вами, удалены. Всего хорошего";
    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMassege(update.getMessage().getChatId().toString(),STOP_MESSAGE);
    }
}
