
import java.util.Random;

public class Reservation implements Reservationy {
    String dow;
    String code;

    @Override
    public String getDowBooking() {
        String[] days=new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Random rand = new Random();
        int selectDow = rand.nextInt(7);
        this.dow=days[selectDow];
        return this.dow;
    }

    @Override
    public String getCodeBooking() {
        Random r = new Random();
        String alphabet = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.code="";
        for (int i = 1; i <= 8; i++) {
            this.code+=alphabet.charAt(r.nextInt(alphabet.length()));
        }
    return this.code;
    }

    public void printReservation() {
        System.out.println("Booking# "+ code + " for " + dow);
    }
}
