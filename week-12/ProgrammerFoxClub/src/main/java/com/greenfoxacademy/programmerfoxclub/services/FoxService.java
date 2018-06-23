package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FoxService {
    private HashMap<String, Fox> foxes;
    private ArrayList<String> tricks=new ArrayList<>();
    private ArrayList<String> foods=new ArrayList<>();
    private ArrayList<String> drinks=new ArrayList<>();
    private HashMap<String, String> trickPictures;

    public String choosePicture(String trick) {
        return this.trickPictures.get(trick);
    }

    public ArrayList<String> getMainTricks(Fox fox) {
        ArrayList<String> currentTricks=new ArrayList<>();
        for (String tr:this.tricks) {
            if (!fox.getTricks().contains(tr)) {
                currentTricks.add(tr);
            }
        }
        return currentTricks;
    }

    public boolean hasTrickToLearn(Fox fox) {
        ArrayList<String> currentTricks=new ArrayList<>();
        boolean hasTrick=false;
        for (String tr:this.tricks) {
            if (!fox.getTricks().contains(tr)) {
                currentTricks.add(tr);
            }
        }
        if (currentTricks.size()>0) {
            hasTrick=true;
        }
        return hasTrick;
    }

    public ArrayList<String> getMainFoods(Fox fox) {
        ArrayList<String> currentFoods=new ArrayList<>();
        for (String f:this.foods) {
            if (!fox.getFood().equals(f)) {
                currentFoods.add(f);
            }
        }
        return currentFoods;
    }

    public ArrayList<String> getMainDrinks(Fox fox) {
        ArrayList<String> currentDrinks=new ArrayList<>();
        for (String d:this.drinks) {
            if (!fox.getDrink().equals(d)) {
                currentDrinks.add(d);
            }
        }
        return currentDrinks;
    }

    public FoxService(){
        this.foxes=new HashMap<>();
        this.tricks.add("write HTML");
        this.tricks.add("code Java");
        this.tricks.add("play with CSS");
        this.tricks.add("work with Thymeleaf");
        this.foods.add("pizza");
        this.foods.add("cheese");
        this.foods.add("salad");
        this.foods.add("cake");
        this.drinks.add("cola");
        this.drinks.add("wine");
        this.drinks.add("water");
        this.drinks.add("coffee");
        this.trickPictures=new HashMap<>();
        this.trickPictures.put("do nothing", "/greenfox.png");
        this.trickPictures.put("write HTML", "/fox-html.gif");
        this.trickPictures.put("code Java", "/fox-java.gif");
        this.trickPictures.put("play with CSS", "/fox-css.gif");
        this.trickPictures.put("work with Thymeleaf", "/fox-thymeleaf.gif");
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