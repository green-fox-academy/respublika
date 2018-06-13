package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilityController {

    UtilityService utilityService;

    @Autowired
    public UsefulUtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }


    @RequestMapping("/useful")
    public String usefulMain() {
        return "usefulMain";
    }

    @RequestMapping("/useful/colored")
    public String usefulColored(Model color) {
        color.addAttribute("color", utilityService.randomColor());
        return "usefulColored";
    }
    @RequestMapping("/useful/email")
    public String usefulEmail(@RequestParam("email") String email, Model model) {
        String message=utilityService.isValidEmail(email);
        String color=utilityService.isValidEmailColor(email);
        model.addAttribute("email", email);
        model.addAttribute("message", message);
        model.addAttribute("color", color);
        return "usefulEmail";
    }

    @RequestMapping("/useful/encode")
    public String encode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
        String result=utilityService.caesar(text, number);
        model.addAttribute("result", result);
        return "usefulCeasar";
    }

    @RequestMapping("/useful/decode")
    public String decode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
        String result=utilityService.caesar(text, -number);
        model.addAttribute("result", result);
        return "usefulCeasar";
    }
}
