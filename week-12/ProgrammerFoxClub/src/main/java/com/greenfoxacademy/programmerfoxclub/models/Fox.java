package com.greenfoxacademy.programmerfoxclub.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foxId;
    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;
    @Lob
    @Column(name = "actions", length = 512)
    private ArrayList<String> actions;
    private String picture;
    private String currentTrick;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCurrentTrick() {
        return currentTrick;
    }

    public void setCurrentTrick(String currentTrick) {
        this.currentTrick = currentTrick;
    }

    public ArrayList<String> getActions() {
        return actions;
    }

    public void setActions(ArrayList<String> actions) {
        this.actions = actions;
    }

    public Long getFoxId() {
        return foxId;
    }

    public void setFoxId(Long foxId) {
        this.foxId = foxId;
    }

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
        this.tricks = new ArrayList<>();
        this.actions = new ArrayList<>();
        this.picture = "/greenfox.png";
        this.currentTrick = "do nothing";
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

    public boolean knowTricks() {
        boolean b;
        if (tricks.size() == 0) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public boolean hasActions() {
        boolean b;
        if (actions.size() == 0) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public void addTrick(String trick) {
        if (!this.tricks.contains(trick)) {
            this.tricks.add(trick);
        }
    }

    public void addAction(String item, String action) {
        if (!this.drink.equals(item) && action == "drink") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date) + " : Drink has been changed from:" + this.drink + " to:" + item);
        }
        if (!this.food.equals(item) && action == "food") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date) + " : Food has been changed from:" + this.food + " to:" + item);
        }
        if (!this.tricks.contains(item) && action == "trick") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date) + " : Learned to:" + item);
        }
    }
}
