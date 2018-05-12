import java.util.Random;

public class Pirate {
    boolean drunk=false;
    boolean alive=true;
    boolean hasParrot=false;

    public Pirate() {
        this.drunk=false;
        this.alive=true;
        this.hasParrot=false;
    }


    public void drinkSomeRum() {
        if (this.alive==true) {
            this.drunk = true;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void  howsItGoingMate() {
        if (this.alive == true) {
            if (this.drunk == false) {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            } else {
                for (int i = 0; i <= 4; i++) {
                    System.out.println("Pour me anudder!");
                }
            }
        } else {
            System.out.println("He's dead.");
        }
    }

    public void dead() {
        if (this.alive == true) {
            this.alive = false;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void brawl (Pirate x) {
        if (this.alive==true && x.alive==true) {
            Random rand = new Random();
            int result = rand.nextInt(3)+1;
            if (result==1) {
                this.alive=false;
            }
            else if (result==2) {
                x.alive=false;
            }
            else {
                this.alive=false;
                x.alive=false;
            }
        } else {
            System.out.println("At least one of the pirates is already dead.");
        }
    }

    public void parrot() {
        if (this.alive == true) {
            this.hasParrot = true;
        } else {
            System.out.println("He's dead.");
        }
    }


}






