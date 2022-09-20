package lesson8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        University psu = new University("PSU", "address", 295123931);

        Department department1 = new Department();
        Department department2 = new Department();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        psu.addStudent(student1, department1);
        psu.addStudent(student2, department1);
        psu.addStudent(student3, department1);
        psu.addStudent(student4, department2);
        psu.addStudent(student5, department2);

        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor();
        Instructor instructor3 = new Instructor();

        department1.addInstructor(instructor1);
        department1.addInstructor(instructor2);
        department2.addInstructor(instructor3);

        System.out.println(psu.getStudentList());
        System.out.println(department1.getAllInstructors());

        LinkedHashMap<Student, ArrayList<Instructor>> map = new LinkedHashMap<>();
        map.put(student1, student1.getDepartment().getAllInstructors());
        map.put(student2, student2.getDepartment().getAllInstructors());
        map.put(student3, student3.getDepartment().getAllInstructors());
        map.put(student4, student4.getDepartment().getAllInstructors());
        map.put(student5, student5.getDepartment().getAllInstructors());
        for (Map.Entry<Student, ArrayList<Instructor>> entry : map.entrySet()) {
        System.out.println(entry);
        }
        System.out.println(map.get(student1));
        System.out.println(map.get(student2));
        System.out.println(map.get(student3));
     }
}