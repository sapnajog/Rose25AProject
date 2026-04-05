package com.exception;

public class UserDefinedExcetion {


	public static void main(String[] args)throws AgeException {
		int age=13;
		if(age>=18) {
			System.out.println("you are eligible for voting");
		}else {
			throw new AgeException("you are not eligible to vote");
		}
		
	

}

//public void check(int age) throws AgeException {
    //if (age < 18) {
       // throw new AgeException("Age must be 18+");
    }
