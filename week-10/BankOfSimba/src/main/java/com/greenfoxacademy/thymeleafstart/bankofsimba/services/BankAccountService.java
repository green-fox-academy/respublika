package com.greenfoxacademy.thymeleafstart.bankofsimba.services;

import com.greenfoxacademy.thymeleafstart.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountService implements BankService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAccount() {
        return bankAccounts;
    }

    @Override
    public void createAccounts() {
        bankAccounts.add(new BankAccount("Simba", 2000.0, "LION", "King", "Good Guy"));
        bankAccounts.add(new BankAccount("Mufasa", 1800.0, "LION", "Bad Guy"));
        bankAccounts.add(new BankAccount("Timon", 500.0, "MEERKAT","Good Guy"));
        bankAccounts.add(new BankAccount("Pumbaa", 700.0, "WARTHOG", "Good Guy"));
        bankAccounts.add(new BankAccount("Rafiki", 2200.0, "MANDRILL", "Good Guy"));
        bankAccounts.add(new BankAccount("Zazu", 200.0, "HORNBILL", "Good Guy"));
    }

}
