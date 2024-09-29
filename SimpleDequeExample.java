package com.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleDequeExample {
    public static void main(String[] args) {
        // Create a Deque of strings
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back
        deque.addFirst("Ankita");
        deque.addLast("Sejal");
        deque.addFirst("Vastvikta");

        // Display the Deque
        System.out.println("Deque: " + deque);

        // Remove an element from the front
        String firstElement = deque.removeFirst();
        System.out.println("Removed from front: " + firstElement);
        System.out.println("Deque after removing from front: " + deque);

        // Remove an element from the back
        String lastElement = deque.removeLast();
        System.out.println("Removed from back: " + lastElement);
        System.out.println("Deque after removing from back: " + deque);
    }
}
