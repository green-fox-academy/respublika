import java.util.ArrayList;

public class Carrier {
    public ArrayList<Aircraft> aircrafts;
    public int ammoStorage;
    public int healthPoint;

    public Carrier(int ammoStorage, int healthPoint) {
        this.aircrafts = new ArrayList<>();
        this.ammoStorage = ammoStorage;
        this.healthPoint=healthPoint;
    }

    public void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public void fill() {
        if (ammoStorage==0) {
            System.out.println("Ammo Storage is empty.");
        } else {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority(aircraft) == true) {
                    ammoStorage = aircraft.refill(ammoStorage);
                }
            }
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority(aircraft) == false) {
                    ammoStorage = aircraft.refill(ammoStorage);
                }
            }
        }
    }

    public void fight(Carrier carrierEnemy) {
        if (carrierEnemy.healthPoint>0) {
            for (Aircraft aircraft : aircrafts) {
                carrierEnemy.healthPoint -= aircraft.fight();
            }
        }
        if (carrierEnemy.healthPoint<=0) {System.out.println("It's dead Jim :(");}
    }

    public void getStatus() {
        int totalDamage=0;
        for (Aircraft aircraft: aircrafts) {
            totalDamage+=aircraft.allDamage;
        }
        System.out.println("HP: " + this.healthPoint + ", Aircraft count: " + this.aircrafts.size() + ", Ammo Storage: " + this.ammoStorage + ", Total Damage: " + totalDamage);
        System.out.println("Aircrafts:");
        for (Aircraft aircraft: aircrafts) {
            aircraft.getStatus();
        }
    }
}





