import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    public static TheatreController theatreController;
    public static MovieController movieController;

    public static void main(String[] args) {
        initialize();
        addMoviesAndShowsInTheatre();

        System.out.println("Hello world!");
    }

    public static void createBooking(City city, String movieName, int seatId) {
        // Logic to handle booking
    }

    public static void initialize() {
        theatreController = new TheatreController();
        movieController = new MovieController();
    }

    public static void addMoviesAndShowsInTheatre() {
        Movie movie1 = new Movie("DDLJ",1,3);
        Movie movie2 = new Movie("KABHI_KHUSHI_KABHI_GHAM",2,3);
        movieController.addMovie(City.Faridabad, movie1);
        movieController.addMovie(City.Faridabad, movie2);

        Screen screen1 = getScreen(1);
        Screen screen2 = getScreen(2);

        Show show1 = new Show(movie1, 1, 3, screen1);
        Show show2 = new Show(movie2, 2, 3, screen2);

        List<Screen> screenList = new ArrayList<>();
        screenList.add(screen1);
        screenList.add(screen2);

        List<Show> showList = new ArrayList<>();
        showList.add(show1);
        showList.add(show2);

        Theatre theatreFaridabad = new Theatre(screenList, showList, City.Faridabad, 1);
        theatreController.addTheatre(City.Faridabad, theatreFaridabad);
    }

    public static Screen getScreen(int screenId) {
        List<Seat> ss = new ArrayList<Seat>();
        for(int i=1;i<=30;i++) {
            Seat s;
            if(i/10 == 0) {
                s = new Seat(i,i,Category.SILVER);
            } else if (i/10 == 1) {
                s = new Seat(i,i,Category.GOLD);
            } else {
                s = new Seat(i,i,Category.PLATINUM);
            }
            ss.add(s);
        }
        return new Screen(screenId, ss);
    }
}