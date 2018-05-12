import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slot;
    List<Animal> farm=new ArrayList<>();

    public Farm(int slot) {
        this.slot=slot;
    }

    public void breed() {
        if (this.farm.size()<this.slot) {
            this.farm.add(new Animal());
        }
    }

    public void slaughter() {
        int removeIndex=0;
        for (int i = 1; i <=this.farm.size()-1; i++) {
            if (this.farm.get(i-1).hunger>this.farm.get(i).hunger) {
                removeIndex=i;
            }
        }
        this.farm.remove(removeIndex);
    }

}

