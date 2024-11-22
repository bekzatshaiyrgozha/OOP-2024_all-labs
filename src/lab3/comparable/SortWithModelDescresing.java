package lab3.comparable;

import java.util.Comparator;

public class SortWithModelDescresing implements Comparator<Car> {
    public int compare(Car o2, Car o1) {
        return o1.getModel().compareTo(o2.getModel());

    }
}
