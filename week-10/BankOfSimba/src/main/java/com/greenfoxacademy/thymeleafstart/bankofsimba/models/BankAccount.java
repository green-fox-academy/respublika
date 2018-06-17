package com.greenfoxacademy.thymeleafstart.bankofsimba.models;


public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private String isKing;
    private String character;

    public BankAccount() {
    }

    public BankAccount(String name, Double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, Double balance, String animalType, String character) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.character = character;
    }

    public BankAccount(String name, Double balance, String animalType, String isKing, String character) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getIsKing() {
        return isKing;
    }

    public void setIsKing(String isKing) {
        this.isKing = isKing;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void raiseBalance() {
        if (this.isKing=="King") {
            this.balance+=100;
        } else {
            this.balance+=10;
        }
    }
}
