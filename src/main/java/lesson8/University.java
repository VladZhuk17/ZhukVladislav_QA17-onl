package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {

    Scanner scanner = new Scanner(System.in);
    private String universityName;
    private String address;
    private int phoneNumber;

    public University(String universityName, String address, int phoneNumber) {
        this.universityName = universityName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addStudent() {
    }


    public void removeStudent() {
    }

    public void getStudent(String studentName, String secondName) {
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerSecondName = new Scanner(System.in);
        studentName = scannerName.nextLine();
        secondName= scannerSecondName.nextLine();
    }

    public void addDepartment() {
    }

    public void removeDepartment() {
    }

    public void getDepartment() {
    }

    public void getAllDepartment() {
    }

    List<Department> departmentList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();

}
