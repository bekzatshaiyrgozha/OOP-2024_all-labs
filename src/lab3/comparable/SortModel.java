package lab3.comparable;

import java.util.Comparator;

public class SortModel implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());

    }
}
