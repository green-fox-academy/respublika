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
    public String home(@RequestParam(name="foxname", required=true, defaultValue="Mr. Fox") String foxname, Model model) {
        foxService.addFox(foxname);
        model.addAttribute("foxname", foxname);
        model.addAttribute("food", foxService.getFox(foxname).getFood());
        model.addAttribute("drink", foxService.getFox(foxname).getDrink());
        model.addAttribute("nbtricks", foxService.getFox(foxname).getTricks().size());
        model.addAttribute("knowntricks", foxService.getFox(foxname).knownTricks());
        model.addAttribute("tricks", foxService.getFox(foxname).getTricks());
        return "index";
    }

    @GetMapping("/pfc/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/pfc/login")
    public String loginGet(@ModelAttribute("foxname") String foxname) {
        return "redirect:/pfc?foxname="+foxname;
    }

    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("foxname") String foxname, Model model) {
        model.addAttribute("foxname", foxname);
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute("foxname") String foxname, @ModelAttribute("trick") String trick) {
        System.out.println(foxname);
        System.out.println(trick);
        foxService.getFox(foxname).addTrick(trick);
        return "redirect:/pfc?foxname="+foxname;
    }

}
