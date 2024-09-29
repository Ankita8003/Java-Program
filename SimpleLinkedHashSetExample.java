package com.HashSet;

import java.util.LinkedHashSet;

public class SimpleLinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Banana"); // Duplicate value, will not be added

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Remove an element
        linkedHashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashSet);

        // Check if an element exists
        if (linkedHashSet.contains("Cherry")) {
            System.out.println("Cherry is present in the LinkedHashSet.");
        } else {
            System.out.println("Cherry is not present in the LinkedHashSet.");
        }

        // Display the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
    }
}

