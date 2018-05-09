
public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    public int compareTo(Domino domino) {
        int result=0;
        if (this.getValues()[0]>domino.getValues()[0]) {
            result=1;
        }

        if (this.getValues()[0]<domino.getValues()[0]) {
            result=-1;
        }

        if (this.getValues()[0]==domino.getValues()[0]) {
            if (this.getValues()[1]>domino.getValues()[1]) {
                result=1;
            }

            if (this.getValues()[1]<domino.getValues()[1]) {
                result=-1;
            }

            if (this.getValues()[1]<domino.getValues()[1]) {
                result=0;
            }
        }
    return result;
    }
}