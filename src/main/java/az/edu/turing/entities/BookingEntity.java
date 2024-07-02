package az.edu.turing.entities;

import java.util.List;
import java.util.Objects;

public class BookingEntity {
    private long id;
    private long flightId;
    private List<String> passengerName;

    public BookingEntity(long id, long flightId, List<String> passengerName) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return id == that.id && flightId == that.flightId && Objects.equals(passengerName, that.passengerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flightId, passengerName);
    }
}
