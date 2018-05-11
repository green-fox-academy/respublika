package main.java.animals;

public class Reptile extends Animal {
    int levelOfDisgustFromIt;
    boolean hasLegs;


    public Reptile(String animalName, int animalAge, String animalGender, int animalLegs, String animalFood, int levelOfDisgustFromIt) {
        super(animalName, animalAge, animalGender, animalLegs, animalFood);
        this.animalHowToBreed="laying eggs";
        this.levelOfDisgustFromIt=levelOfDisgustFromIt;
        if (this.animalLegs==0) {hasLegs=false;} else {hasLegs=true;}
    }

    @Override
    public String move() {
        if (hasLegs == true) {
            return "Walking...";
        } else {
            return "Slithering...";
        }
    }
}
