package experiments;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapVsHashtable {

    public static void main(String[] args) {
        // Using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("HashMap: " + hashMap);
        System.out.println("Value associated with 'Two': " + hashMap.get("Two"));
        System.out.println();

        // Using Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        System.out.println("Hashtable: " + hashtable);
        System.out.println("Value associated with 'Two': " + hashtable.get("Two"));
        System.out.println();

        // Attempt to add null to HashMap
        hashMap.put("NullKey", null); // Allowed in HashMap

        try {
            // Attempt to add null to Hashtable
            hashtable.put("NullKey", null); // Results in NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Hashtable does not allow null keys or values.");
        }
    }
}
