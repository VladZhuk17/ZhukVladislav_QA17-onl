package lesson8;

import lesson8.Exceptions.MentorNotFoundException;
import lesson8.Exceptions.StudentNotFoundException;

import java.util.ArrayList;

public class University {

    private String universityName;
    private String address;
    private int phoneNumber;

    private ArrayList<Department> departmentList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();

    public University(String universityName, String address, int phoneNumber) {
        this.universityName = universityName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addStudent(Student student, Department department) {
        student.setDepartment(department);
        studentList.add(student);
    }

    public void removeStudent(String studentName) {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).getStudentName().equals(studentName);
            studentList.remove(studentList.get(i));
            break;
        }
    }

    public Student getStudent(int studentID) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == studentID) {
                return studentList.get(i);
            }
        }
        return null;
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void removeDepartment(String departmentName) {
        for (int i = 0; i < departmentList.size(); ) {
            if (departmentList.get(i).getDepartmentName().equals(departmentName)) {
                departmentList.remove(departmentList.get(i));
            }
            break;
        }
    }

    public Department getDepartment(int departmentID) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDepartmentID() == (departmentID)) {
                return departmentList.get(i);
            }
        }
        return null;
    }

    public ArrayList getAllDepartments(ArrayList departmentList) {
        return departmentList;
    }

    public Student getStudentByNameAndNameHisInstructorName(String studentName, String instructorName) throws StudentNotFoundException {
        Department department = null;
        ArrayList<Student> lookingForStudentList = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getStudentName().equals(studentName)) {
                lookingForStudentList.add(student);
            }
        }
        for (int i = 0; i < getDepartmentList().size(); i++) {
            department = departmentList.get(i);
            ArrayList<Instructor> instructorList = department.getInstructorList();
            try {
                for (Instructor instructor : instructorList) {
                    if (instructor.getInstructorName().equals(instructorName)) {
                        department = departmentList.get(i);
                        break;
                    } else throw new MentorNotFoundException(instructorName);
                }
            } catch (MentorNotFoundException mnfe) {
                System.out.println(mnfe.getMessage());
            }
        }
        try {
            for (Student student : lookingForStudentList) {
                if (student.getDepartment().equals(department) &&
                        student.getStudentName().equals(studentName)) {
                    return student;
                } else throw new StudentNotFoundException();
            }
        } catch (StudentNotFoundException snfe) {
            System.out.println(snfe.getMessage());
        }
        return null;
    }
}