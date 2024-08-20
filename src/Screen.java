import java.util.List;

public class Screen {
    public int screenId;
    public List<Seat> seats;

    public Screen(int screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }
}
