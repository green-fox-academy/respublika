import main.java.animals.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 3, "M", 4, "frogs", 5);
        Mammal mammal = new Mammal("Koala", 5, "F", 4, "eucalyptus", true);
        Bird bird = new Bird("Parrot", 1, "M", 2, "seeds", true);

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}

