package az.edu.turing.dao.Impl;

import az.edu.turing.dao.FlightDao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class FlightDaoImpl extends FlightDao {
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
