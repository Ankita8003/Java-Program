package com.stack;

import java.util.Stack;

public class SimpleStackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> numbers = new Stack<>();

        // Push (add) elements onto the stack
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        // Display the Stack
        System.out.println("Stack: " + numbers);

        // Peek at the top element (get the element on top without removing it)
        System.out.println("Top element (peek): " + numbers.peek());

        // Pop (remove) the top element from the stack
        numbers.pop();
        System.out.println("Stack after pop: " + numbers);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + numbers.isEmpty());
    }
}
