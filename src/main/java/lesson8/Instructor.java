package lesson8;

public class Instructor {

    private String instructorName;
    private String courseName;

    public Instructor(String instructorName, String courseName){
        this.instructorName=instructorName;
        this.courseName=courseName;
    }

    public String getInstructorName(){
       return instructorName;
    }
    public void setInstructorName(String instructorName){
        this.instructorName=instructorName;
    }
    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public void teach(){}

}