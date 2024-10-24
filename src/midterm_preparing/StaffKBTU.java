package midterm_preparing;

public class StaffKBTU extends Person{
    private double salary;
    public StaffKBTU(String name, int age, double salary) {
        super(name,age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "Salary: " + salary;
    }
}