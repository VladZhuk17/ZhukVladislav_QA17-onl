package lesson8;

import lesson8.Utils.UtilMethods;

import java.util.Scanner;

public class Student {

    private Scanner scanner = new Scanner(System.in);

    private String studentName;
    private Department department;
    private int studentID;

    public Student() {
        System.out.println("Введите имя и фамилию студента: ");
        this.studentName = scanner.nextLine();
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student: " + studentName + ", ID = " + UtilMethods.randomPersonID();
    }
}