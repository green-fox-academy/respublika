public class Test {
    public static void main(String[] args) {
        Aircraft aircraft1=new Aircraft("F35");
        Aircraft aircraft2=new Aircraft("F35");
        Aircraft aircraft3=new Aircraft("F35");
        Aircraft aircraft4=new Aircraft("F16");
        Aircraft aircraft5=new Aircraft("F16");
        Aircraft aircraft6=new Aircraft("G16");
        Aircraft aircraft7=new Aircraft("F16");

        aircraft6.getType();
        aircraft1.getType();

        Carrier carrier=new Carrier(2300, 10000);
        Carrier carrierEnemy=new Carrier(800, 4000);

        carrier.add(aircraft1);
        carrier.add(aircraft2);
        carrier.add(aircraft3);
        carrier.add(aircraft4);
        carrier.add(aircraft5);

        carrierEnemy.add(aircraft7);

        carrier.getStatus();
        carrier.fill();
        carrier.getStatus();
        carrierEnemy.getStatus();
        carrier.fight(carrierEnemy);
        carrier.getStatus();
        carrierEnemy.getStatus();
        carrierEnemy.fill();
        carrierEnemy.fight(carrier);
        carrierEnemy.getStatus();
        carrier.getStatus();
        carrier.fill();
        carrier.fight(carrierEnemy);
        carrier.getStatus();
        carrierEnemy.getStatus();
        //carrier.fill();
        //carrier.fight(carrierEnemy);
        //carrierEnemy.getStatus();

        carrier.add(aircraft6);
        carrier.getStatus();

        Carrier carrierFillTest=new Carrier(25, 100);
        //Carrier carrierFillTest=new Carrier(0, 100);
        carrierFillTest.add(aircraft1);
        carrierFillTest.add(aircraft4);
        carrierFillTest.add(aircraft5);
        carrierFillTest.add(aircraft2);
        carrierFillTest.getStatus();
        carrierFillTest.fill();
        carrierFillTest.getStatus();
        aircraft3.refill(6);

    }
}
