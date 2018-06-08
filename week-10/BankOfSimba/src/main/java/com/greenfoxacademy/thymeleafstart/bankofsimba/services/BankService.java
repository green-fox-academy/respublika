package com.greenfoxacademy.thymeleafstart.bankofsimba.services;

import com.greenfoxacademy.thymeleafstart.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankService {
    void add(BankAccount bankAccount);
    ArrayList<BankAccount> getAllAccount();
    void createAccounts();
}

