import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheatreController {
    public List<Theatre> allTheatres;
    HashMap<City,List<Theatre>> cityToTheatre;

    public TheatreController() {
        allTheatres = new ArrayList<>();
        cityToTheatre = new HashMap<>();
    }

    public void addTheatre(City city,Theatre theatre){
        if(cityToTheatre.containsKey(city)){
            cityToTheatre.get(city).add(theatre);
        }
        else {
            List<Theatre> theatres = new ArrayList<>();
            theatres.add(theatre);
            cityToTheatre.put(city,theatres);
        }
        allTheatres.add(theatre);
    }
}
