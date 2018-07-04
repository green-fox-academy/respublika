package com.greenfoxacademy.programmerfoxclub.controllers;



import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {
    private final
    FoxService foxService;

    private final
    UserService userService;

    private final UserRepository userRepository;

    private final FoxRepository foxRepository;

    @Autowired
    public MainController(FoxService foxService, FoxRepository foxRepository, UserRepository userRepository, UserService userService) {
        this.foxService = foxService;
        this.foxRepository=foxRepository;
        this.userRepository=userRepository;
        this.userService=userService;
    }

    @GetMapping(value = {"/pfc/register"})
    public String register(Model model) {
        return "register";
    }

    @PostMapping(value = "/pfc/register")
    public String registerUser(@ModelAttribute("userName") String userName,
                               @ModelAttribute("password1") String password1,
                               @ModelAttribute("password2") String password2,
                               @ModelAttribute("foxName") String foxName,
                               Model model) {
        if (!password1.equals(password2)) {
            model.addAttribute("message", "Passwords do not match. Try again!");
        } else {
            model.addAttribute("message", "Successful registration. You can login now.");
            foxRepository.save(new Fox(foxName));
            userRepository.save(new User(userName, password1, foxRepository.findByName(foxName).get(0)));
        }
        return "registerfeedback";
    }

    @GetMapping("/pfc/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/pfc/login")
    public String loginPost(@ModelAttribute("userName") String userName,
                            @ModelAttribute("password") String password,
                            Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("message", userService.checkLogin(userName, password));
        return "afterlogin";
    }

    @GetMapping(value={"/pfc/information"})
    public String home(@RequestParam(name="userName") String userName, Model model) {
        model.addAttribute("name", userRepository.findByUserName(userName).get(0).getFox().getName());
        model.addAttribute("food", userRepository.findByUserName(userName).get(0).getFox().getFood());
        model.addAttribute("drink", userRepository.findByUserName(userName).get(0).getFox().getDrink());
        model.addAttribute("nbtricks", userRepository.findByUserName(userName).get(0).getFox().getTricks().size());
        model.addAttribute("knowtricks", userRepository.findByUserName(userName).get(0).getFox().knowTricks());
        model.addAttribute("tricks", userRepository.findByUserName(userName).get(0).getFox().getTricks());
        model.addAttribute("hasactions", userRepository.findByUserName(userName).get(0).getFox().hasActions());
        model.addAttribute("actions", userRepository.findByUserName(userName).get(0).getFox().getActions());
        model.addAttribute("currentTrick", userRepository.findByUserName(userName).get(0).getFox().getCurrentTrick());
        model.addAttribute("picture", userRepository.findByUserName(userName).get(0).getFox().getPicture());
        return "index";
    }

    @PostMapping(value={"/pfc/information"})
    public String homeNewPicture(@ModelAttribute("userName") String userName,
                                 @ModelAttribute("currentTrick") String currentTrick) {
        userRepository.findByUserName(userName).get(0).getFox().setPicture(foxService.choosePicture(currentTrick));
        userRepository.findByUserName(userName).get(0).getFox().setCurrentTrick(currentTrick);
        return "redirect:/pfc/information?userName="+userName;
    }



    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("name", userRepository.findByUserName(userName).get(0).getFox().getName());
        model.addAttribute("tricks", foxService.getMainTricks(userRepository.findByUserName(userName).get(0).getFox()));
        model.addAttribute("hasTrickToLearn", foxService.hasTrickToLearn(userRepository.findByUserName(userName).get(0).getFox()));
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute(value="trick") String trick,
                            @ModelAttribute("name") String name,
                            @ModelAttribute("userName") String userName) {
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
