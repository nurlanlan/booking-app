package az.edu.turing.model;

import java.time.LocalDateTime;

public class FlightDto {

    private long flightId;
    private String location;
    private String destination;
    private LocalDateTime flightDateTime;
    private int seatsAvaliable;

    public FlightDto(long flightId, String location, String destination, LocalDateTime flightDateTime, int seatsAvaliable) {
        this.flightId = flightId;
        this.location = location;
        this.destination = destination;
        this.flightDateTime = flightDateTime;
        this.seatsAvaliable = seatsAvaliable;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getFlightDateTime() {
        return flightDateTime;
    }

    public void setFlightDateTime(LocalDateTime flightDateTime) {
        this.flightDateTime = flightDateTime;
    }

    public int getSeatsAvaliable() {
        return seatsAvaliable;
    }

    public void setSeatsAvaliable(int seatsAvaliable) {
        this.seatsAvaliable = seatsAvaliable;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "flightId=" + flightId +
                ", location='" + location + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDateTime=" + flightDateTime +
                ", seatsAvaliable=" + seatsAvaliable +
                '}';
    }
}
