package lesson8.Exceptions;

public class MentorNotFoundException extends Exception {

    String message;

    public MentorNotFoundException(String mentorName) {
        message = "преподавателя по имени " + mentorName + " нет";
    }

    @Override
    public String toString() {
        return "MentorNotFoundException {" +
                "message = " + message + '}';
    }
}