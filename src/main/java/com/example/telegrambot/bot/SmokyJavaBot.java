package com.example.telegrambot.bot;

import com.example.telegrambot.Services.SendBotMessageServiceImpl;
import com.example.telegrambot.command.CommandContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import static com.example.telegrambot.command.CommandName.NO;

@Component
public class SmokyJavaBot extends TelegramLongPollingBot {

    private static String COMMAND_PREFIX = "/";

    @Value("${bot.username}")
    private String username;

    @Value("${bot.token}")
    private String token;

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    private final CommandContainer commandContainer;

    public SmokyJavaBot() {
        this.commandContainer = new CommandContainer(new SendBotMessageServiceImpl(this));
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText().trim();
            if(message.startsWith(COMMAND_PREFIX)){
                String commandIdentifier = message.split(" ")[0].toLowerCase();
                commandContainer.retrieveCommand(commandIdentifier).execute(update);
            }
            else{
                commandContainer.retrieveCommand(NO.getCommandName()).execute(update);
            }

        }
    }
}
