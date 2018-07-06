package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.models.Error;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestBackendController {

    @GetMapping(value = {"/doubling"})
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input!=null) {
            return new Doubling(input);
        } else {
            return new Error("Please provide an input!");
        }

    }

    @GetMapping(value = {"/greeter"})
    public Object greeter(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value="title", required = false) String title) {
        if (name!=null && title!=null) {
            return new Greeter(name, title);
        } else if (name==null && title!=null) {
            return new Error("Please provide a name!");
        } else if (name!=null && title==null) {
            return new Error("Please provide a title!");
        } else {
            return new Error("Please provide a name!");
        }
    }

    @GetMapping(value = {"/appenda/{appendable}"})
    public Object greeter(@PathVariable(value = "appendable", required = false) String appendable) {
        if (appendable!=null) {
            return new AppendA(appendable);
        } else {
            return "/noappendable";
        }
    }

    @PostMapping(value = {"/dountil/{what}"})
    public Object doUntilPost(@RequestBody(required = false) Until until, @PathVariable("what") String what) {
        if (until!=null) {
            DoUntil doUntil = new DoUntil(what);
            doUntil.countResult(what, until);
            return doUntil;
        } else {
            Error error=new Error("Please provide a number!");
            return error;
        }

    }

}
