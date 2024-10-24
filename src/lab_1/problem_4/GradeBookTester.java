package lab_1.problem_4;

import java.util.Scanner;
import practice_2.Student;

public class GradeBookTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();
        System.out.println("Please, input grades for students (name id grade):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = scanner.next();
            int id = scanner.nextInt();
            double grade = scanner.nextDouble();
            gradeBook.addStudent(new Student(name, id, grade));
        }

        gradeBook.display();
    }
}
