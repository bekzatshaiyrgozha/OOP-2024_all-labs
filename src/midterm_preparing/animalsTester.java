package midterm_preparing;

import java.util.Scanner;

public class animalsTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of the animal:");
        String name = keyboard.nextLine();

        System.out.println("Enter the age of the animal:");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the gender of the animal:");
        String gender = keyboard.nextLine();

        System.out.println("Enter the breed of the animal:");
        String breed = keyboard.nextLine();

        Dog dog = new Dog(name, age, gender,breed);

        System.out.println(dog);

        dog.eat();
    }
}