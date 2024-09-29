package com.treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("papya");
        treeSet.add("Banana"); // Duplicate value, will not be added

        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Remove an element
        treeSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + treeSet);

        // Get the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Display the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}
