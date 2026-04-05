package com.array;

public class Ascendingorder {

	public static void main(String[] args) {
		int [] arr = {22,45,34,67,45,89,90,76};
		
		
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
		  			int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
		  }
			}
		
		for(int asc:arr) {
			System.out.print(asc + "," );
		}
	}

}

