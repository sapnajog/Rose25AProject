package com.array;

public class ReverseEachNumberInArray {

	public static void main(String[] args) {
		int [] arr = {23,45,67,79,80,15};
		
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			int rev = 0;
			
			while(num>0) {
				int rem = num%10;
				 rev = rev*10+rem;
				num = num/10;
			}
			arr[i] = rev;
		}
		
		for(int n : arr) {
			System.out.println("rev array : " + n);
		}
        
        
	}

}
