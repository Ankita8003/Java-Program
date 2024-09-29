package com.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to the front and back
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);

        // Display the ArrayDeque
        System.out.println("ArrayDeque: " + deque);

        // Remove an element from the front
        int frontElement = deque.removeFirst();
        System.out.println("Removed from front: " + frontElement);
        System.out.println("ArrayDeque after removing from front: " + deque);

        // Remove an element from the back
        int backElement = deque.removeLast();
        System.out.println("Removed from back: " + backElement);
        System.out.println("ArrayDeque after removing from back: " + deque);

        // Peek at the front and back elements
        System.out.println("Front element (peek): " + deque.peekFirst());
        System.out.println("Back element (peek): " + deque.peekLast());
    }
}
