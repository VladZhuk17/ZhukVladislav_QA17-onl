package lesson8;

public class Student {
    private String studentName;
    private String secondName;
    private int studentID;
    protected String courses;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }



    public Student(String studentName, String secondName, int studentID ) {
        this.studentName = studentName;
        this.secondName = secondName;
        this.studentID = studentID;

    }

    @Override
    public String toString() {
        return "Student: " + studentName + " " + secondName + ", studentID = " + studentID;
    }

}