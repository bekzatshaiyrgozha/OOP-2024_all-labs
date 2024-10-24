package lab_1.problem_5;

import java.util.Scanner;
import java.util.Vector;

public class DragonLaunchTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DragonLaunch dragonLaunch = new DragonLaunch();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter gender " + (i + 1) + ": ");
            String genderInput = scanner.next().toUpperCase();


            if (genderInput.equals("G")) {
                dragonLaunch.kinap(new Person(Gender.GIRL));
            } else {
                System.out.println("Enter again");
                i--;
            }
        }

        if (dragonLaunch.DragonWiilEat()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("The dragon won't eat !");
        }

    }
}