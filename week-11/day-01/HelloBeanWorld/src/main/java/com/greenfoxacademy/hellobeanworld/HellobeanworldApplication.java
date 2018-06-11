package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.services.MyColorGreen;
import com.greenfoxacademy.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    @Autowired
    Printer printer;

    @Autowired
    MyColorGreen green;

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        green.printColor();
    }


}
