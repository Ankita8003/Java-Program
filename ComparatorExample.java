package com.compInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ankita", 23));
        persons.add(new Person("Anjali", 25));
        persons.add(new Person("Siya", 21));
        persons.add(new Person("Riya", 24));

        // Display the list before sorting
        System.out.println("Before sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }

        // Sort the list using the AgeComparator
        Collections.sort(persons, new AgeComparator());

        // Display the list after sorting
        System.out.println("\nAfter sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

    