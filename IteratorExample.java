package com.iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Ankita");
        names.add("Monika");
        names.add("Riya");
        names.add("Siya");

        // Get the iterator
        Iterator<String> iterator = names.iterator();

        // Traverse the ArrayList using the iterator
        System.out.println("Using Iterator to display names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
