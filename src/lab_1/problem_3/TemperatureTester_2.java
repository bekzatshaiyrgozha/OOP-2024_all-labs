package lab_1.problem_3;

import java.util.Scanner;
public class TemperatureTester_2 {
    public static void main(String [] avgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        Double temp = scanner.nextDouble();

        System.out.println("Enter C or F:");
        char sc = scanner.next().toUpperCase().charAt(0);

        Temperature_2 temperature = new Temperature_2(temp,sc);

        System.out.println(temperature.getTemperature());

        if (temperature.getScale() == 'C') {
            System.out.print("Fahrengeit: " + temperature.toForengeit(sc, sc) + "°F");
        }
        else {
            System.out.print("Celcius: " + temperature.toCelsius(sc, sc) + "°C");



        }
    }}