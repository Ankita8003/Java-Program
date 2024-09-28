package com.abstraction;

//Circle class inheriting Shape
public class Circle extends Shape {

 // Field for radius of the circle
 double radius;

 // Constructor to initialize the radius
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implement the abstract method to calculate area
 @Override
 void area() {
     double area = Math.PI * radius * radius;
     System.out.println("The area of the circle is: " + area);
 }
 public static void main(String[] args) {
     // Create a Circle object
     Circle circle = new Circle(2);

     // Call the implemented methods
     circle.area();   // Call the area method
     circle.msg();    // Call the msg method from the abstract class
 }
}
