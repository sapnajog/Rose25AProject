package com.array;

public class ReverseArray {

	public static void main(String[] args) {
		/*int []arr = {10,20,30,40,50};
		int []rev = new int[5];
		
		for(int i =arr.length - 1,j=0;i>=0;i--,j++) {
		rev[j]=arr[i];
		}
		for(int n : rev) {
			System.out.println("reversed " + n);*/
			
		
		
		int[] arr = {33,44,55,66,77,88};
		int [] revArr = new int[6];
		
		for(int i= arr.length-1,j=0;i>=0;i--,j++) {
			revArr[j]=arr[i];
			
		}
		for(int n : revArr) {
			System.out.println(n);
		}
		 }

	}


