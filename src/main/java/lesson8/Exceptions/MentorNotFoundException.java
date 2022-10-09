package lesson8.Exceptions;

import lesson8.Instructor;

public class MentorNotFoundException extends Exception {

    String message;

    public MentorNotFoundException(String InstructorName) {
        message = "преподавателя по имени " + InstructorName + " нет";
    }

    @Override
    public String toString() {
        return "MentorNotFoundException {" +
                "message = " + message + '}';
    }
}