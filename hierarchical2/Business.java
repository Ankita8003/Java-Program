package com.hierarchical2;

public class Business {
	
	    String name;
	    String owner;

	    // Constructor for Business class
	    public Business(String name, String owner) {
	        this.name = name;
	        this.owner = owner;
	    }

	    // Method to display business details
	    public void displayBusinessDetails() {
	        System.out.println("Business Name: " + name);
	        System.out.println("Owner: " + owner);
	    }
	}


