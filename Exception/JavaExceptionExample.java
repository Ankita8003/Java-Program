package com.Exception;

public class JavaExceptionExample {
	public static void main(String[] args) {
		
		//code which try
		try {
			int a=100/10;
			}catch(ArithmeticException e) {
				
			}
		finally {
			System.out.println("All the SQL connection is closed.");
			System.out.println("Finally block is execute.");
		}
	}

}
