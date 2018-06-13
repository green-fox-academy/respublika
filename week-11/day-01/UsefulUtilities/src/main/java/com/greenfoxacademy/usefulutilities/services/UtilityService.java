package com.greenfoxacademy.usefulutilities.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String isValidEmail(String email) {
        String message;
        if (email.contains("@") & email.contains(".")) {
            message="is a valid email address";
        } else {
            message="is not a valid email address";
        }

        return message;
    }

    public String isValidEmailColor(String email) {
        String color;
        if (email.contains("@") & email.contains(".")) {
            color="green";
        } else {
            color="red";
        }

        return color;
    }


    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

}