package lesson8;

import lesson8.Exceptions.FirstException;
import lesson8.Utils.UtilMethods;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        University university1 = new University("Полоцкий государственный университет", "г.Полоцк, ул. Блохина, 29", 80553535);

        Student student1 = new Student("Vladimir", "Centrov", UtilMethods.randomStudentID());
        Student student2 = new Student("Misha", "Pravkov", UtilMethods.randomStudentID());
        Student student3 = new Student("Sasha", "Levkov", UtilMethods.randomStudentID());

        university1.studentList.add(student1);
        university1.studentList.add(student2);
        university1.studentList.add(student3);

        System.out.println(university1.studentList.toString());
        System.out.println(university1.studentList.get(2));

        List<Department> departmentList = new ArrayList<>();
        Department department1 = new Department("Engineering and technology");
        Department department2 = new Department("Information technology");
        Department department3 = new Department("law faculty");

        university1.departmentList.add(department1);
        university1.departmentList.add(department2);
        university1.departmentList.add(department3);
        System.out.println(university1.departmentList.toString());

        List <Course> courseList= new ArrayList<>();
        Course course1 = new Course("Math", UtilMethods.randomCourseID(), "Andrey Malahov");
        Course course2 = new Course("informatics", UtilMethods.randomCourseID(), "Gosha Kutsenko");
        Course course3 = new Course("Jurisprudence", UtilMethods.randomCourseID(), "Alexsey Navalny");
        department1.courseList.add(course1);
        department2.courseList.add(course2);
        department3.courseList.add(course3);

        System.out.println();
        System.out.println(university1.departmentList.get(1));
        System.out.println(department1.courseList.get(0));

        }
}
