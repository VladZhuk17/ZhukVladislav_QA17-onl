package lesson8.Exceptions;

public class StudentNotFoundException extends Exception {

    String message = "Такой студент здесь не учится";

    @Override
    public String getMessage() {
        return message;
    }
}

