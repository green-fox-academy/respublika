package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestBackendController {
    private LogRepository logRepository;

    @Autowired
    public RestBackendController(LogRepository logRepository) {
        this.logRepository=logRepository;
    }

    @GetMapping(value = {"/doubling"})
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        logRepository.save(new Log("/doubling", "input="+input ));
        if (input!=null) {
            return new Doubling(input);
        } else {
            return new Error("Please provide an input!");
        }

    }

    @GetMapping(value = {"/greeter"})
    public Object greeter(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value="title", required = false) String title) {
        logRepository.save(new Log("/greeter", "name="+name+", title="+title));
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
        logRepository.save(new Log("/appenda", "appendable="+appendable));
        if (appendable!=null) {
            return new AppendA(appendable);
        } else {
            return "/noappendable";
        }
    }

    @PostMapping(value = {"/dountil/{what}"})
    public Object doUntilPost(@RequestBody(required = false) Until until, @PathVariable("what") String what) {
        logRepository.save(new Log("/dountil", "what="+what+", until="+until.getUntil()));
        if (until!=null) {
            DoUntil doUntil = new DoUntil(what);
            doUntil.countResult(what, until);
            return doUntil;
        } else {
            Error error=new Error("Please provide a number!");
            return error;
        }

    }

    @PostMapping(value = {"/arrays"})
    public Object arrayHandler(@RequestBody(required = false) ArrayInput arrayInput) {
        logRepository.save(new Log("/arrays", "arrayInput="+String.join(", ", (arrayInput.getNumbers().toString()))));
        if (arrayInput!=null && (arrayInput.getWhat().equals("sum") || arrayInput.getWhat().equals("multiply"))) {
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.countResult(arrayInput);
            return arrayHandler.getResultInt();
        } else if (arrayInput!=null && arrayInput.getWhat().equals("double")) {
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.countResult(arrayInput);
            return arrayHandler.getResultList();
        } else {
            Error error=new Error("Please provide what to do with the numbers!");
            return error;
        }

    }

    @GetMapping(value = {"/log"})
    public Object log() {
        return logRepository.findAll();
    }

}
