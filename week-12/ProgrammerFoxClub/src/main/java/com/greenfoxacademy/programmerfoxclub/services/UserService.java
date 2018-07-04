package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    String loginMessage;
    User currentUser;

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public String checkLogin(String username, String password) {
        if (userRepository.findByUserName(username).size()>0 &&
                userRepository.findByUserName(username).get(0).getPassword().equals(password)) {
            loginMessage="Successful login, check your fox!";
            currentUser=userRepository.findByUserName(username).get(0);
        } else if (userRepository.findByUserName(username).size()>0 &&
                !userRepository.findByUserName(username).get(0).getPassword().equals(password)) {
            loginMessage="Wrong password, try again!";
        } else if (userRepository.findByUserName(username).size()<=0) {
            loginMessage="Username not found!";
        } else {loginMessage="Haha. Nice try.";}
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
