package practice_3;

import java.util.Scanner;

public class Animals {
    String name;
    String color;
    String breed;
    int age;

    public Animals(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }


   /* public void displayInfo(String info) {
        System.out.println("Additional info about dog:" + info);
    }*/

    public static class Dog extends Animals {
        public Dog(String name, String color, String breed, int age) {
            super(name, color, breed, age);

        }

        public void displayInfo() {
            System.out.println("Dog's information:");
            super.displayInfo();
        }
        public void displayInfo(String info) {
            System.out.println("bhsbd cb");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of dogs:");
        int dogNumber = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < dogNumber; i++) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter color:");
            String color = scanner.nextLine();

            System.out.println("Enter breed:");
            String breed = scanner.nextLine();

            System.out.println("Enter age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Addition info about dog:");
            String info = scanner.nextLine();

            Dog dog = new Dog(name, color, breed, age);
            dog.displayInfo();
            dog.displayInfo(info);


        }

    }
}
