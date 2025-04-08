package com.epam.mjc;

public class StudentException extends IllegalArgumentException{
    public StudentException() {
    }

    public StudentException(long id) {
        super("Could not find student with ID " + id);
    }

    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentException(Throwable cause) {
        super(cause);
    }
}
