package com.controlStatementPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int i = 2;
		boolean isPrime =true;
		
		
		while(i<=num/2) {
			if(num%i==0) {
			isPrime = false;
			break ;
			}	
			i++;
		}
		if(num<=1) {
			System.out.println(num + "is not prime");
		}else if(isPrime) {
			System.out.println(num + "is prime.");
		}else {
			System.out.println(num + "is not prime.");
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}

	}


