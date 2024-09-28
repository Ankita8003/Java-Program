package com.QueueInterface;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.offer(15);
        
     // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
        
        // Using peek() to view the head of the queue without removing it
        System.out.println("Peek (head of the queue): " + queue.peek());
        
        // Removing elements one by one using remove()
        System.out.println("Elements removed in priority order:");{
       
        	while (!queue.isEmpty()) {
                System.out.println(queue.remove());
        	
            System.out.println(queue.poll());
        }
    }
    }
}
