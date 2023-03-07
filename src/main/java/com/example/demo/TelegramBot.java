package com.example.demo;

import com.vdurmont.emoji.EmojiParser;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Getter
@Setter
public class TelegramBot extends TelegramLongPollingBot {
    @Autowired
    private Bot bot;

    @Autowired
    private Commands commands;

    String beer = EmojiParser.parseToUnicode(":beer:");
    String crouton = EmojiParser.parseToUnicode(":cider:");
    String fish = EmojiParser.parseToUnicode(":fish:");
    String crab = EmojiParser.parseToUnicode(":crab:");

    @Override
    public String getBotUsername() {
        return bot.getName();
    }

    @Override
    public String getBotToken() {
        return bot.getToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            switch (messageText) {
                case "/start":
                    execute(commands.botton(chat_id, "Привет! Всем бирдекел! Магазин разливных " +
                            "напитков приветствует тебя. Бот Бирдекель поможоте тебе ознакомиться с " +
                            "нашим ассортиментом, с действующими акциями и бонусами"));
                    break;

                case "Пиво разливное":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Чешское элитное" + beer + ":200р" +
                                        "\n(1 литр,светлое)" +
                                    "\nТрое в лодке" + beer + ":210р " +
                                        "\n(1 литр,светлое фильтрованное)" +
                                    "\nКрюгер бархатное" + beer + ":210р" +
                                        "\n(1 литр,темное живое)" +
                                    "\nЖигулевское" + beer + ":180р" +
                                        "\n(1 литр,светлое фильтрованное)" +
                                    "\nНемецкое" + beer +":180р" +
                                        "\n(1 литр,светлое нефильтрованное)" +
                                    "\nХадыженское" + beer + ":200р" +
                                        "\n(1 литр,светлое)" +
                                    "\nBlanche de silly" + beer + ":350р" +
                                        "\n(1 литр,белое пшеничное)" +
                                    "\nNut butter" + beer + ":350р" +
                                        "\n(1 литр,темное)" +
                                    "\nИрландский эль" + beer + ":220р" +
                                        "\n(1 литр,темное)" +
                                    "\nИрландский эль" + beer + ":190р" +
                                        "\n(1 литр,красное живое)" +
                                    "\nНемецкое" + beer + ":190р" +
                                        "\n(1 литр,светлое)" +
                                    "\nWeissberg" + beer + ":200р" +
                                        "\n(1 литр,пшеничное нефильтрованное светлое)" +
                                    "\nКрюгер классический" + beer+ ":210р" +
                                        "\n(1 литр,светлое фильтрованное)" +
                                    "\nТомское" + beer + ":210" +
                                        "\n(1 литр,светлое)" +
                                    "\nЧешский град" + beer + ":180р" +
                                        "\n(1 литр,светлое фильтрованное)" +
                                    "\nБелый кролик" + beer + ":210р" +
                                        "\n(1 литр,пшеничное нефильтрованное светлое)" +
                                    "\nЛакинское" + beer + ":120р" +
                                        "\n(1 литр,светлое фильтрованное)" +
                                    "\nБайройтер хель" + beer + ":450р" +
                                        "\n(1 литр,светлое)" +
                                    "\nТоварищ" + beer + ":190р" +
                                        "\n(1 литр)" +
                                    "\nЖигулевское" + beer + ":230р" +
                                        "\n(1 литр)" +
                                    "\nАйсти" + beer + ":190р" +
                                        "\n(1 литр)"));
                    break;

