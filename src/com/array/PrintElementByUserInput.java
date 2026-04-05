package com.array;

import java.util.Scanner;

public class PrintElementByUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter 5 numbers : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
       System.out.println("you entered :");
       for(int x : arr) {
    	   System.out.println(x);
       }
	}

}
