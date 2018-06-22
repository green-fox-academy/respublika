package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FoxService {
    private HashMap<String, Fox> foxes;
    private ArrayList<String> tricks=new ArrayList<>();
    private ArrayList<String> food=new ArrayList<>();
    private ArrayList<String> drink=new ArrayList<>();

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public FoxService(){
        this.foxes=new HashMap<>();
        this.tricks.add("Write HTML");
        this.tricks.add("Code Java");
        this.tricks.add("Play CSS");
    }

    public void addFox(String name) {
        if (!foxes.containsKey(name)) {
            foxes.put(name, new Fox(name));
        }
    }

    public Fox getFox(String name) {
        return foxes.get(name);
    }
}
