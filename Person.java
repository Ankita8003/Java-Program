package com.compInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Comparator to sort persons by age
class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age; // Sorting in ascending order of age
    }
}


