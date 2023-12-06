package experiments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodsExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Adding elements at a specific index
        list.add(1, "New Two");

        // Adding a collection of elements
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Four");
        anotherList.add("Five");
        list.addAll(anotherList);

        // Accessing elements
        System.out.println("Element at index 0: " + list.get(0));

        // Updating elements
        list.set(1, "Updated Two");

        // Removing elements
        list.remove("One");
        list.remove(2);

        // Querying list
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does the list contain 'Updated Two'? " + list.contains("Updated Two"));

        // Iteration using forEach
        System.out.println("Iterating using forEach:");
        list.forEach(System.out::println);
        for (String element : list) {
            System.out.println(element);

}
    }    
}

