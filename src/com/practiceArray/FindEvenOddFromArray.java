package com.practiceArray;

import java.util.ArrayList;

public class FindEvenOddFromArray {

	public static void main(String[] args) {
		 
		int[] a = {23,67,54,24,78};
		ArrayList aleven = new ArrayList();
		ArrayList alodd = new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				//System.out.println(a[i] + " even ");
				aleven.add(a[i]);
			}else {
				//System.out.println(a[i] + " odd ");
				alodd.add(a[i]);
			}
			}
			System.out.println("even " + aleven);
			System.out.println("odd "+ alodd);
		
	}

}
