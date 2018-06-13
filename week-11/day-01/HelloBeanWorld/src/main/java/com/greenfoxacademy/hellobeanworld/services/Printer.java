package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(@Qualifier("myColor") MyColor myColor, String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message + " with " + myColor.printColor());
    }
}