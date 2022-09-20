package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    private Scanner scanner = new Scanner(System.in);

    private String departmentName;
    private int departmentID;
    private ArrayList<Instructor> instructorList = new ArrayList<>();

    public Department() {
        System.out.println("Введите название факультета: ");
        this.departmentName = scanner.nextLine();
        this.departmentID = departmentID;
    }

    public ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void addInstructor(Instructor instructor) {
        instructorList.add(instructor);
    }

    public void removeInstructor(String instructorName) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getInstructorName().equals(instructorName)) {
                instructorList.remove(instructorList.get(i));
            }
            break;
        }
    }

    public Instructor getInstructor(int instructorID) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getInstructorName().equals(instructorID)) {
                return instructorList.get(i);
            }
        }
        return null;
    }

    public ArrayList getAllInstructors() {
        return instructorList;
    }

    @Override
    public String toString() {
        return "Department: " + departmentName;
    }
}