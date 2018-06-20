package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {
    private HashMap<String, Fox> foxes;

    public FoxService(){
        this.foxes=new HashMap<>();
    }

    public void addFox(String name) {
        foxes.put(name, new Fox(name));
    }

    public Fox getFox(String name) {
        return foxes.get(name);
    }
}
