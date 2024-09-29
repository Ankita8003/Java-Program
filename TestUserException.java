package com.UserDefineException;

public class TestUserException {
	public static void validAge(int age)throws UserException{
		if(age<=18) {
			//throws
			throw new UserException("Person is not valid.");
		}
		else {
			System.out.println("Welcome to vote.");
		}
	}
	
	public static void main(String[] args) {
		try {
			validAge(17);
		}catch (UserException e) {
			System.out.println("Exception occured");
		}
	}

}
