import java.util.List;

public class Theatre {
    public List<Screen> screens;
    public List<Show> shows;
    public City city;
    public int id;

    public Theatre(List<Screen> screens, List<Show> shows, City city, int id) {
        this.screens = screens;
        this.shows = shows;
        this.city = city;
        this.id = id;
    }
}
