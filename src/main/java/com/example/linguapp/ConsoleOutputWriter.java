package com.example.linguapp;

import com.example.linguapp.formatter.TextFormatter;
import org.springframework.stereotype.Service;

@Service
public class ConsoleOutputWriter {
    private final TextFormatter textFormatter;

    public ConsoleOutputWriter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    void println(String text){
        String formatText = textFormatter.format(text);
        System.out.println(formatText);
    }
}
