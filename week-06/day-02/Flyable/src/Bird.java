
public class Bird extends Animal implements Flyable {

    public Bird(String animalName, int animalAge, String animalGender, int animalLegs, String animalFood) {
        super(animalName, animalAge, animalGender, animalLegs, animalFood);
        this.animalHowToBreed="laying eggs";
    }

    @Override
    public void land() {
        System.out.println("landing on a tree...");
    }

    @Override
    public void fly() {
        System.out.println("flying high...");
    }

    @Override
    public void takeOff() {
        System.out.println("taking off fast...");
    }
}