                case "Снеки":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Гренки чесночные:60р (100 гр)" +
                                    "\nГренки холодец с хреном:80р (100 гр)" +
                                    "\nГренки сало-горчица:80р (100 гр)" +
                                    "\nГренки аджика:80р (100 гр)" +
                                    "\nГренки сметана лук:80р (100 гр)" +
                                    "\nГренки прованские травы:80р (100 гр)" +
                                    "\nНачос:60р (100 гр)" +
                                    "\nГренки со сметаной и зеленью:75р (уп)" +
                                    "\nMulti chips:50р (50 гр)" +
                                    "\nХрустящий картофель:170р (уп)" +
                                    "\nЧипсы Bruto бекон:140р (уп)" +
                                    "\nЧипсы Bruto сметана и зелень:140р (уп)" +
                                    "\nЧипсы Bruto зеленый лук:140р (уп)" +
                                    "\nЧипсы Bruto классический:180р (уп)" +
                                    "\nЧипсы из лаваша холодец с хреном:55р (уп)" +
                                    "\nNachos барбекю:80р (уп)" +
                                    "\nNachos сметана и лук:80р (уп)" +
                                    "\nNachos сыр:80р (уп)" +
                                    "\nКешью:130р (100 гр)" +
                                    "\nФисташки:170р (100 гр)" +
                                    "\nАрахис соленый:70р (100 гр)" +
                                    "\nАрахис паприка:70р (100 гр)" +
                                    "\nАрахис холодец и хрен:70р (100 гр)" +
                                    "\nАрахис лобстер:70р (100 гр)" +
                                    "\nАрахис кревтка:70р (100 гр)" +
                                    "\nАрахис бекон:70р (100 гр)" +
                                    "\nАрахис грибы со сметаной:70р (100 гр)" +
                                    "\nАрахис мексиканский соус:70р (100 гр)" +
                                    "\nБогонок копченый:174р (100 гр)" +
                                    "\nСырные шарики:160р (100 гр)"));
                    break;

                case "Сидр розливной":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Яблочный:160р (1 литр)" +
                                    "\nВишневый:190р (1 литр)" +
                                    "\nЧерная смородина:190р (1 литр)" +
                                    "\nCIDRE ROYAL:220р (1 литр)"));
                    break;

                case "Сидр в бутылке":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Cidr royal pear:280р (750 мл)" +
                                    "\nCidr royal black currant:280р (750мл)" +
                                    "\nCidr royal aprikot:280р (750 мл)" +
                                    "\nCidr rose:330р (750 мл)" +
                                    "\nCidr cranberry:125р (330 мл)" +
                                    "\nCidr cherry:125р (330 мл)" +
                                    "\nCidr with mint:125р (330 мл)"));
                    break;

                case "Безалкогольные напитки":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Тархун:80р (1 литр)" +
                                    "\nДюшес:80р (1 литр)"));
                    break;

                case "Морепродукты":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Вобла" + fish + ":110р (100 гр)" +
                                    "\nПлотва" + fish + ":80р (100 гр)" +
                                    "\nКорюшка" + fish + ":210р (100 гр)" +
                                    "\nТарань" + fish + ":85р (100гр)" +
                                    "\nЖерех" + fish + ":90р (100 гр)" +
                                    "\nЯзьхк" + fish + ":90р (100 гр)" +
                                    "\nГорбуша" + fish + ":160р (100 гр)" +
                                    "\nЛещ астраханский" + fish + ":40р (100 гр)" +
                                    "\nСинец" + fish + ":80р (100 гр)" +
                                    "\nСырок" + fish + ":110р (100 гр)" +
                                    "\nСудак" + fish + ":90р (100 гр)" +
                                    "\nАнчоус" + fish + ":135р (100 гр)" +
                                    "\nЖелтый полосатик" + fish + ":150р (100 гр)" +
                                    "\nМясо краба" + crab + ":190р (100 гр)" +
                                    "\nКальмар полоски:170р (100 гр)" +
                                    "\nСтружка кальмара:160р (100 гр)" +
                                    "\nЯнтарная спинка:190р (100 гр)" +
                                    "\nИкра воблы" + fish + ":270р (100 гр)" +
                                    "\nСоломка воблы" + fish + ":80р (100 гр)" +
                                    "\nМинтай соломка" + fish + ":95р (100 гр)" +
                                    "\nСоломка трески" + fish + ":120р (100 гр)"));

                case "Акции":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "Тут акции будут:"));
                    break;

                case "Контакты":
                    execute(new SendMessage(String.valueOf(chat_id),
                            "+7(925) 553-17-73 Амрах"));
                    break;
            }
        }
    }
}

