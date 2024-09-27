package com.MapInterface;


import java.util.HashMap; 
import java.util.Map; 

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
       
     // Add entries to the HashMap
        hs.put(1,"Ankita");
        hs.put(2, "Jhon");
        hs.put(2, "Lisa"); 
        hs.put(3, "Bella"); 
        hs.put(4, "Ama"); 
        // hs.put(null, "Max"); 
        
        System.out.println(hs); 
        
        System.out.println(hs.get(3)); 
        System.out.println(hs.get(4)); 
        
        hs.remove(4); 
        System.out.println(hs); 
    }
}
