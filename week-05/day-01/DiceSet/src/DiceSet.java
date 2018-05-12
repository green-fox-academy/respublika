import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    List<Dice> diceSet = new ArrayList<>();
    int numberOfDices;

    public DiceSet(int howMany) {
        this.numberOfDices=howMany;
        for (int i = 1; i <=howMany; i++) {
            this.diceSet.add(new Dice());
        }
    }

    public void roll() {
        for (Dice d:diceSet) {
            d.roll();
        }
    }

    public void getCurrent() {
        for (Dice d:diceSet) {
            System.out.println(d.getCurrent());
        }
    }

    public void reroll() {
        for (Dice d:diceSet) {
            d.roll();
        }
    }

    public Dice getOneDice(int index) {
        return diceSet.get(index);
    }
}
