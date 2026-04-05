package com.controlStatementPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in); System.out.println("enter digits : ");
		  int digit = sc.nextInt(); int sum = 0;
		  
		  while(digit>0) { 
			  int rem = digit%10; 
			  sum = sum+rem; 
			  digit = digit/10;
		  
		  }
		 
		
		
		
		System.out.println("sum of digits "+ sum);

	}

}
