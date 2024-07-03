package az.edu.turing.service.Impl;

import az.edu.turing.model.BookingDto;
import az.edu.turing.service.BookingInterface;

import java.util.List;

public class BookingService implements BookingInterface {

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
