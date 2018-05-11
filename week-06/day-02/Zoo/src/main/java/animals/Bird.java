package main.java.animals;

public class Bird extends Animal {
    boolean canFly;

    public Bird(String animalName, int animalAge, String animalGender, int animalLegs, String animalFood, boolean canFly) {
        super(animalName, animalAge, animalGender, animalLegs, animalFood);
        this.animalHowToBreed="laying eggs";
        this.canFly=canFly;
    }

    @Override
    public String move() {
        if (canFly == true) {
            return "Flying...";
        } else {
            return "It's just walking :(";
        }
    }
}
