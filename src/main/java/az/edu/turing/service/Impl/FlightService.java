package az.edu.turing.service.Impl;

import az.edu.turing.dao.FlightDao;
import az.edu.turing.model.FlightDto;
import az.edu.turing.service.FlightInterface;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FlightService implements FlightInterface {

    FlightDao flightDao;

    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public List<FlightDto> findFlightsFromKievIn24Hours(String location, LocalDateTime dateTime) {
        return null;
    }

    @Override
    public Optional<FlightDto> findFlightById(long id) {
        return Optional.empty();
    }

    @Override
    public List<FlightDto> getFlightDetailsByFLightId(long id) {
        return null;
    }

    @Override
    public void createFlight(FlightDto flightDto) {

    }

    @Override
    public List<FlightDto> getFlightsByDetails(String destination, LocalDateTime dateTime, int seats) {
        return null;
    }

    @Override
    public Collection<FlightDto> getAllFlights() {
        return null;
    }
}
