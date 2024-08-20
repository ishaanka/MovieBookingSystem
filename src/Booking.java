import java.util.List;

public class Booking {
    Show show;
    List<Seat> seats;
    Payment payment;

    public Booking(Show show, List<Seat> seats) {
        this.show = show;
        this.seats = seats;
        this.payment = new Payment();
    }
}
