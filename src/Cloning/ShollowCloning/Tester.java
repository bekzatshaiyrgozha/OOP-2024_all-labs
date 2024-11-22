package Cloning.ShollowCloning;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> projects = new ArrayList<>();
        projects.add("A");
        projects.add("B");
        projects.add("C");


        Adress adress = new Adress("Almaty");
        System.out.println("Adress: " + adress);
        Employee employee = new Employee("Bekzat","Shaiyrgozha",20,adress,projects);
        System.out.println("Employee: " + employee);

        System.out.println("-----------------");

        Employee employee1 = employee.clone();
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");

        employee1.name = "Almas";
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");

        employee1.adress.city = "Astana";
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");



        employee1.projects.add("K");
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");

        employee1.projects.remove("A");
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");

        employee1.projects.set(0,"S") ;
        System.out.println("Clone: " + employee1);
        System.out.println("Original: " + employee);
        System.out.println("-----------------");



    }
}
