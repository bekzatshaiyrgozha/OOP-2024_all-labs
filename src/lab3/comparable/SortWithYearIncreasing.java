package lab3.comparable;

import java.util.Comparator;

public class SortWithYearIncreasing implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}
