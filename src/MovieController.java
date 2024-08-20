import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieController {
    HashMap<City, List<Movie>> cityMovieMap;
    List<Movie> movieList;

    public MovieController() {
        cityMovieMap = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie) {
        if(cityMovieMap.containsKey(city)) {
            cityMovieMap.get(city).add(movie);
        }
        else {
            List<Movie> movieList = new ArrayList<>();
            movieList.add(movie);
            cityMovieMap.put(city, movieList);
        }
        movieList.add(movie);
    }

    //Other CRUD operations
}
