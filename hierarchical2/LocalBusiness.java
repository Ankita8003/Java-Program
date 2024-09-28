package com.hierarchical2;

//LocalBusiness class inherits Business
class LocalBusiness extends Business {
 String location;
 String city;

 // Constructor for LocalBusiness class
 public LocalBusiness(String name, String owner, String location, String city) {
     super(name,owner);  // Calling the constructor of Business class
     this.location = location;
     this.city = city;
 }

 // Method to display local business details
 public void displayLocalBusinessDetails() {
     displayBusinessDetails();  // Calling method of Business class
     System.out.println("Location: " + location);
     System.out.println("City: " + city);
 }
}