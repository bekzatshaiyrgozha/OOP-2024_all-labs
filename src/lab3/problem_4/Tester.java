package lab3.problem_4;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Tester {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        employees.add(new Employee("Bekzat", 100000, new Date(2022 - 1900, 3, 23), "1"));
        employees.add(new Employee("Bob", 20000, new Date(2019 - 1900, 2, 15), "2"));
        employees.add(new Employee("Arman", 300000, new Date(2018 - 1900, 6, 11), "3"));

        Vector<Employee> team1 = new Vector<>();
        team1.add(employees.get(0));
        team1.add(employees.get(1));

        Vector<Employee> team2 = new Vector<>();
        team2.add(employees.get(2));

        Manager manager1 = new Manager("Alice", 90000, new Date(110, 5, 1), "INS001", 5000, team1);
        Manager manager2 = new Manager("Bob", 85000, new Date(111, 7, 12), "INS002", 7000, team2);

        Vector<Employee> allEmployees = new Vector<>();
        allEmployees.addAll(employees);
        allEmployees.add(manager1);
        allEmployees.add(manager2);

        Collections.sort(allEmployees);
        System.out.println("Employees and Managers sorted by salary:");
        for (Employee e : allEmployees) {
            System.out.println(e);
        }


        allEmployees.sort(new HireDateComparator());
        System.out.println("\nEmployees and Managers sorted by hire date:");
        for (Employee e : allEmployees) {
            System.out.println(e);
        }

        System.out.println("\nTesting clone:");
        Employee clonedEmployee = employees.get(0).clone();
        System.out.println("Cloned Employee: " + clonedEmployee);

        Manager clonedManager = manager1.clone();
        System.out.println("Cloned Manager: " + clonedManager);

        clonedEmployee.setHireDate(new Date(124, 5, 1));
        clonedManager.setHireDate(new Date(2020, 5, 1));
        clonedEmployee.setName("Kumar");
        System.out.println("\nOriginal Employee: " + employees.get(0));
        System.out.println("Modified Cloned Employee: " + clonedEmployee);
        System.out.println("\nOriginal Employee: " + employees.get(0));





    }
}
