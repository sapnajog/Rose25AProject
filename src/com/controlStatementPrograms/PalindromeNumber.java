package com.controlStatementPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		//int num = 121;
		
		int original = num;
		
		while(num>0) {
			int reminder = num%10;
			rev=(rev*10)+reminder;
			num = num/10;
		}
        if(rev==original) {
        	System.out.println(original +" is palindrome.");
        	
        }else {
        	System.out.println(original + " is not palindrome.");
        }
        	
	}

 }
