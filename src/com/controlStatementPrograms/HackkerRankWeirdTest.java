package com.controlStatementPrograms;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class HackkerRankWeirdTest {
	//public class Solution {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	       System.out.println("enter a number : ");
	    	int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(N%2==0){
	           // System.out.println("even");
	            
	             if(N>=2 && N<=5){
	              System.out.println("not Weird");  
	            }else if(N>=6 && N<=20){
	                System.out.println("weird");
	            }else if(N>20){
	                System.out.println("not weird");
	            }}else{
	                System.out.println("weird");
	            }
	        

	        scanner.close();
	    }
	}



