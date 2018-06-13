package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorYellow implements MyColor {
    @Override
    public String printColor() {
        return "yellow.";
    }
}
