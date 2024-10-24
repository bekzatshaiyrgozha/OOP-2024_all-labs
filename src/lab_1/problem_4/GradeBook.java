package lab_1.problem_4;

import practice_2.Student;
import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to course: " + course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void display() {
        double lower_point = 101;
        double higher_point = -1;
        String student_HP = "";
        String student_LP = "";
        double avg;
        double grade_sum = 0;
        int counter = 0;
        int[] grades = new int[11];

        for (Student student : students) {
            double grade = student.getGrade();
            if (grade > higher_point) {
                higher_point = grade;
                student_HP = student.getName();
            }
            if (grade < lower_point) {
                lower_point = grade;
                student_LP = student.getName();
            }
            grade_sum += grade;
            counter++;

            grades[(int) grade / 10]++;
        }

        if (counter > 0) {
            avg = grade_sum / counter;
            System.out.println("Highest point: " + student_HP + " " + higher_point +
                    " Lowest point: " + student_LP + " " + lower_point +
                    " Average: " + avg);

        }



        for(int i=0;i<grades.length;i++) {
            int lower = i*10;
            int upper = i*10+10;

            System.out.println(lower+"-"+upper+":");
            for(int j=0 ;j<grades[i];j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
