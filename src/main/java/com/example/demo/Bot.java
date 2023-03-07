package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
@Getter
@Setter
public class Bot {
    @Value("${bot.name}")
    private String name;

    @Value("${bot.token}")
    private String token;
}
