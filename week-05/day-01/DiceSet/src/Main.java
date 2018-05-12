public class Main {
    public static void main(String[] args) {
        DiceSet diceSet6 = new DiceSet(6);
        diceSet6.roll();
        diceSet6.getCurrent();
        System.out.println("----------------");
        diceSet6.reroll();
        diceSet6.getCurrent();
        System.out.println("----------------");
        rollUntilAll6(diceSet6);
        diceSet6.getCurrent();
    }

    public static void rollUntilAll6(DiceSet set) {
        for (int i = 0; i <= set.numberOfDices-1; i++) {
            while (set.getOneDice(i).getCurrent()<6) {
                set.getOneDice(i).roll();
            }
        }
    }
}
