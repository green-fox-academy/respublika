public class Main {
    public static void main(String[] args) {
        Station station=new Station(5000);
        Car car=new Car();

        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
    }
}
