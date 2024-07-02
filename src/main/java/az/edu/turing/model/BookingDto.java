package az.edu.turing.model;

import java.util.List;

public class BookingDto {
    private long id;
    private long flightId;
    private List<String> passengerName;

    public BookingDto(long id, long flightId, List<String> passengerName) {
        this.id = id;
        this.flightId = flightId;
        this.passengerName = passengerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public List<String> getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(List<String> passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public String toString() {
        return "BookingEntity{" +
                "id=" + id +
                ", flightId=" + flightId +
                ", passengerName=" + passengerName +
                '}';
    }
}
