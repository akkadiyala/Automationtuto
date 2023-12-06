package experiments;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMethodsExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Adding a duplicate key (will overwrite the previous value)
        hashMap.put("Two", 20);

        // Accessing elements
        int valueOfTwo = hashMap.get("Two");
        System.out.println("Value of 'Two': " + valueOfTwo);

        // Removing elements
        hashMap.remove("One");

        // Querying map
        System.out.println("Size of the map: " + hashMap.size());
        System.out.println("Is the map empty? " + hashMap.isEmpty());
        System.out.println("Does the map contain key 'Two'? " + hashMap.containsKey("Two"));

        // Iteration using forEach
        System.out.println("Iterating using forEach:");
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Iteration using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
