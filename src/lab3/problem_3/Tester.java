package lab3.problem_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Tester {
    public static void main(String[] args) {
        MyCollection<String> myList = new List<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Apple");

        System.out.println("First list: " + myList);
        System.out.println("Size: " + myList.size());

        System.out.println("Removing 'Apple'...");
        myList.remove("Apple");
        System.out.println(myList);

        System.out.println("Contains 'Apple': " + myList.contains("Apple"));

        System.out.println("Clearing the list...");
        myList.clear();
        System.out.println(myList);

        System.out.println("Is list empty? " + myList.isEmpty());

        myList.add("Apple");
        myList.add("Banana");
        System.out.println("After adding elements: " + myList);



        MyCollection<String> mySet = new Set<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Apple");

        System.out.println("Set: " + mySet);
    }
}
