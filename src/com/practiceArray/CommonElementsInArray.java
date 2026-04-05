package com.practiceArray;

import java.util.ArrayList;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,6,7,8,9};
		int[] a2 = {4,5,3,6,7,8,5,0};
		
		ArrayList common = new ArrayList();
		
		for(int i=0;i<=a1.length-1;i++) {
			boolean flag = false;
			for(int j=0;j<=a2.length-1;j++) {
				if(a1[i]==a2[j]) {
					//System.out.println(a1[i]);
					flag = true;
					 //break;
					common.add(a1[i]);
					
					// break;
				}
				
				
			}
			
			if(flag==false) {
				System.out.println(a1[i]);
				
			}
		}
		
		System.out.println("commom elements are : " + common);
	}

}
