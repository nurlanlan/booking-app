package az.edu.turing.contreller;

import az.edu.turing.dao.BookingDao;
import az.edu.turing.model.FlightDto;
import az.edu.turing.service.Impl.FlightService;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FlightController {

    public FlightService flightService;

    public List<FlightDto> findFlightsFromKievIn24Hours(String location, LocalDateTime dateTime) {
        return flightService.findFlightsFromKievIn24Hours(location, dateTime);
    }

    public Optional<FlightDto> findFlightById(long id) {
        return flightService.findFlightById(id);
    }

    public List<FlightDto> getFlightDetailsByFLightId(long id) {
        return flightService.getFlightDetailsByFLightId(id);
    }

    public void createFlight(FlightDto flightDto) {
        flightService.createFlight(flightDto);
    }

    public List<FlightDto> getFlightsByDetails(String destination, LocalDateTime dateTime, int seats) {
        return flightService.getFlightsByDetails(destination, dateTime, seats);
    }

    public Collection<FlightDto> getAllFlights() {
        return flightService.getAllFlights();
    }
}
