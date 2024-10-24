package midterm_preparing;

import java.util.Scanner;
import java.time.LocalDate;
public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius:");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Radius is "+Main.getRadius(a));

        System.out.println("Enter the area:");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Area is" + Main.getArea(b));

        LocalDate data = LocalDate.now();
        System.out.println("Date is " + data);


    }
}
