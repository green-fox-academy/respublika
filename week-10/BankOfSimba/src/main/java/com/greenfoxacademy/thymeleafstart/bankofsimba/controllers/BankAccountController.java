package com.greenfoxacademy.thymeleafstart.bankofsimba.controllers;

import com.greenfoxacademy.thymeleafstart.bankofsimba.models.BankAccount;
import com.greenfoxacademy.thymeleafstart.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BankAccountController {
    private final
    BankService bankService;

    @Autowired
    public BankAccountController(BankService bankService) {
        this.bankService = bankService;
    }

    @RequestMapping("/show")
    public String getAccount(Model model) {
        BankAccount bankAccount= new BankAccount("Simba", 2000.0, "lion");
        String balanceFormatted = String.format ("%.2f", bankAccount.getBalance());
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("balance", balanceFormatted);
        model.addAttribute("animalType", bankAccount.getAnimalType());
        return "getAccount";
    }

    @RequestMapping("/submitstring")
    public String submitString(Model model) {
        String string="This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("string", string);
        return "submitString";
    }

    @RequestMapping("/showmore")
    public String getAccounts(Model model) {
        bankService.createAccounts();
        model.addAttribute("accounts", bankService.getAllAccount());
        return "getAccounts";
    }
}
