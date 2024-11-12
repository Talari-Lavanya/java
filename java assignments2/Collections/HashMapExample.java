package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Insert a Key-value mapping into the map
        studentMap.put(111, "Kathy");

        // Fetch the value of a Key
        System.out.println("Student with ID 103: " + studentMap.get(103));

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // Check if the given Key is in the Map
        System.out.println("Is ID 104 present? " + studentMap.containsKey(104));

        // Check if the value is in the Map
        System.out.println("Is 'Bob' present? " + studentMap.containsValue("Bob"));

        // Check if the map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // Print the size of the Map to the console
        System.out.println("Size of the Map: " + studentMap.size());

        // Print all the Keys of the map to the console
        System.out.println("All Student IDs:");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }

        // Print all the Values of the map to the console
        System.out.println("All Student Names:");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        // Remove a specific Key-value pair
        studentMap.remove(105);
        System.out.println("Map after removing ID 105: " + studentMap);

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(studentMap);
        System.out.println("New map after copying: " + newMap);
    }
}

