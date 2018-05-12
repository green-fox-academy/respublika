
public class WarApp {
    public static void main(String[] args) {
        Armada armada1=new Armada();
        Armada armada2=new Armada();

        armada1.fillArmada();
        armada2.fillArmada();

        System.out.println(armada1.armada.size());
        System.out.println(armada2.armada.size());
        System.out.println(armada1.war(armada2));
    }
}
