import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
    List<Ship> armada = new ArrayList<>();

    public Armada() {}

    public void fillArmada() {
        Random rand = new Random();
        int numberOfShips = rand.nextInt(10)+1;
        for (int i = 1; i <=numberOfShips ; i++) {
            this.armada.add(new Ship());
        }
        for (int i = 0; i <=this.armada.size()-1 ; i++) {
            this.armada.get(i).fillShip();
        }
    }

    public boolean war(Armada otherArmada) {
        int battleCount;
        if (this.armada.size()>otherArmada.armada.size()) {
            battleCount=otherArmada.armada.size();
        } else {
            battleCount=this.armada.size();
        }
        for (int i = 0; i <=battleCount-1 ; i++) {
            this.armada.get(i).battle(otherArmada.armada.get(i));
        }
        if (this.armada.size()>otherArmada.armada.size()) {
            return true;
        } else {return false;}
    }

}

