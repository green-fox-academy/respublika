package main.java.animals;

public abstract class Animal implements Moving{
    String animalName;
    int animalAge;
    String animalGender;
    int animalLegs;
    String animalFood;
    String animalHowToBreed;

    public Animal(String animalName, int animalAge, String animalGender, int animalLegs, String animalFood) {
        this.animalName=animalName;
        this.animalAge=animalAge;
        this.animalGender=animalGender;
        this.animalLegs=animalLegs;
        this.animalFood=animalFood;
        this.animalHowToBreed="breed somehow";
    }

    public String getName() {
        return animalName;
    }

    public String breed() {
        return animalHowToBreed;
    }

    public void eat() {
        System.out.println("eating " + animalFood);
    }

}

