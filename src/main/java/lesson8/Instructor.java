package lesson8;

import lesson8.Utils.UtilMethods;

import java.util.Scanner;

public class Instructor {

    private Scanner scanner = new Scanner(System.in);

    private String instructorName;
    private int instructorID;

    public Instructor() {
        System.out.println("Введите имя и фамилию преподавателя: ");
        this.instructorName = scanner.next();
        this.instructorID = instructorID;
    }

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    @Override
    public String toString() {
        return " Instructor: " + instructorName + ", ID = "+ UtilMethods.randomPersonID();
    }
}
