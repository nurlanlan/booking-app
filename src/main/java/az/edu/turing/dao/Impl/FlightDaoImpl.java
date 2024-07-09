package az.edu.turing.dao.Impl;

import az.edu.turing.dao.FlightDao;
import az.edu.turing.entities.FlightEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class FlightDaoImpl extends FlightDao {
    private static final String RESOURCE_PATH = "src/main/java/az/edu/turing/resource/";
    private static final String FLIGHTS_PATH_FILE = RESOURCE_PATH.concat("flights.bean");
    private final ObjectMapper objectMapper;

    public FlightDaoImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean save(Collection<FlightEntity> flights) {

        try {
            FileWriter fileWriter = new FileWriter(FLIGHTS_PATH_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(objectMapper.writeValueAsString(flights));
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error while saving to file" + e.getMessage());
        }
        return false;
    }

    @Override
    public Collection<FlightEntity> getAll() {
        try {
            FileReader fileReader = new FileReader(FLIGHTS_PATH_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String beanData = bufferedReader.readLine();
            if (beanData != null && !beanData.isEmpty()) {
                FlightEntity[] flights = objectMapper.readValue(beanData, FlightEntity[].class);
                bufferedReader.close();
                return Arrays.stream(flights).toList();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(("Cant be read" + e.getMessage()));
        }
        return new ArrayList<>();
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
