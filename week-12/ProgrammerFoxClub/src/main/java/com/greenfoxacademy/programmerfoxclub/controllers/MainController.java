package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private final
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/pfc")
    public String home(@RequestParam(name="name", required=true, defaultValue="Mr. Fox") String name, Model model) {
        foxService.addFox(name);
        model.addAttribute("name", name);
        model.addAttribute("food", foxService.getFox(name).getFood());
        model.addAttribute("drink", foxService.getFox(name).getDrink());
        model.addAttribute("nbtricks", foxService.getFox(name).getTricks().size());
        model.addAttribute("knowntricks", foxService.getFox(name).knownTricks());
        System.out.println(foxService.getFox(name).knownTricks());
        model.addAttribute("tricks", foxService.getFox(name).getTricks());
        return "index";
    }

    @GetMapping("/pfc/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/pfc/login")
    public String loginGet(@ModelAttribute("name") String name) {
        return "redirect:/pfc?name="+name;
    }

    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute("name") String name, @ModelAttribute("trick") String trick) {
        foxService.getFox(name).addTrick(trick);
        return "redirect:/pfc?name="+name;
    }

}
