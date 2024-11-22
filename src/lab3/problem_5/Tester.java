package lab3.problem_5;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate("Twix", 120.5),
                new Chocolate("Snickers", 100.0),
                new Chocolate("Mars", 150.2)
        };

        Sort.mergeSort(chocolates);
        System.out.println("Sorted Chocolates (Bubble Sort): " + Arrays.toString(chocolates));

        Time[] times = {
                new Time(10, 30, 2),
                new Time(8, 15, 5),
                new Time(12, 45, 2)
        };

        Sort.bubbleSort(times);
        System.out.println("Sorted Times (Merge Sort): " + Arrays.toString(times));
    }
}
