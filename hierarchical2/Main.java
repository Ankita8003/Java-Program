package com.hierarchical2;

public class Main {
 public static void main(String[] args) {
     // Create BusinessInIndia object
     BusinessInIndia indianBusiness = new BusinessInIndia("Tech Solutions", "Rahul Sharma", "IN-456789");
     System.out.println("Business in India Details:");
     indianBusiness.displayBusinessDetails();

     // Create LocalBusiness object
     LocalBusiness localBusiness = new LocalBusiness("SuperMart", "Priya Mehta", "Sector-22", "Mumbai");
     System.out.println("\nLocal Business Details:");
     localBusiness.displayLocalBusinessDetails();
 }
}