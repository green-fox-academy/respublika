package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.models.Translate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @PostMapping(value = "/groot")
    public Object groot(@RequestBody(required = false) String message) {
        if (message==null) {
            Error error=new Error();
            return error;
        } else {
            Translate translate=new Translate(message);
            return translate;
        }

    }
}
