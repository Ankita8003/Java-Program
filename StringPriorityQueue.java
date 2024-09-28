package com.QueueInterface;

import java.util.PriorityQueue;

public class StringPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of strings
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Adding elements using offer() method
        queue.offer("Banana");
        queue.offer("Apple");
        queue.offer("Mango");
        queue.offer("Orange");

        // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue: " + queue);

        // Using peek() 
        System.out.println("Peek (head of the queue): " + queue.peek());


        // Removing elements one by one using poll()
        System.out.println("Elements removed using poll():");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
