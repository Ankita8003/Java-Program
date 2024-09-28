package com.abstraction;

public class SimpleCalculator implements Calculator{

	@Override
	public void add(double a, double b) {
		System.out.println("Addition: " + (a+b));
		
	}

	@Override
	public void subtract(double a, double b) {
		System.out.println("Subtraction: " + (a-b));
		
	}

	@Override
	public void multiply(double a, double b) {
		 System.out.println("Multiplication: " + (a * b));
    }
		
	

	@Override
	public void divide(double a, double b) {
		
		 if (b != 0) {
	            System.out.println("Division: " + (a / b));
	        } else {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	}
		 public static void main(String[] args) {
		        // Create an instance of SimpleCalculator
		        SimpleCalculator calculator = new SimpleCalculator();

		        // Perform calculations
		        calculator.add(10, 52);         // Addition
		        calculator.subtract(10, 5);    // Subtraction
		        calculator.multiply(10, 5);    // Multiplication
		        calculator.divide(10, 5);      // Division
		        calculator.divide(10, 55);      // Division by zero (error)
		    
		
	}
}
