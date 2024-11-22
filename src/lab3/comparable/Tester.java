package lab3.comparable;

import lab3.problem_3.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<Car>();
        list.add(new Car(2022,"mers"));
        list.add(new Car(2025,"bmw"));
        list.add(new Car(2023,"zeekre"));
        list.add(new Car(2019,"porsh"));



        list.sort(new SortModel());



        for(Car car : list){
            System.out.println(car.getModel() + " " + car.getYear());
        }
        
    }
}
