package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of type String with 10 string elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        list.add("Eva");
        list.add("Frank");
        list.add("Grace");
        list.add("Hannah");
        list.add("Ivy");
        list.add("Jack");

        // Add an element to the ArrayList
        list.add("Kathy");

        // Iterate through the ArrayList using an Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        list.add(2, "Zara");

        // Remove an element from the ArrayList by value
        list.remove("Frank");

        // Remove an element from the ArrayList by index
        list.remove(4);

        // Update the element at a specific index
        list.set(3, "Laura");

        // Check if the element is present at a particular index
        System.out.println("Element at index 2: " + list.get(2));

        // Get an element at a particular index
        System.out.println("Element at index 3: " + list.get(3));

        // Find out the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Check if the given element is present in the ArrayList
        System.out.println("Is 'Alice' present? " + list.contains("Alice"));

        // Remove all elements of the ArrayList
        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}

