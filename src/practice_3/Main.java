package practice_3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add a new person");
            System.out.println("2. Print all persons");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Add: 1 for Person, 2 for Student, 3 for Staff");
                int type = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter address: ");
                String address = scanner.nextLine();

                if (type == 1) {
                    persons.add(new Person(name, address));
                } else if (type == 2) {
                    System.out.print("Enter program: ");
                    String program = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter fee: ");
                    double fee = scanner.nextDouble();
                    scanner.nextLine();
                    persons.add(new Student(name, address, program, year, fee));
                } else if (type == 3) {
                    System.out.print("Enter school: ");
                    String school = scanner.nextLine();
                    System.out.print("Enter pay: ");
                    double pay = scanner.nextDouble();
                    scanner.nextLine();
                    persons.add(new Staff(name, address, school, pay));
                } else {
                    System.out.println("Invalid option");
                }
            } else if (choice == 2) {
                System.out.println("All persons:");
                for (Person person : persons) {
                    System.out.println(person);
                }
            } else if (choice == 3) {
                exit = true;
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}