package lab_2.Problem_5;

class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age, null);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return "Employee - " + jobTitle;
    }
}
