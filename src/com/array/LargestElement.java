package com.array;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {11,23,67,45,34,87};
		int max = arr[0];
		for (int i =0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
				}
		}
				System.out.println("largest number : " + max);
				
			
		}
		

	}


