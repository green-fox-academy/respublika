import java.util.ArrayList;

public class FindFox {
    public static void main(String[] args) {
        ArrayList<Fox> foxList = new ArrayList<>(6);

        Fox fox1= new Fox("Foxy", "pallida", "brown");
        Fox fox2= new Fox("Foxly", "red", "green");
        Fox fox3= new Fox("Steve", "african", "green");
        Fox fox4= new Fox("Greengo", "pallida", "green");
        Fox fox5= new Fox("Pete", "african", "white");
        Fox fox6= new Fox("Max", "red", "red");

        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);
        foxList.add(fox6);

        foxList.stream()
                .filter(f -> f.color=="green")
                .forEach(f -> System.out.println(f.name));

        System.out.println("----------------------------");

        foxList.stream()
                .filter(f -> f.color=="green" && f.type=="pallida")
                .forEach(f -> System.out.println(f.name));

    }
}
