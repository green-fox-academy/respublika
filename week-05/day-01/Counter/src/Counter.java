public class Counter {
    int number;
    int initialNumber;

    public Counter() {
        this.number=0;
        this.initialNumber=0;
    }

    public Counter(int number) {
        this.number=number;
        this.initialNumber=number;
    }

    public void add() {
        this.number+=1;
    }

    public void add(int addNum) {
        this.number+=addNum;
    }

    public int get() {
        return this.number;
    }

    public void reset() {
        this.number=initialNumber;
    }
}




