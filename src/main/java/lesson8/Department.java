package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;

        public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }

    public void addInstructor() {
    }

    public void removeInstructor() {
    }

    public void getInstructor() {
    }

    public void getAllInstructor() {
    }

    List<Course > courseList = new ArrayList<>();

    @Override
    public String toString() {
        return "Department: " + departmentName;
    }
}
