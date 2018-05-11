public class Helicopter extends Vehicle implements Flyable {

    public Helicopter () {
        super();
    }

    @Override
    public void land() {
        System.out.println("landing on the ground...");
    }

    @Override
    public void fly() {
        System.out.println("flying higher...");
    }

    @Override
    public void takeOff() {
        System.out.println("taking off slowly...");
    }
}
