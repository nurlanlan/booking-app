package az.edu.turing.contreller;

import az.edu.turing.model.BookingDto;
import az.edu.turing.service.Impl.BookingService;

import java.util.List;

public class BookingController {
    public BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void cancelBooking(long id) {
        bookingService.cancelBooking(id);
    }

    public void bookFlight(BookingDto bookingDto) {
        bookingService.bookFlight(bookingDto);
    }

    public List<BookingDto> findBookByPassengerName(String passengerName) {
        return bookingService.findBookByPassengerName(passengerName);
    }
}
