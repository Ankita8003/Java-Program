package com.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {
    public static void main(String[] args) {
        // Create a Queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Ankita");
        queue.add("Manisha");
        queue.add("Siya");

        // Display the Queue
        System.out.println("Queue: " + queue);

        // Remove an element from the front
        String removedElement = queue.remove();
        System.out.println("Removed from front: " + removedElement);
        System.out.println("Queue after removing from front: " + queue);

        // Peek at the front element
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);
    }
}
