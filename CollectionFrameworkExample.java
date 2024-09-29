package com.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Using ArrayList (List Interface) to store elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element

        // Display elements of ArrayList
        System.out.println("ArrayList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using HashSet (Set Interface) to store elements
        Set<String> uniqueFruits = new HashSet<>(fruits); // HashSet removes duplicates

        // Display elements of HashSet
        System.out.println("\nHashSet Elements (Unique):");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }
    }
}
