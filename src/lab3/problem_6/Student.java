package lab3.problem_6;

public class Student extends Person {
    String major;
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = this.major;
    }
    public String getOccupation() {
        return this.major;
    }
}
