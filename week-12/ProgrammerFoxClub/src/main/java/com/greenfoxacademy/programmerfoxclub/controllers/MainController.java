package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {
    private final
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/pfc")
    public String home(@RequestParam(name="name", required=false, defaultValue="Mr. Fox") String name, Model model) {
        foxService.addFox(name);
        model.addAttribute("name", name);
        model.addAttribute("food", foxService.getFox(name).getFood());
        model.addAttribute("drink", foxService.getFox(name).getDrink());
        model.addAttribute("nbtricks", foxService.getFox(name).getTricks().size());
        model.addAttribute("knowntricks", foxService.getFox(name).knownTricks());
        model.addAttribute("tricks", foxService.getFox(name).getTricks());
        model.addAttribute("hasactions", foxService.getFox(name).hasActions());
        model.addAttribute("actions", foxService.getFox(name).getActions());
        return "index";
    }

    @RequestMapping("/pfc/information")
    public String info(@RequestParam(name="name", required=true, defaultValue="Mr. Fox") String name, Model model) {
        foxService.addFox(name);
        model.addAttribute("name", name);
        model.addAttribute("food", foxService.getFox(name).getFood());
        model.addAttribute("drink", foxService.getFox(name).getDrink());
        model.addAttribute("nbtricks", foxService.getFox(name).getTricks().size());
        model.addAttribute("knowntricks", foxService.getFox(name).knownTricks());
        model.addAttribute("tricks", foxService.getFox(name).getTricks());
        model.addAttribute("hasactions", foxService.getFox(name).hasActions());
        model.addAttribute("actions", foxService.getFox(name).getActions());
        return "index";
    }

    @GetMapping("/pfc/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/pfc/login")
    public String loginGet(@ModelAttribute("name") String name) {
        return "redirect:/pfc/information?name="+name;
    }

    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("name") String name, Model model, ArrayList<String> tricks) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", foxService.getFox(name).getTricks());
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute("tricks") String trick,
                            @ModelAttribute("name") String name) {
        foxService.getFox(name).addAction(trick, "trick");
        foxService.getFox(name).addTrick(trick);
        return "redirect:/pfc/information?name="+name;
    }

    @GetMapping("/pfc/nutritionStore")
    public String nutri(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "nutrition";
    }

    @PostMapping(value = "/pfc/nutritionStore")
    public String nutriBack(@ModelAttribute("drink") String drink,
                            @ModelAttribute("food") String food,
                            @ModelAttribute("name") String name) {
        foxService.getFox(name).addAction(drink, "drink");
        foxService.getFox(name).addAction(food, "food");
        foxService.getFox(name).setDrink(drink);
        foxService.getFox(name).setFood(food);
        return "redirect:/pfc/information?name="+name;
    }

}
