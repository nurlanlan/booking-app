package az.edu.turing.util;

import az.edu.turing.contreller.BookingController;
import az.edu.turing.contreller.FlightController;
import az.edu.turing.dao.BookingDao;
import az.edu.turing.dao.FlightDao;
import az.edu.turing.dao.Impl.BookingDaoImpl;
import az.edu.turing.dao.Impl.FlightDaoImpl;
import az.edu.turing.exception.InvalidMenuActionException;
import az.edu.turing.model.FlightDto;
import az.edu.turing.service.Impl.BookingService;
import az.edu.turing.service.Impl.FlightService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtil {

    FlightDao flightDao = new FlightDaoImpl(new ObjectMapper().registerModule(new JavaTimeModule()));
    FlightService flightService = new FlightService(flightDao);
    FlightController flightController = new FlightController(flightService);

    BookingDao bookingDao = new BookingDaoImpl(new ObjectMapper().registerModule(new JavaTimeModule()));
    BookingService bookingService = new BookingService(bookingDao);
    BookingController bookingController = new BookingController(bookingService);

    public void displayMainMenu() {
        System.out.println("---Main Menu---\n" +
                "1. Online-board\n" +
                "2. Show flight info\n" +
                "3. Search and book a flight\n" +
                "4. Cancel booking\n" +
                "5. My flights\n" +
                "6. Exit\n" +
                "Enter your choice: ");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            displayMainMenu();
            String input = scanner.nextLine();
            choice = Integer.parseInt(input);
            try {
                switch (choice) {
                    case 1:
                        findFlightsFromKievIn24Hours();
                        break;
                    case 2:
                        getFlightDetailsByFLightId();
                        break;
                    case 3:
                        getFlightsByDetails();
                        break;
                    case 4:
                        cancelBooking();
                        break;
                    case 5:
                        findBookByPassengerName();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        throw new InvalidMenuActionException("Invalid choice! Please enter a valid action");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input! Please enter a valid action.");
                scanner.nextLine();
            }
        } while (choice != 6);
        scanner.close();
    }

    public void findFlightsFromKievIn24Hours() {
    }

    public void getFlightDetailsByFLightId() {
    }

    private void getFlightsByDetails() {
    }

    private void cancelBooking() {
    }

    private void findBookByPassengerName() {
    }
}
