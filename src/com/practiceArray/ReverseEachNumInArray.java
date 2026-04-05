package com.practiceArray;

public class ReverseEachNumInArray {

	public static void main(String[] args) {
		int[] a = {121,122,323,435};
	
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			int rev =0;
			int original = num;
			
			while(num>0) {
				int rem = num%10;     
				rev = rev*10+rem;    
				num = num/10;        
				
		        a[i]=rev;
			}
		        
		        if(original == rev) {
		        	System.out.println("palindrome");
		        }else {
		        	System.out.println("not palindrome");
		        }
			
		}
		for(int n : a) {
			System.out.println(n);
		
		}

	}

}
