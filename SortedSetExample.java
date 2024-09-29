package com.sorted;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Create a SortedSet of integers
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Add elements to the SortedSet
        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(40);
        sortedSet.add(10); // Duplicate value, will not be added

        // Display the SortedSet
        System.out.println("SortedSet: " + sortedSet);

        // Remove an element
        sortedSet.remove(20);
        System.out.println("After removing 20: " + sortedSet);

        // Get the first and last elements
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
        
        // Display the size of the SortedSet
        System.out.println("Size of SortedSet: " + sortedSet.size());
    }
}
