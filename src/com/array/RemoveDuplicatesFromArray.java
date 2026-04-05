package com.array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[]arr = {1,5,3,2,88,2,4,3,4,1};
		//Arrays.sort(arr);
		//Arrays.toString(arr);
		//System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			 boolean flag = false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					//System.out.println(arr[j]);
					break;
				}
				
				}
					
				if(flag==false) {
					System.out.print(arr[i] + ",");
				}	
					
		} 

	}

}
