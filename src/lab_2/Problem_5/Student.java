package lab_2.Problem_5;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age, null);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student - Major: " + major;
    }
}