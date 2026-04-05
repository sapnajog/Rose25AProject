package com.array;

public class EvenOdd {
	public static void main(String[] args) {
		int [] arr = {10,45,98,56,73,21,24,90};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i] + "is even");
			}else {
				System.out.println(arr[i] + "is odd");
			}
		}
	}

}
