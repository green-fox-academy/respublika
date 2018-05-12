import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> ship = new ArrayList<>();

    public Ship() {}

    public void fillShip() {
        Random rand = new Random();
        int numberOfPirates = rand.nextInt(20)+1;
        for (int i = 1; i <=numberOfPirates ; i++) {
            this.ship.add(new Pirate());
        }
    }

    public void showShip() {
        int count=0;
        String writeOutAlive;
        String writeOutDrunk;

        for (int i = 1; i <=this.ship.size()-1; i++) {
            if (this.ship.get(i).alive==true) {
                count+=1;
            }
        }
        if (this.ship.get(0).alive==true) {
            writeOutAlive="alive";
        } else {writeOutAlive="dead";}

        if (this.ship.get(0).drunk==true) {
            writeOutDrunk="consumed rum";
        } else {writeOutDrunk="didn't consume rum";}

        System.out.println("The captain " + writeOutDrunk + " and he's " + writeOutAlive + ".");
        System.out.println("The ship has " + count + " pirates.");
    }

    public boolean battle(Ship otherShip) {
        int score=0;
        int scoreOther=0;

        for (int i = 1; i <=this.ship.size()-1; i++) {
            if (this.ship.get(i).alive==true) {
                score+=1;
            }
        }

        for (int i = 1; i <=otherShip.ship.size()-1; i++) {
            if (otherShip.ship.get(i).alive==true) {
                scoreOther+=1;
            }
        }

        if (this.ship.get(0).drunk==true) {
            score-=1;
        }

        if (otherShip.ship.get(0).drunk==true) {
            scoreOther-=1;
        }

        if (score>scoreOther) {
            Random rand = new Random();
            int nbDrunk = rand.nextInt(this.ship.size());
            int nbDead = rand.nextInt(otherShip.ship.size());
            for (int i = 0; i <=nbDrunk ; i++) {
                this.ship.get(i).drinkSomeRum();
            }
            for (int i = 0; i <=nbDead ; i++) {
                otherShip.ship.get(i).dead();
            }
        }

        if (scoreOther>score) {
            Random rand = new Random();
            int nbDrunk = rand.nextInt(otherShip.ship.size());
            int nbDead = rand.nextInt(this.ship.size());
            for (int i = 0; i <=nbDrunk ; i++) {
                otherShip.ship.get(i).drinkSomeRum();
            }
            for (int i = 0; i <=nbDead ; i++) {
                this.ship.get(i).dead();
            }
        }

        if (score>scoreOther) {
            return true;
        } else {return false;}

    }

}

