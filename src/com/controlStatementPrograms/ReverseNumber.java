 package com.controlStatementPrograms;
import java.util.Scanner;

public class ReverseNumber {

	public  int reverse(int num) {
		 
	int rev = 0;
    int digit = 0;
		
	 while(num>0) {
		    	
		     digit = num%10;
		     rev = rev*10 + digit;
		     num = num/10;
		 }
		 
	 return rev; 
		
     }
	
	public static void main(String[] args) {
			
	 ReverseNumber rn = new ReverseNumber();
			
	int revNum =  rn.reverse(123456);
	 
	 System.out.println("reverse number " + revNum);
		
	}
}

