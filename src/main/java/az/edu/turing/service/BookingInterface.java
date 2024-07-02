package az.edu.turing.service;

import az.edu.turing.model.BookingDto;

import java.util.List;

public interface BookingInterface {
    List<BookingDto> findBookByPassengerName(String passengerName);

    void cancelBooking(long id);

    void bookFlight(BookingDto bookingDto);

}
