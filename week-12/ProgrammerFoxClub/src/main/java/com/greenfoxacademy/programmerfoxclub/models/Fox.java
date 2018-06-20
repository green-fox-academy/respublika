package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;

public class Fox {
    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food="salad";
        this.drink="water";
        this.tricks=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public boolean knownTricks() {
        boolean b;
        if (tricks.size()==0) {
            b=false;
        } else {
            b=true;
        }
        return b;
    }

    public void addTrick(String trick) {
        this.tricks.add(trick);
    }


}
