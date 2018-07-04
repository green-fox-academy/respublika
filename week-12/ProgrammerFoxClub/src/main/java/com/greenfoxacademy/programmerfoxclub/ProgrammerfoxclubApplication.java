package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammerfoxclubApplication implements CommandLineRunner {
    private final FoxRepository foxRepository;

    private final UserRepository userRepository;

    @Autowired
    public ProgrammerfoxclubApplication(FoxRepository foxRepository, UserRepository userRepository) {
        this.foxRepository = foxRepository;
        this.userRepository=userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerfoxclubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}