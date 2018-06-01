package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    long id = 0;

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greetings greeting(@RequestParam("name") String content) {
        id++;
        Greetings greeting = new Greetings(id, content);
        return greeting;
    }
}
