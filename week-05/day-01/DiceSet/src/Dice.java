import java.util.Random;

public class Dice {
    int currentNumber;

    public Dice() {}

    public void roll() {
        Random rand = new Random();
        this.currentNumber = rand.nextInt(6)+1;
    }

    public int getCurrent() {
        return this.currentNumber;
    }

    public void reroll() {
        this.roll();
    }
}


