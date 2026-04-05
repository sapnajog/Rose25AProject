package com.practiceArray;

public class MaximumNumber {

	public static void main(String[] args) {
		int [] arr = {134,675,789,543,765};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
			System.out.println(max);
		

	}

}
