package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Component
public class Commands {

    public SendMessage botton(long chat_id, String text) {
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Пиво разливное");
        row1.add("Пиво в бутылке");
        row1.add("Безалкогольные напитки");

        KeyboardRow row2 = new KeyboardRow();
        row2.add("Сидр розливной");
        row2.add("Сидр баночный");
        row2.add("Снеки");

        KeyboardRow row3 = new KeyboardRow();
        row3.add("Морепродукты");
        row3.add("Акции");
        row3.add("Контакты");

        List<KeyboardRow> keyboard = new ArrayList<>();
        keyboard.add(row1);
        keyboard.add(row2);
        keyboard.add(row3);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setChatId(chat_id);
        sendMessage.setText(text);
        return sendMessage;
    }
}
