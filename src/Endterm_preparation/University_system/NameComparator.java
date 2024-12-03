package Endterm_preparation.University_system;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
