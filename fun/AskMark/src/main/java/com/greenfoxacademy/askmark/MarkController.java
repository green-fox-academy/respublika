package com.greenfoxacademy.askmark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MarkController {
    @GetMapping("/askMark")
    public String ask() {
        return "ask";
    }

    @PostMapping(value = "/askMark")
    public String askGet(@ModelAttribute("question") String question) {
        return "redirect:http://lmgtfy.com/?q="+question;
    }
}
