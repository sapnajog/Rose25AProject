package com.practiceArray;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {23,45,45,65,67};
        //int[] rev = {};
		
		
		 int i = 0,j=arr.length-1; 
		 
		 while(i<j) { 
			 
			 int n = arr[i]; 
			 
			 arr[i] = arr[j];
		 
			 arr[j] = n;
		  
		      i++; j--; }
		  
		  for(int revArr : arr) {
		  
		  System.out.print(revArr + " "); 
		  }
		 
	
		/*
		 * for(int i =arr.length-1;i>=0;i--) {
		 * 
		 * System.out.print(arr[i] + " ");
		 * 
		 * }
		 */

	}
}
