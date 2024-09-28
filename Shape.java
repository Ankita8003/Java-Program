package com.abstraction;

//Abstract class shape
abstract class Shape {

 // Abstract method for area calculation
 abstract void area();

 // Non-abstract method
 public void msg() {
     System.out.println("This is a shape.");
 }
}