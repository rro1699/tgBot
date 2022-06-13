package com.example.telegrambot.Services;

import com.example.telegrambot.bot.SmokyJavaBot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {
    private SendBotMessageService sendBotMessageService;
    private SmokyJavaBot smokyJavaBot;

    @BeforeEach
    public void init(){
        smokyJavaBot= Mockito.mock(SmokyJavaBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(smokyJavaBot);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException {
       String chatId = "test_chat_id";
       String message = "test_message";


        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        sendBotMessageService.sendMassege(chatId,message);

        Mockito.verify(smokyJavaBot).execute(sendMessage);
    }
}
