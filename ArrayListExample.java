package com.Array;

import java.util.ArrayList;


public class ArrayListExample {
	public static void main(String[] args) {
		
		//declare ArrayList with Object type to allow heterogeneous data
		 ArrayList<Object> a1 = new ArrayList<>();
		
		//add heterogeneous data
		    a1.add(100);          // Integer
	        a1.add('c');         // Character
	        a1.add(true);        // Boolean
	        a1.add(2.5);         // Double
	        a1.add(null);        // Null value
	        a1.add("hello");     // String
	      
	     // Print the ArrayList
		System.out.println(a1);
		
		//Size
		System.out.println("Size of list="+a1.size());
		
		 // Remove the element at index 2
        a1.remove(2);
        System.out.println("After removing element at index 2: " + a1);
		
		//Retrieval
        System.out.println(a1.get(4));
        
        //replace
        a1.set(3, "wellcome");
        System.out.println(a1);
        System.out.println(a1.contains("java"));
		
	}
	

}
