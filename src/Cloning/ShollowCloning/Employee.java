package Cloning.ShollowCloning;

import java.util.ArrayList;

public class Employee implements Cloneable {
    public Adress adress;
    String name;
    String surname;
    int age;
    ArrayList<String> projects;



    public Employee(String name, String surname, int age, Adress adress, ArrayList<String> projects) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.projects = projects;
    }
    protected Employee clone() {
        return new Employee(name, surname, age, adress, projects);



    }

    public String toString() {
        return name + " " + surname + " " + age + " " + adress + " " + projects;
    }
}
