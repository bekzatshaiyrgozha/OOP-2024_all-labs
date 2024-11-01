package Bonus_Task_2;

import java.util.Scanner;

public class FindTheSpy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age for " + name + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter gender for " + name + " (Male/Female): ");
            String gender = scanner.nextLine();
            System.out.print("Enter education for " + name + ": ");
            String education = scanner.nextLine();
            Spy spy = new Spy(name, age, gender, education);
            if (spy.isSpy()){
                people[i] =new  Spy(name, age, gender, education);
            }else{
                people[i] = new Person(name, age, gender, education);
            }

        }

        System.out.print("Detective name: ");
        String detectiveName = scanner.nextLine();
        System.out.print("Detective age: ");
        int detectiveAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Detective gender (Male/Female): ");
        String detectiveGender = scanner.nextLine();
        System.out.print("Detective education: ");
        String detectiveEducation = scanner.nextLine();
        System.out.print("Detective qualification (Beginner/Expert): ");
        String qualification = scanner.nextLine();

        Detective detective = new Detective(detectiveName, detectiveAge, detectiveGender, detectiveEducation, qualification);

        System.out.println("\nDetective's Report:");
        for (Person person : people) {
            if (person instanceof Spy) {
                detective.detectSpyStatus((Spy) person);
            }
        }

    }
}
