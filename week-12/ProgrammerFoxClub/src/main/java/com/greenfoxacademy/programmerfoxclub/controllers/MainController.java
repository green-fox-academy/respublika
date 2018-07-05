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
        model.addAttribute("message", userService.checkLogin(userName, password));
        return "afterlogin";
    }

    @GetMapping(value={"/pfc/information"})
    public String home(@RequestParam(name="userName") String userName, Model model) {
        model.addAttribute("name", userService.getCurrentUser().getFox().getName());
        model.addAttribute("food",  userService.getCurrentUser().getFox().getFood());
        model.addAttribute("drink",  userService.getCurrentUser().getFox().getDrink());
        model.addAttribute("nbtricks",  userService.getCurrentUser().getFox().getTricks().size());
        model.addAttribute("knowtricks",  userService.getCurrentUser().getFox().knowTricks());
        model.addAttribute("tricks",  userService.getCurrentUser().getFox().getTricks());
        model.addAttribute("hasactions",  userService.getCurrentUser().getFox().hasActions());
        model.addAttribute("actions",  userService.getCurrentUser().getFox().getActions());
        model.addAttribute("currentTrick",  userService.getCurrentUser().getFox().getCurrentTrick());
        model.addAttribute("picture",  userService.getCurrentUser().getFox().getPicture());
        model.addAttribute("userName",  userName);
        return "index";
    }

    @PostMapping(value={"/pfc/information"})
    public String homeNewPicture(@ModelAttribute("userName") String userName,
                                 @ModelAttribute("currentTrick") String currentTrick) {
        userService.getCurrentUser().getFox().setPicture(foxService.choosePicture(currentTrick));
        userService.getCurrentUser().getFox().setCurrentTrick(currentTrick);
        userRepository.save(userService.getCurrentUser());
        foxRepository.save(userService.getCurrentUser().getFox());
        return "redirect:/pfc/information?userName="+userName;
    }



    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName",  userService.getCurrentUser().getUserName());
        model.addAttribute("name", userService.getCurrentUser().getFox().getName());
        model.addAttribute("tricks", foxService.getMainTricks(userService.getCurrentUser().getFox()));
        model.addAttribute("hasTrickToLearn", foxService.hasTrickToLearn(userService.getCurrentUser().getFox()));
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute(value="trick") String trick,
                            @ModelAttribute("name") String name,
                            @ModelAttribute("userName") String userName,
                            Model model) {
        model.addAttribute("userName",  userService.getCurrentUser().getUserName());
        userService.getCurrentUser().getFox().addAction(trick, "trick");
        userService.getCurrentUser().getFox().addTrick(trick);
        userRepository.save(userService.getCurrentUser());
        foxRepository.save(userService.getCurrentUser().getFox());
        return "redirect:/pfc/information?userName="+userName;
    }

    @GetMapping("/pfc/nutritionStore")
    public String nutrition(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName",  userName);
        model.addAttribute("name", userService.getCurrentUser().getFox().getName());
        model.addAttribute("drinks", foxService.getMainDrinks(userService.getCurrentUser().getFox()));
        model.addAttribute("foods", foxService.getMainFoods(userService.getCurrentUser().getFox()));
        return "nutrition";
    }

    @PostMapping(value = "/pfc/nutritionStore")
    public String nutritionBack(@ModelAttribute("drink") String drink,
                                @ModelAttribute("food") String food,
                                @ModelAttribute("name") String name,
                                @ModelAttribute("userName") String userName,
                                Model model) {
        model.addAttribute("userName",  userName);
        userService.getCurrentUser().getFox().addAction(drink, "drink");
        userService.getCurrentUser().getFox().addAction(food, "food");
        userService.getCurrentUser().getFox().setDrink(drink);
        userService.getCurrentUser().getFox().setFood(food);
        foxRepository.save(userService.getCurrentUser().getFox());
        return "redirect:/pfc/information?userName="+userName;
    }

    @RequestMapping("/pfc/actionHistory")
    public String actionHist(@RequestParam(name="userName") String userName, Model model) {
        model.addAttribute("userName",  userName);
        model.addAttribute("name", userService.getCurrentUser().getFox().getName());
        model.addAttribute("hasactions", userService.getCurrentUser().getFox().hasActions());
        model.addAttribute("actions", userService.getCurrentUser().getFox().getActions());
        return "actions";
    }

}
