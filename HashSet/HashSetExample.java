package com.HashSet;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		 // Create a HashSet of Strings
        HashSet<String> books = new HashSet<>();
        
        //adding elements to hashSet
        books.add("java");
        books.add("python");
        books.add("dbms");
        books.add("c++");
        books.add("networks");
        
        // Displaying the HashSet
        System.out.println("HashSet:"+books);
        
         // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + books.size());

     // Removing an element from the HashSet
        books.remove("c++");
        System.out.println("After removing 'c++':"+books);
        	
	}

}
