package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.models.Translate;
import com.greenfoxacademy.groot.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @PostMapping(value = "/groot")
    public ResponseEntity<Object> groot(@RequestBody(required = false) String message) {
        if (message==null) {
            return new ResponseEntity<>(new ErrorMessage(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Translate(message), HttpStatus.OK);
        }

    }
}
