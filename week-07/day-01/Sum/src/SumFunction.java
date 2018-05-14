import java.util.ArrayList;

public class SumFunction {

    public static int sumFunction(ArrayList<Integer> list) {
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)!=null) {
                count += list.get(i);
            }
        }
        return count;
    }

}