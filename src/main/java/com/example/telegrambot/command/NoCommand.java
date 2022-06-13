package com.example.telegrambot.command;

import com.example.telegrambot.Services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command{
    private final SendBotMessageService sendBotMessageService;

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String NO_MESSAGE="Я поддерживаю команды, начинающиеся со символа (/)\n"
            +"Чтобы посмотреть список команд введите /help.";
    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMassege(update.getMessage().getChatId().toString(),NO_MESSAGE);
    }
}
