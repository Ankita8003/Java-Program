package com.Array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertSetIntoArrayListString {
    public static void main(String[] args) {
        
        // Declaration of a HashSet with Strings
        HashSet<String> h1 = new HashSet<>();
        h1.add("Banana");
        h1.add("Apple");
        h1.add("Mango");
        h1.add("Peach");
        h1.add("Orange");
        System.out.println("Set = " + h1);
        
        // Convert HashSet to ArrayList
        ArrayList<String> a1 = new ArrayList<>(h1);
        System.out.println("ArrayList = " + a1);
        
        // Adding more elements to the ArrayList
        a1.add("Grapes");
        a1.add("Apple");  // Duplicate element to demonstrate ArrayList can hold duplicates
        
        // Sort the ArrayList
        Collections.sort(a1);
        System.out.println("After sorting = " + a1);
    }
}
