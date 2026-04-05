package com.exception;

public class Test {
	
	static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("you are not eligible.");
		}else {
			System.out.println("you are eligible.");
			}
	}
   public static void main(String[] args) {
	  try {
		  validateAge(16);
	  }catch(InvalidAgeException e) {
		  System.out.println(e.getMessage());
	  }
	 }
   }

