public class Station {
    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount=gasAmount;
    }

    public void refill(Car car) {
        if (car.capacity>car.gasAmount) {
            this.gasAmount -= (car.capacity - car.gasAmount);
            car.gasAmount = 100;
        }
    }
}

