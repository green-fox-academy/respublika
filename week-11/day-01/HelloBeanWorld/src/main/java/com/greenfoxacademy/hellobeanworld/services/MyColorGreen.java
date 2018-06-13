package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorGreen implements MyColor {
    @Override
    public String printColor() {
        return "green.";
    }
}
