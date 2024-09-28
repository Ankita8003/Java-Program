package com.hierarchical2;

//BusinessInIndia class inherits Business
class BusinessInIndia extends Business {
 String registrationNumber;

 // Constructor for BusinessInIndia class
 public BusinessInIndia(String name, String owner, String registrationNumber) {
     super(name, owner);  // Calling the constructor of Business class
     this.registrationNumber = registrationNumber;
 }

 // Method to display details of Business in India
 public void displayIndiaBusinessDetails() {
     displayBusinessDetails();  // Calling method of Business class
     System.out.println("Registration Number (India): " + registrationNumber);
 }
}
