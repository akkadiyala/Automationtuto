package experiments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethodsExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("One");
        set.add("Two");
        set.add("Three");

        // Adding a duplicate element (will be ignored)
        set.add("Two");

        // Accessing elements (not directly supported in Set)

        // Removing elements
        set.remove("One");

        // Querying set
        System.out.println("Size of the set: " + set.size());
        System.out.println("Is the set empty? " + set.isEmpty());
        System.out.println("Does the set contain 'Two'? " + set.contains("Two"));

        // Iteration using forEach
        System.out.println("Iterating using forEach:");
        set.forEach(System.out::println);
        for (String element : set) {
            System.out.println(element);

        }
    }
}
