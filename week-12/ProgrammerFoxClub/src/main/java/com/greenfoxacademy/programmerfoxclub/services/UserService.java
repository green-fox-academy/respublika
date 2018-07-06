package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    String loginMessage;
    String registerMessage;
    User currentUser;

    private final UserRepository userRepository;

    private final FoxRepository foxRepository;

    @Autowired
    public UserService(UserRepository userRepository, FoxRepository foxRepository) {
        this.userRepository = userRepository;
        this.foxRepository = foxRepository;
    }

    public String checkRegister(String username, String password1, String password2, String foxName) {
        if (userRepository.findByUserName(username).size() > 0) {
            this.registerMessage = "Username already exist. Try a new one.";
        } else if (!password1.equals(password2)) {
            this.registerMessage = "Passwords do not match. Try again!";
        } else {
            this.registerMessage = "Successful registration. You can login now.";
            foxRepository.save(new Fox(foxName));
            userRepository.save(new User(username, password1, foxRepository.findByName(foxName).get(0)));
        }
        return registerMessage;
    }

    public String checkLogin(String username, String password) {
        if (userRepository.findByUserName(username).size() > 0 &&
                userRepository.findByUserName(username).get(0).getPassword().equals(password)) {
            loginMessage = "Successful login, check your fox!";
            currentUser = userRepository.findByUserName(username).get(0);
        } else if (userRepository.findByUserName(username).size() > 0 &&
                !userRepository.findByUserName(username).get(0).getPassword().equals(password)) {
            loginMessage = "Wrong password, try again!";
        } else if (userRepository.findByUserName(username).size() <= 0) {
            loginMessage = "Username not found!";
        } else {
            loginMessage = "Haha. Nice try.";
        }
        return loginMessage;
    }

    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
