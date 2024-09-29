package com.Builder;

public class StringBuilderExample {
	   public static void main(String[] args) {
		   // Creating an instance of StringBuilder with an initial capacity of 16
		   StringBuilder sb = new StringBuilder();

		   // Append strings
		   sb.append("Hii");
		   sb.append("Ankita");

		   // Convert StringBuilder to String
		   String msg = sb.toString();

		   // Print the result
		   System.out.println(msg);
		   
		   // Demonstrating other methods
		   sb.insert(5, " "); // Insert a space after "Hello"
		   System.out.println("After insert: " + sb);

		   sb.delete(5, 6); // Delete the inserted space
		   System.out.println("After delete: " + sb);

		   sb.reverse(); // Reverse the string
		   System.out.println("After reverse: " + sb);
	   }
	}

