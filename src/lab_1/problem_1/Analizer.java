package lab_1.problem_1;

import java.util.Scanner;
public class Analizer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        String input;

        while (true) {
            System.out.println("Enter :");
            input = scanner.nextLine().toUpperCase();

            if (input.equals("Q")) {
                break;
            }


            double value = Double.parseDouble(input);
            data.addValue(value);
        }

        System.out.println("Maximum: " + data.getMax());
        System.out.println("Average: " + data.avg());
    }

}
