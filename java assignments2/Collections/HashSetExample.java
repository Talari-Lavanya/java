package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        set.add("David");
        set.add("Eva");
        set.add("Frank");
        set.add("Grace");
        set.add("Hannah");
        set.add("Ivy");
        set.add("Jack");

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Check if the set contains a specific element
        System.out.println("Does the set contain 'Eva'? " + set.contains("Eva"));

        // Remove a specific element from the HashSet
        set.remove("Charlie");
        System.out.println("Set after removing 'Charlie': " + set);

        // Try adding a duplicate element (should not add since HashSet does not allow duplicates)
        set.add("Bob");
        System.out.println("Set after trying to add duplicate 'Bob': " + set);

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("Set after clear operation: " + set);
    }
}

