package lab_1.problem_2;

import java.util.Scanner;

public class MacbookTester {
    public static void main(String [] avgs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Macbook:");
        int numberMac = scanner.nextInt();
        scanner.nextLine();

        Macbook[] macbooks = new Macbook[numberMac];

        for(int i=0;i<numberMac;i++) {
            System.out.println("Enter model:");
            String model = scanner.nextLine().toUpperCase();

            System.out.println("Enter year:");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter type macbook:");
            MacbookType type = MacbookType.valueOf(scanner.nextLine().toUpperCase());

            macbooks[i] = new Macbook(model, type, year);
        }
        for(Macbook macs :macbooks) {
            macs.displayDetails();
            System.out.println();
        }

        System.out.println("Total macbook:" + Macbook.getTotalMacbooks());

    }
}
