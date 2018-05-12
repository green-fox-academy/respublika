public class Main {
    public static void main(String[] args) {
        Farm farm=new Farm(4);
        farm.breed();
        farm.breed();

        System.out.println(farm.farm.size());
        System.out.println("------------------");

        farm.breed();
        farm.breed();

        System.out.println(farm.farm.size());
        System.out.println("------------------");

        for (int i = 0; i <= farm.farm.size()-1 ; i++) {
            System.out.println(farm.farm.get(i).hunger);
        }

        System.out.println("------------------");

        farm.farm.get(2).eat();
        farm.farm.get(2).eat();
        farm.farm.get(2).eat();

        for (int i = 0; i <= farm.farm.size()-1 ; i++) {
            System.out.println(farm.farm.get(i).hunger);
        }
        System.out.println("------------------");

        farm.slaughter();

        for (int i = 0; i <= farm.farm.size()-1 ; i++) {
            System.out.println(farm.farm.get(i).hunger);
        }

    }
}
