package com.practiceArray;

public class FactorialArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		
	    for(int i =0;i<=a.length-1;i++) {
	    	int fact = 1;
	    	for(int j=1;j<=a[i];j++)
	    	fact = fact*j;
	       
	    	System.out.println(fact);
	    }
	}

}
