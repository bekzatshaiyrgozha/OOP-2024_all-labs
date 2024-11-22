package lab3.problem_4;

import java.util.Objects;
import java.util.Vector;
import java.util.Date;

public class Manager extends Employee {
    double bonus;
    Vector<Employee> employees;
    public Manager(String name,double salary, Date hireDate, String insuranceNumber, double bonus, Vector<Employee> employees) {
        super(name,salary,hireDate,insuranceNumber);
        this.bonus = bonus;
        this.employees = new Vector<>();

    }
    public double getBonus() {
        return bonus;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    public Vector<Employee> getEmployees() {
        return employees;
    }


    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus + ", employees=" + employees;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(bonus, manager.bonus) == 0 && Objects.equals(employees, manager.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus, employees);
    }

    @Override
    public int compareTo(Employee employee) {
        int salaryComparison = super.compareTo(employee);
        if (salaryComparison == 0 && employee instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) employee).bonus);
        }
        return salaryComparison;
    }

    public Manager clone() {
        Manager manager = (Manager) super.clone();
        manager.employees = new Vector<>();
        for (Employee employee : employees) {
            manager.employees.add(employee.clone());

        }
        return manager;
    }
}
