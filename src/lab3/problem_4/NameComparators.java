package lab3.problem_4;

import java.util.Comparator;

public class NameComparators implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

}
