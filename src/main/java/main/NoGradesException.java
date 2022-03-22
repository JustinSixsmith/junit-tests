package main;

public class NoGradesException extends RuntimeException {
    public NoGradesException(String message) {
        super(message);
    }

    public NoGradesException(Throwable cause) {
        super(cause);
    }
}
