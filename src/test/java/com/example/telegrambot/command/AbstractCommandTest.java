package com.example.telegrambot.command;

import com.example.telegrambot.Services.SendBotMessageService;
import com.example.telegrambot.Services.SendBotMessageServiceImpl;
import com.example.telegrambot.bot.SmokyJavaBot;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

abstract class AbstractCommandTest {
    protected SmokyJavaBot smokyJavaBot = Mockito.mock(SmokyJavaBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageServiceImpl(smokyJavaBot);

    abstract String getCommandName();

    abstract String getCommandMessage();

    abstract Command getCommand();

    @Test
    public void shouldProperlyExecuteCommand() throws TelegramApiException {
        Long chatId = 1234567823456L;
        Update update = new Update();
        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatId);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);


        getCommand().execute(update);

        Mockito.verify(smokyJavaBot).execute(sendMessage);
    }
}
