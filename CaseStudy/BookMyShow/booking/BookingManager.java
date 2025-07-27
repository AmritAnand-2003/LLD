package BookMyShow.booking;

import BookMyShow.users.Person;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;

import BookMyShow.enums.BookingStatus;
import BookMyShow.booking.BookingManager;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class BookingManager {
    HashMap<Integer, Booking> bookingHashMap;

    public static BookingManager instance;
    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public Booking createBooking(Show show, List<ShowSeat> seatList, Person person) {
        Booking booking = new Booking();
        booking.setShow(show);
        int id = bookingHashMap.size() + 1;
        booking.setBookingId(id);
        booking.setSeatList(seatList);
        booking.setUser(person);
        booking.setCreatedAt(new Date());
        booking.setBookingStatus(BookingStatus.PENDING);

        bookingHashMap.put(id, booking);
        System.out.println("Booking created with ID: " + id + " " + "Show name is: " + show.getMovie().getTitle());
        return booking;
    }
}
