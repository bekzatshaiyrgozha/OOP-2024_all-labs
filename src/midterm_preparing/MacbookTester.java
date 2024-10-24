package midterm_preparing;

import java.util.Scanner;


public class MacbookTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Macbook Pro Explorer!");
        System.out.println("Name Macbbok:");
        String name = keyboard.nextLine();
        System.out.println("Color Macbbok:");
        String color = keyboard.nextLine();
        System.out.println("Type Macbook:");
        MacbookType type = MacbookType.valueOf(keyboard.nextLine());
        Macbook macbook1 = new Macbook(name, color, type);

        System.out.println(macbook1);

    }
}
