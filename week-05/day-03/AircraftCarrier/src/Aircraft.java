public class Aircraft {
    public String type;
    public int ammo;
    public int maxAmmo;
    public int baseDamage;
    public int allDamage;

    public Aircraft(String type) {
        this.type=type;
        this.ammo=0;
        if (type=="F16") {
            this.baseDamage=30;
            this.maxAmmo=8;
        }
        else if (type=="F35") {
            this.baseDamage=50;
            this.maxAmmo=12;
        }
        else {System.out.println("Wrong type");}
    }

    public int fight() {
        int printOutDamage=baseDamage*ammo;
        allDamage+=baseDamage*ammo;
        this.ammo=0;
        return printOutDamage;
    }

    public int refill(int ammoFill) {
        int ammoTake=this.maxAmmo-this.ammo;
        if (ammoTake<=ammoFill) {
            this.ammo+=ammoTake;
            int remain=ammoFill-ammoTake;
            return remain;
        } else {
            this.ammo+=ammoFill;
            int remain=0;
            return remain;
        }


    }

    public void getType() {
        System.out.println(this.type);
    }

    public void getStatus() {
        System.out.println("Type: " + this.type + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.allDamage);
    }

    public boolean isPriority(Aircraft aircraft) {
        boolean isPrior;
        if (aircraft.type=="F35") {isPrior=true;} else {isPrior=false;}
        return isPrior;
    }

}
