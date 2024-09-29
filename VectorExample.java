package com.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> animals = new Vector<>();

        // Add elements to the Vector
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Lion");

        // Display the Vector
        System.out.println("Original Vector: " + animals);

        // Add an element at a specific index
        animals.add(2, "Tiger");
        System.out.println("After adding Tiger at index 2: " + animals);

        // Remove an element by index
        animals.remove(1); // Removes the element at index 1
        System.out.println("After removing the element at index 1: " + animals);

        // Access an element by index
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Check if the Vector contains a specific element
        if (animals.contains("Lion")) {
            System.out.println("Lion is present in the vector.");
        } else {
            System.out.println("Lion is not present in the vector.");
        }

        // Get the size of the Vector
        System.out.println("Size of the vector: " + animals.size());

        // Iterate through the Vector using a for-each loop
        System.out.println("\nIterating through the Vector:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
