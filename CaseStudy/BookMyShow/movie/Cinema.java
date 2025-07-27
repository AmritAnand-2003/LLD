package BookMyShow.movie;
import java.util.List;
import java.util.ArrayList;

public class Cinema {
    String name;

    List<CinemaHall> cinemaHalls;

    public Cinema(String name) {
        this.name = name;
        cinemaHalls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CinemaHall> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(List<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }
}
