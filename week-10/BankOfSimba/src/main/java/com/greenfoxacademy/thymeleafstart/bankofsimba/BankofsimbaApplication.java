package com.greenfoxacademy.thymeleafstart.bankofsimba;

import com.greenfoxacademy.thymeleafstart.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankofsimbaApplication implements CommandLineRunner {
    @Autowired
    BankService bankService;

    public static void main(String[] args) {
        SpringApplication.run(BankofsimbaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bankService.createAccounts();
    }
}
