package com.exception;

public class ArithmaticException {

	public static void main(String[] args) {
		try{ 
			int n = 12/0;
		}
		catch(Exception e){
			System.out.println(" Cannot Divide by zero");
			
		}
		finally {
			System.out.println("Finally block always executes.");
		}
	}
	
		//System.out.println();

	}


