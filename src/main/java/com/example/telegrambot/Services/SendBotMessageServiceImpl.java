package com.example.telegrambot.Services;

import com.example.telegrambot.bot.SmokyJavaBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService{
    private final SmokyJavaBot smokyJavaBot;


    public SendBotMessageServiceImpl(SmokyJavaBot smokyJavaBot) {
        this.smokyJavaBot = smokyJavaBot;
    }

    @Override
    public void sendMassege(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);
        try {
            smokyJavaBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
