package main.java.animals;

public class Mammal extends Animal {
    boolean isItCute;

    public Mammal(String animalName, int animalAge, String animalGender, int animalLegs, String animalFood, boolean isItCute) {
        super(animalName, animalAge, animalGender, animalLegs, animalFood);
        this.animalHowToBreed="pushing miniature versions out";
        this.isItCute=isItCute;
    }

    @Override
    public String move() {
        return "Walking...";
    }
}
