package com.controlStatementPrograms;

import javapractice.Method;

public class Factorial extends Method {

	public static void main(String[] args) {
		
		 int fact =1; 
		 int num = 5; 
		 for(int i =1;i<=num;i++) { 
			                                //while(i<=num) {
			 fact=fact*i; 
		   
		   } 
		 System.out.println(fact);
		 

		
	//// method program practice with access modifiers///
		Factorial m = new Factorial();
		//int x = 9;
		//int y =10;
		int s = m.m1(9, 10);
		System.out.println("m1 Result:: "+ s);
		
		//m.m2();      //method is private not accessible outside class.
		
		int q = m3(3, 4);    //static method does not need to create object to invoke and it is public so accessible everywhere in project.
	    System.out.println(q);
	}

}
