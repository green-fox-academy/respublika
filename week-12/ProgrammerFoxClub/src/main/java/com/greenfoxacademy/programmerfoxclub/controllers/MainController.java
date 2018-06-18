package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(@RequestParam(name="name", required=false, defaultValue="Mr. Fox") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginGet(@RequestParam("name") String name) {
        return "redirect:/?name="+name;
    }

}
