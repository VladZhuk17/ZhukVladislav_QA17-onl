package lesson8;

public class Main {
    public static void main(String[] args) {

        University psu = new University("PSU", "Gagarina 17", 123123123);
        Department department = new Department();
        Student student1 = new Student();
        Student student2 = new Student();

        psu.addStudent(student1, department);
        psu.addStudent(student2, department);

        System.out.println(psu.getStudentList());
        psu.removeStudent("Misha Golovin");
        System.out.println(psu.getStudentList());
        System.out.println();

        System.out.println(psu.getStudentList().get(0));
        System.out.println(psu.getStudent(213));
        System.out.println();

        psu.getDepartmentList().add(department);
        System.out.println(psu.getDepartmentList());
        psu.removeDepartment("FizraDepartment");
        System.out.println();

        System.out.println(psu.getDepartmentList());
        System.out.println();

        Instructor instructor1 = new Instructor();
    }
}