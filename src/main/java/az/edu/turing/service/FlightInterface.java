package az.edu.turing.service;

import az.edu.turing.model.FlightDto;

import java.util.Collection;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;

public interface FlightInterface {
    List<FlightDto> findFlightsFromKievIn24Hours(String location, LocalDateTime dateTime);

    Optional<FlightDto> findFlightById(long id);

    List<FlightDto> getFlightDetailsByFLightId(long id);

    void createFlight(FlightDto flightDto);

    List<FlightDto> getFlightsByDetails(String destination, LocalDateTime dateTime, int seats);

    Collection<FlightDto> getAllFlights();

}
