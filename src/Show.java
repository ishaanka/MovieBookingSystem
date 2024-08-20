import java.util.ArrayList;
import java.util.List;

public class Show {
    public Movie movie;
    public int showId;
    public int startTime;
    public Screen screen;
    public List<Integer> seatIdsBooked;

    public Show(Movie movie, int showId, int startTime, Screen screen) {
        this.movie = movie;
        this.showId = showId;
        this.startTime = startTime;
        this.screen = screen;
        this.seatIdsBooked = new ArrayList<>();
    }
}
