package BookMyShow.booking;

import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;
import BookMyShow.enums.BookingStatus;
import BookMyShow.users.Person;

import java.util.List;
import java.util.Date;

public class Booking {
    int bookingId;
    List<ShowSeat> seatList;

    Show show;
    BookingStatus bookingStatus;

    Person user;

    Date createdAt;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public List<ShowSeat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<ShowSeat> seatList) {
        this.seatList = seatList;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
