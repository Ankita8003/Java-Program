package com.Buffer;
public class StringBufferExample {
	   public static void main(String[] args) {
		   // Creating an instance of StringBuffer with an initial capacity of 16
		   StringBuffer sb = new StringBuffer();

		   // Append strings
		   sb.append("Hello");
		   sb.append("Ankita");

		   // Convert StringBuffer to String
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
