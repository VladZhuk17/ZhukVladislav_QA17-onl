package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private int courseID;
    private String instructor;

    public Course(String courseName, int courseID, String instructor) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Course:  " + courseName + ", courseID = " + courseID+", instructor: "+ instructor;
    }
}

