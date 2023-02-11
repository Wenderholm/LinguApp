package com.example.linguapp.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Primary
public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
