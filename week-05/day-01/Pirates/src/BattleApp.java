public class BattleApp {
    public static void main(String[] args) {
        Ship ship1=new Ship();
        Ship ship2=new Ship();

        ship1.fillShip();
        ship2.fillShip();

        ship1.showShip();
        ship2.showShip();

        System.out.println("------------------");

        ship1.ship.get(0).drinkSomeRum();

        ship1.showShip();
        ship2.showShip();

        System.out.println("------------------");

        System.out.println(ship1.battle(ship2));

        ship1.showShip();
        ship2.showShip();

    }
}
