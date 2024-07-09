package az.edu.turing.service.Impl;

import az.edu.turing.dao.BookingDao;
import az.edu.turing.model.BookingDto;
import az.edu.turing.service.BookingInterface;

import java.util.List;

public class BookingService implements BookingInterface {

    private final BookingDao bookingDao;

    public BookingService(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }


    @Override
    public List<BookingDto> findBookByPassengerName(String passengerName) {
        return null;
    }

    @Override
    public void cancelBooking(long id) {

    }

    @Override
    public void bookFlight(BookingDto bookingDto) {

    }
}
