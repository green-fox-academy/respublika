

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            Reservation reservation=new Reservation();
            reservation.getCodeBooking();
            reservation.getDowBooking();

            reservation.printReservation();
        }



    }
}
