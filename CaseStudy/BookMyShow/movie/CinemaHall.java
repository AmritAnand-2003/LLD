package BookMyShow.movie;
import BookMyShow.movie.ShowSeat;

import java.util.List; 
import java.util.ArrayList;
public class CinemaHall {
    String name;
    int cinemaHallId;
    
    List<ShowSeat> showSeats;
    List<Show> shows;

    public CinemaHall(String name, int cinemaHallId) {
        this.name = name;
        this.cinemaHallId = cinemaHallId;
        showSeats = new ArrayList<>();
        shows = new ArrayList<>();
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
