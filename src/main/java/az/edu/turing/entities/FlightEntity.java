package az.edu.turing.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightEntity {
    private long flightId;
    private String location;
    private String destination;
    private LocalDateTime flightDateTime;
    private int seatsAvaliable;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightEntity that = (FlightEntity) o;
        return flightId == that.flightId && seatsAvaliable == that.seatsAvaliable && Objects.equals(location, that.location) && Objects.equals(destination, that.destination) && Objects.equals(flightDateTime, that.flightDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, location, destination, flightDateTime, seatsAvaliable);
    }
}
