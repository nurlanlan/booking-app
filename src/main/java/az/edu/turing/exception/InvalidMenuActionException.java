package az.edu.turing.exception;

public class InvalidMenuActionException extends RuntimeException {
    public InvalidMenuActionException(String message) {
        super(message);

    }
    String value = "Invalid choice! Please enter a valid action";

    public String getMenuException() {
        return value;
    }

}
