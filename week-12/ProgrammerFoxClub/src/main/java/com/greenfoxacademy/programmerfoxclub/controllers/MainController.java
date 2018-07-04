package com.greenfoxacademy.programmerfoxclub.controllers;



import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
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

    private final UserRepository userRepository;

    private final FoxRepository foxRepository;

    @Autowired
    public MainController(FoxService foxService, FoxRepository foxRepository, UserRepository userRepository) {
        this.foxService = foxService;
        this.foxRepository=foxRepository;
        this.userRepository=userRepository;
    }

    @GetMapping(value = {"/pfc/register"})
    public String register(Model model) {
        return "register";
    }

    @PostMapping(value = "/pfc/register")
    public String registerUser(@ModelAttribute("userName") String userName,
                               @ModelAttribute("password1") String password1,
                               @ModelAttribute("password2") String password2,
                               Model model) {
        if (!password1.equals(password2)) {
            model.addAttribute("message", "Passwords do not match. Try again!");
        } else {
            model.addAttribute("message", "Successful registration. You can login now.");
            userRepository.save(new User(userName, password1, password2));
        }
        return "registerfeedback";
    }

    @GetMapping(value={"/pfc/information"})
    public String home(@RequestParam(name="name", required=false, defaultValue="Mr. Fox") String name, Model model) {
        foxService.addFox(name);
        model.addAttribute("name", name);
        model.addAttribute("food", foxService.getFox(name).getFood());
        model.addAttribute("drink", foxService.getFox(name).getDrink());
        model.addAttribute("nbtricks", foxService.getFox(name).getTricks().size());
        model.addAttribute("knowtricks", foxService.getFox(name).knowTricks());
        model.addAttribute("tricks", foxService.getFox(name).getTricks());
        model.addAttribute("hasactions", foxService.getFox(name).hasActions());
        model.addAttribute("actions", foxService.getFox(name).getActions());
        model.addAttribute("currentTrick", foxService.getFox(name).getCurrentTrick());
        model.addAttribute("picture", foxService.getFox(name).getPicture());
        return "index";
    }

    @PostMapping(value={"/pfc/information"})
    public String homeNewPicture(@ModelAttribute("name") String name,
                                 @ModelAttribute("currentTrick") String currentTrick) {
        foxService.getFox(name).setPicture(foxService.choosePicture(currentTrick));
        foxService.getFox(name).setCurrentTrick(currentTrick);
        return "redirect:/pfc/information?name="+name;
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
    public String trick(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", foxService.getMainTricks(foxService.getFox(name)));
        model.addAttribute("hasTrickToLearn", foxService.hasTrickToLearn(foxService.getFox(name)));
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute(value="trick") String trick,
                            @ModelAttribute("name") String name) {
        foxService.getFox(name).addAction(trick, "trick");
        foxService.getFox(name).addTrick(trick);
        return "redirect:/pfc/information?name="+name;
    }

    @GetMapping("/pfc/nutritionStore")
    public String nutrition(@RequestParam("name") String name, Model model, ArrayList<String> foods, ArrayList<String> drinks) {
        model.addAttribute("name", name);
        model.addAttribute("drinks", foxService.getMainDrinks(foxService.getFox(name)));
        model.addAttribute("foods", foxService.getMainFoods(foxService.getFox(name)));
        return "nutrition";
    }

    @PostMapping(value = "/pfc/nutritionStore")
    public String nutritionBack(@ModelAttribute("drink") String drink,
                            @ModelAttribute("food") String food,
                            @ModelAttribute("name") String name) {
        foxService.getFox(name).addAction(drink, "drink");
        foxService.getFox(name).addAction(food, "food");
        foxService.getFox(name).setDrink(drink);
        foxService.getFox(name).setFood(food);
        return "redirect:/pfc/information?name="+name;
    }

    @RequestMapping("/pfc/actionHistory")
    public String actionHist(@RequestParam(name="name", required=true, defaultValue="Mr. Fox") String name, Model model) {
        foxService.addFox(name);
        model.addAttribute("name", name);
        model.addAttribute("hasactions", foxService.getFox(name).hasActions());
        model.addAttribute("actions", foxService.getFox(name).getActions());
        return "actions";
    }

}
