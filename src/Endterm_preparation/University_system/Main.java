package Endterm_preparation.University_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User teacher = new Teacher("Asylzhan","asylzhan@kbtu.kz","23B031483","OOP");
        User student = new Student("Bekzat","b_shaiyrgozha@kbtu.kz","23B031482","IT");

        System.out.println(teacher.toString());
        System.out.println(student.toString());

        ArrayList<Student> students = new ArrayList<>();




    }
}
