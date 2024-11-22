package lab3.problem_4;
import java.util.Date;
import java.util.Objects;

public class Employee  extends Person implements Comparable<Employee> ,Cloneable{
    double salary;
    Date hireDate;
    String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary() {
        return salary;
    }
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return  "Employee  name " + getName() +
                " salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(hireDate, employee.hireDate) && Objects.equals(insuranceNumber, employee.insuranceNumber);
    }


    @Override
    public int compareTo(Employee employee) {
        if (this.salary < employee.salary) {
            return -1;
        }
        if (this.salary > employee.salary) {
            return 1;
        }
        return 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(salary, hireDate, insuranceNumber);
    }

    public Employee clone(){
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) this.hireDate.clone();

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }






}
