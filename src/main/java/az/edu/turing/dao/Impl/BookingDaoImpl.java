package az.edu.turing.dao.Impl;

import az.edu.turing.dao.BookingDao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class BookingDaoImpl extends BookingDao {

    private static final String RESOURCE_PATH = "src/main/java/az/edu/turing/resource/";
    private static final String BOOKING_FILE_PATH = RESOURCE_PATH.concat("bookings.bean");

    @Override
    public boolean save(Collection t) {
        return false;
    }

    @Override
    public Collection getAll() {
        return null;
    }

    @Override
    public void delete(long flightId) {

    }

    @Override
    public Optional findOneBy(Predicate predicate) {
        return Optional.empty();
    }

    @Override
    public Collection findAllBy(Predicate predicate) {
        return null;
    }
}
