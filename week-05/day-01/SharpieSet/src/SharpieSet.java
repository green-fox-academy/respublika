import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public static void main(String[] args) {
        List<Sharpie> sharpieSet = new ArrayList<>();
        sharpieSet.add(new Sharpie("green", 25));
        sharpieSet.add(new Sharpie("blue", 35));
        sharpieSet.add(new Sharpie("red", 12));
        sharpieSet.add(new Sharpie("yellow", 30));

        sharpieSet.get(2).use(100);

        System.out.println(countUsable(sharpieSet));
        System.out.println(sharpieSet.size());
        removeTrash(sharpieSet);
        System.out.println(sharpieSet.size());
    }

    public static int countUsable(List<Sharpie> list) {
        int count=0;
        for (int i = 0; i <=list.size()-1; i++) {
            if (list.get(i).inkAmount>0) {
                count+=1;
            }
        }
        return count;
    }

    public static void removeTrash(List<Sharpie> list) {
        for (int i = 0; i <=list.size()-1; i++) {
            if (list.get(i).inkAmount==0) {
                list.remove(i);
            }
        }
    }


}



