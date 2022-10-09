package lesson8.Exceptions;

public class StudentNotFoundException extends Exception {

    String message = "Такой студент здесь не учится";

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "StudentNotFoundException{" +
                "message = '" + message + '\'' +
                '}';
    }
}